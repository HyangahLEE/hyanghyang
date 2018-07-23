package days06;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

import com.util.DBConn;

public class Ex06 {

	public static void main(String[] args) {
		// ResultSet �� ������� ���� ������ ������...
		String sql = " select rownum no, table_name from tabs ";
		Connection con = null;
		PreparedStatement pstmt =null;
		ResultSet rs = null;
		int cnt = 0;

		try {
			con = DBConn.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			// 
			while (rs.next()) {

				System.out.printf("%2d\t%s\n",rs.getInt(1),rs.getString(2));

			}

			rs.close();
			pstmt.close();

			// ���̺��� �ϳ� ����...
			System.out.printf("> ���̺� �����ϼ���? ");
			Scanner sc = new Scanner(System.in);
			String tableName = sc.next();
			//
			//sql = " select * from ? "; //�÷��� �Ķ���ͷ� ���޴´�. ->�������� ����ؾ��Ѵ�.
			sql = " select * from " + tableName; //**********************
			pstmt = con.prepareStatement(sql);
			//pstmt.setString(1, tableName);
			rs = pstmt.executeQuery();
			// rs ResultSetdml �������� ������..?
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCnt = rsmd.getColumnCount();
			//System.out.println("> �÷� ���� : " + columnCnt);
			System.out.println("--------");
			for (int i = 1; i <= columnCnt; i++) {
				//System.out.println(rsmd.getColumnName(i) +" - "+ rsmd.getColumnTypeName(i));
				//�÷��̸�, �ڷ��� ��� ���� ������ ���ü� �ִ�. 
				System.out.printf("%s\t", rsmd.getColumnName(i));
			}
			System.out.println("--------");


			while (rs.next()) {
				//System.out.println(rs.getObject(1));
				for (int i = 1; i <= columnCnt; i++) {
					int columnType = rsmd.getColumnType(i);
					int scale = rsmd.getScale(i);
					if(columnType == Types.NUMERIC && scale !=0) {//�Ǽ�
						System.out.printf("%.2f\t",rs.getDouble(i));
					}else if(columnType == Types.NUMERIC && scale ==0) {// ����
						System.out.printf("%d\t",rs.getInt(i));
					}else if(columnType == Types.VARCHAR || columnType == Types.CLOB) {// ���ڿ�
						System.out.printf("%s\t",rs.getString(i));
					}else if(columnType == Types.DATE || columnType == Types.TIMESTAMP) {// ��¥
						System.out.printf("%tF\t",rs.getDate(i));
					}
				}
				System.out.println();
			}
			rs.close();
			DBConn.close();
		} catch (Exception e) {

			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}

	}

}
