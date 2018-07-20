package days04;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.util.DBConn;

public class Ex02 {
	public static void main(String[] args) {
		// [ PreparedStatement ]
		/*
		1. Shared Pool ���� sql���ǿ� ���� ���� �˻縦�Ѵ�(*Parsing).
		2. *Execute plan ���� �ؼ� �� ��� ó������ �����ȹ�� ��´�. (ó���ӵ��� ����)
		3. *Fetch(����)�� �� ������� 
		4. Data Buffer (Library) Cache���� ������� �÷�����(������) sql������ ������� ������
		
		>> pasing����� execute plan�� �״�� ����ϰ� ������ ����ӵ��� ����ų �� �ִ�. 
		but insert���� �Ű������� �ʿ��� �������� ���ε� ������ ��������ν� �����ϰ� ó��
		*/
		
		//DEPT ���̺� insert ����...
		Scanner sc = new Scanner(System.in);
		System.out.printf("> deptno, dname, loc input? ");
		int deptno = sc.nextInt();
		String dname = sc.next();
		String loc = sc.next();
		//
		//String sql=String.format("insert into dept values(%d,'%s','%s')", deptno, dname, loc);
		// ? ���ε�����
		String sql = "insert into dept values (?, ?, ?)"; // ''���� �Ⱥ���
		Connection con = null;
		PreparedStatement pstmt = null;
		int cnt = 0;
		//
		try {
			con = DBConn.getConnection();
			pstmt = con.prepareStatement(sql); // ĳ�ÿ� �÷����� �غ���ѳ���
			
			// ?,?,? ���ε� ������ ���� �Ű����� �� ���� �ڵ�. (java.sql.SQLException: �ε������� ������ IN �Ǵ� OUT �Ű�����:: 1)
			pstmt.setInt(1, deptno);
			pstmt.setString(2,dname);
			pstmt.setString(3,loc);

			cnt = pstmt.executeUpdate(); // �ԷµǴ� ���ε� ���� ���� ������ �����ؾ� �ϱ� ������ setString ���� �������� ������
			if(cnt == 1)
				System.out.println(" ���ο� �μ� �߰� ����!");
			else System.out.println(" ���ο� �μ� �߰� ���Ф̤�");
			pstmt.close();
			DBConn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("> �������ڵ� <");
		}
	}
}


/*
ResultSet rs = null;
rs.next();
rs.previous;// �� �� ���ڵ�� ����
rs.first(); // bof ���� (ù��° ���ڵ�)
rs.last(); //eof������ ���� (���������ڵ�)


rs.close();
*/