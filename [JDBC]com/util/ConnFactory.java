package com.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnFactory {

	// Connection 생성과 관련된 설정값...( 연결 문자열 == ConnectionString )
	private static int maxconn =0; //커넥션 객체 최대연결 
	private static String url = null;
	private static String driver = null;
	private static String user = null;
	private static String password = null;
	//외부에서 접근 불가 , 프로그램 시작과 동시에 만들어짐 -> connFactory객체가 시작과 동시에 시작  
	private static ConnFactory connFactory = new ConnFactory();
	
	//static 멤버를 초기화 함. 객체 생성되기전
	static {
		try {
			loadProperties(".\\src\\days06\\jdbc.properties");
		} catch (Exception e) {
			System.out.println("jdbc.properties.....");
			e.printStackTrace();
		}	
	}
	
	
	//싱글톤
	private ConnFactory() {}; //(new 생성자로 객체생성 못한다!!!!) private
	public static ConnFactory getDefaultFactory() {
		if(connFactory == null) {
			connFactory = new ConnFactory();
		}

		return connFactory;
	}

	//커넥션 객체 만들어서 반환 
	public Connection createConnection() throws SQLException, ClassNotFoundException{
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, user,password);

		return conn;

	}

	private static void loadProperties(String filename)throws IOException {
		Properties p = new Properties();
		FileInputStream in = new FileInputStream(filename);
		p.load(in);
		in.close();
		url = p.getProperty("url");
		driver = p.getProperty("driver");
		user = p.getProperty("user");
		password = p.getProperty("password");
		maxconn = Integer.parseInt(p.getProperty("maxconn"));

	}
	public static int getMaxConn() {
		return maxconn;
	}
}
