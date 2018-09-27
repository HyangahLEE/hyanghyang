package com.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnFactory {

	// Connection ������ ���õ� ������...( ���� ���ڿ� == ConnectionString )
	private static int maxconn =0; //Ŀ�ؼ� ��ü �ִ뿬�� 
	private static String url = null;
	private static String driver = null;
	private static String user = null;
	private static String password = null;
	//�ܺο��� ���� �Ұ� , ���α׷� ���۰� ���ÿ� ������� -> connFactory��ü�� ���۰� ���ÿ� ����  
	private static ConnFactory connFactory = new ConnFactory();
	
	//static ����� �ʱ�ȭ ��. ��ü �����Ǳ���
	static {
		try {
			loadProperties(".\\src\\days06\\jdbc.properties");
		} catch (Exception e) {
			System.out.println("jdbc.properties.....");
			e.printStackTrace();
		}	
	}
	
	
	//�̱���
	private ConnFactory() {}; //(�ۿ��� new �����ڷ� ��ü���� ���Ѵ�!!!!) private
	public static ConnFactory getDefaultFactory() {
		if(connFactory == null) {
			connFactory = new ConnFactory();
		}

		return connFactory;
	}

	//Ŀ�ؼ� ��ü ���� ��ȯ 
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
