package days04;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.util.DBConn;

public class Ex04 {

	public static void main(String[] args) {
		// [ emp �˻� ]
		// 1. �μ���ȣ �˻�
		// 2. ����� �˻�
		// 3. job �˻�
		// �˻� ����, �˻��� �Է�. 
		int searchCondition ;
		String searchWord;
		Scanner sc = new Scanner(System.in);
		System.out.println("> �˻�����, �˻��� �Է� :");
		searchCondition = sc.nextInt();
		searchWord = sc.next();
		//
		String sql= "select deptno, empno, ename, job, hiredate from emp ";
		switch (searchCondition) {
		case 1:
			sql += " where deptno = ?";
			break;
		case 2:
			sql += " where ename like ?";
			searchWord = '%'+searchWord+'%';//*******
			
			break;
		case 3:
			sql += " where job = ?";
			break;
		case 4:
			sql += " where hiredate between ? and ?";
			break;
		}
		//
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DBConn.getConnection();
			pstmt = con.prepareStatement(sql); // ĳ�ÿ� �÷����� �غ���ѳ���
			pstmt.setString(1, searchWord);
			
			rs= pstmt.executeQuery();
			
			if( rs.next()) {
				do {
					
					int deptno = rs.getInt(1);
					int empno = rs.getInt(2);
					String ename = rs.getString(3);
					String job = rs.getString(4);
					Date hiredate = rs.getDate(5);
					
					System.out.printf("%d\t%d\t%s\t%s\t%tF\n", deptno,empno,ename,  job,hiredate);
								
				} while (rs.next());
				}else {
					
					System.out.println("> ����� ���������ʽ��ϴ�.");
				}
			
			rs.close();
			pstmt.close();
			DBConn.close();
		
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("> �������ڵ� <");
		}
	}

}
