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
		// ResultSet 의 결과물에 대한 정보를 얻어오기...
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

			// 테이블을 하나 고르자...
			System.out.printf("> 테이블 선택하세요? ");
			Scanner sc = new Scanner(System.in);
			String tableName = sc.next();
			//
			//sql = " select * from ? "; //컬럼명 파라미터로 못받는다. ->동적쿼리 사용해야한다.
			sql = " select * from " + tableName; //**********************
			pstmt = con.prepareStatement(sql);
			//pstmt.setString(1, tableName);
			rs = pstmt.executeQuery();
			// rs ResultSetdml 정ㅈ보를 얻어오기..?
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCnt = rsmd.getColumnCount();
			//System.out.println("> 컬럼 갯수 : " + columnCnt);
			System.out.println("--------");
			for (int i = 1; i <= columnCnt; i++) {
				//System.out.println(rsmd.getColumnName(i) +" - "+ rsmd.getColumnTypeName(i));
				//컬럼이름, 자료형 등등 관한 데이터 얻어올수 있다. 
				System.out.printf("%s\t", rsmd.getColumnName(i));
			}
			System.out.println("--------");


			while (rs.next()) {
				//System.out.println(rs.getObject(1));
				for (int i = 1; i <= columnCnt; i++) {
					int columnType = rsmd.getColumnType(i);
					int scale = rsmd.getScale(i);
					if(columnType == Types.NUMERIC && scale !=0) {//실수
						System.out.printf("%.2f\t",rs.getDouble(i));
					}else if(columnType == Types.NUMERIC && scale ==0) {// 정수
						System.out.printf("%d\t",rs.getInt(i));
					}else if(columnType == Types.VARCHAR || columnType == Types.CLOB) {// 문자열
						System.out.printf("%s\t",rs.getString(i));
					}else if(columnType == Types.DATE || columnType == Types.TIMESTAMP) {// 날짜
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
