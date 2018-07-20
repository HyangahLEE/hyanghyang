package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// 싱글콘 ( SingleTon ) -디비연결하는 객체 하나면 됨
public class DBConn {

	//디비연동을 위해서 connection객체 사용
	private static Connection connection = null;
	private DBConn() {}


	//1
	public static Connection getConnection() {
		if ( connection == null  ) {


			String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
			String userid = "scott";
			String password = "tiger";
			//ojdbc6.jar인식 못하면 .뒤에 객체 안나옴 ~
			//oracle.jdbc.driver.OracleDriver - 대소문자 구분!!
			try {

				Class.forName("oracle.jdbc.driver.OracleDriver");
				connection = DriverManager.getConnection(url, userid, password); //연결객체 얻어오기
				/*System.out.println( connection ); //화면에 받아온 커넥션객체 출력
				connection.close(); //디비연결 끊기
*/
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}//if


		return connection;

	}//getConnection


	//2
	public static Connection getConnection(String url, String userid, String password) {

		if ( connection == null  ) {

			try {

				Class.forName("oracle.jdbc.driver.OracleDriver");
				connection = DriverManager.getConnection(url, userid, password); //연결객체 얻어오기
				//System.out.println( connection ); //화면에 받아온 커넥션객체 출력
				//connection.close(); //디비연결 끊기

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}//if

		return connection;
	}



	public static void close()	{
		if( connection != null)		{
			try			{
				if (! connection.isClosed() )	{
					connection.close();
				}
			} 
			catch (SQLException e)			{
				e.printStackTrace();
			}
			connection = null;
		}// if
	}
}// DBConn
