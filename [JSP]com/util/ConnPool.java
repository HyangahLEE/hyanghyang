package com.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.Vector;

public class ConnPool {
   
      private static ConnPool connPool = new ConnPool();
      private ConnPool() {}
      public static ConnPool getConnPool() {
          
          if ( connPool == null) {
             connPool = new ConnPool();
          }
          return connPool;
       }
      //미리 생성된 conn객체를.. maxconn 설정값만큼 
      //  은하철도 999(Connection) 대여 
      private Vector<Connection> buffer = new Vector<>();
      
      
      static
      {
         try
         {
            initConnPool(); // 호출이 안되더라도 
         } catch (SQLException e) {
            System.out.println("---Connection Create Error---");
            e.printStackTrace();
         }catch (ClassNotFoundException e2) {
            System.out.println("---Driver Class Not Found Error---");
            e2.printStackTrace();
         }
     
      }
     

      
      private static void initConnPool() throws SQLException, ClassNotFoundException{
         destroyConnPool();
         
         Vector temp = ConnPool.getConnPool().getConnPoolBuffer(); // 커넥션 풀을 받아와서 buffer에 넣어놔라
         //커넥션 공장
         ConnFactory factory = ConnFactory.getDefaultFactory();
         
         for (int i = 0; i < factory.getMaxConn(); i++) {
            Connection conn = factory.createConnection();
            temp.addElement(conn);
            System.out.println("New Connection Created...." + conn);
         }
         
      }

    
      private synchronized static void destroyConnPool() {
         Vector temp = ConnPool.getConnPool().getConnPoolBuffer();
         Enumeration en = temp.elements();
         
         while (en.hasMoreElements())
         {
            Connection conn = (Connection) en.nextElement();
            
            if ( conn!= null ) 
            {
               try
               {
                  conn.close();
                  System.out.println("Connection Closed...." + conn);
               } catch (Exception e) {
                  e.printStackTrace();
               }
            }//if
            
         }//while
         
      }//destroyConnPool()
      
      // 대여 
      public synchronized Connection getConnection() throws InterruptedException{
         
         while( buffer.size()==0 ) {
            this.wait(); // 객체 다 대여하고 있으면 빌리러 온 스레드에게 sleep 시킨다. 
         }
         Connection conn = (Connection) this.buffer.remove(buffer.size()-1);
         System.out.println("Connection 대여 getConnection()" + conn);
         return conn;
      }
      
      //반납
      public synchronized void releaseConnection(Connection conn) {
         this.buffer.addElement(conn);
         System.out.println("Connection 반환 releaseConnection()" + conn);
         this.notifyAll(); // 공유자원 대기하고 있는 스레드에  객체 기다리고 있으면 알려줘라
      }
      
      private Vector getConnPoolBuffer() {
         return this.buffer;
      }
   
}