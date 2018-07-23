package days06;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.Scanner;

import com.util.DBConn;

public class Ex03 {

	public static void main(String[] args) {
		// ȸ������ �� �� ID �ߺ�üũ�ϴ� ���ν����� ���� 
		// up_idcheck
		//			1) id  		in
		// 			2) result		out  1(��밡��) & -1(���Ұ���)
		// ID ��뿩�� ����ϴ� �ڹ� �׽�Ʈ
		// EMP ���̺� EMPNO(ID)
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("> �ߺ� üũ�� empno(ID) �Է� :  ");
		empno = sc.nextInt();
		
		Connection con = DBConn.getConnection();
		String sql = " { call up_idcheck(?,?) } ";
		CallableStatement cstmt = null;
		try {
			
			cstmt = con.prepareCall(sql);
		    cstmt.setInt(1, empno);
			
			//oracle.jdbc.OracleTypes.INTEGER
			cstmt.registerOutParameter(2, java.sql.Types.INTEGER);
			
			//����			
			cstmt.executeQuery();
			int result = (int) cstmt.getObject(2); //out�Ű������� ��Ƽ�result��~
			if(result ==0) {
				System.out.println("��� ������ id�Դϴ�.");
			}else {
				System.out.println("�̹� �����ϴ� ID�Դϴ�.");
			}
			cstmt.close();
			DBConn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


/*
 create or replace procedure up_idcheck
(
    pid in emp.empno%type
    , presult out number
)
is
begin
   select count(*) into presult   -- 1
   from emp
   where empno = pid;
end;
 */