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
      //�̸� ������ conn��ü��.. maxconn ��������ŭ 
      //  ����ö�� 999(Connection) �뿩 
      private Vector<Connection> buffer = new Vector<>();
      
      
      static
      {
         try
         {
            initConnPool(); // ȣ���� �ȵǴ��� 
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
         
         Vector temp = ConnPool.getConnPool().getConnPoolBuffer(); // Ŀ�ؼ� Ǯ�� �޾ƿͼ� buffer�� �־����
         //Ŀ�ؼ� ����
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
      
      // �뿩 
      public synchronized Connection getConnection() throws InterruptedException{
         
         while( buffer.size()==0 ) {
            this.wait(); // ��ü �� �뿩�ϰ� ������ ������ �� �����忡�� sleep ��Ų��. 
         }
         Connection conn = (Connection) this.buffer.remove(buffer.size()-1);
         System.out.println("Connection �뿩 getConnection()" + conn);
         return conn;
      }
      
      //�ݳ�
      public synchronized void releaseConnection(Connection conn) {
         this.buffer.addElement(conn);
         System.out.println("Connection ��ȯ releaseConnection()" + conn);
         this.notifyAll(); // �����ڿ� ����ϰ� �ִ� �����忡  ��ü ��ٸ��� ������ �˷����
      }
      
      private Vector getConnPoolBuffer() {
         return this.buffer;
      }
   
}