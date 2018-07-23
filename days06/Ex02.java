package days06;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Scanner;

import com.util.DBConn;

public class Ex02 {

	public static void main(String[] args) {

		//���ν��� id/pwd �α��� -

		String id,pwd;
		Scanner sc = new Scanner(System.in);
		System.out.println("> �α��� üũ(id,pwd) �Է�?");
		id= sc.next();
		pwd = sc.next();
		String sql = "{ call up_logon(?,?,?) }";

		Connection con = DBConn.getConnection();
		CallableStatement cstmt = null;
		try {

			cstmt = con.prepareCall(sql);

			cstmt.setString(1, id);
			cstmt.setString(2, pwd);
			//oracle.jdbc.OracleTypes.INTEGER
			cstmt.registerOutParameter(3, java.sql.Types.INTEGER);
			//����			
			cstmt.executeQuery();
			int result = (int) cstmt.getObject(3); //out�Ű������� ��Ƽ�result��~
			if(result ==1) {
				System.out.println("�α��� ����");


			}else if(result ==0) {
				System.out.println("��й�ȣ Ȯ���ϼ���.");
			}else if (result == -1) {
				System.out.println("�������� �ʴ� ID�Դϴ�.");
			}
			cstmt.close();
			DBConn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}

}


/*
 * create or replace procedure up_logon
(
    pid        in emp.empno%type
    , ppwd     in emp.ename%type
    , presult out number
)
is
  vid number(1); -- 1   0
  vpwd emp.ename%type;
begin
   select count(*) into vid   -- 1
   from emp
   where empno = pid;

   if vid = 1 then  -- id �����Ѵٸ�
     select ename into vpwd
     from emp
     where empno = pid;

     if vpwd = ppwd  then
       presult := 1;
     else
       presult := 0;
     end if;
   else
     presult := -1;
   end if;
-- exception
end;
--
var vresult number;

begin
  up_logon(7369,'XXX',:vresult);
  if( :vresult = -1 ) then
     dbms_output.put_line('ID(empno)�� �������� �ʽ��ϴ�.');
  elsif :vresult = 0  then
    dbms_output.put_line('PWD(ename)�� Ʋ�Ƚ��ϴ�.');
  elsif :vresult = 1  then
     dbms_output.put_line('�α��� ����.');
  end if;
end; 
 * */
