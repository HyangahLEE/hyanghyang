package days06;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.util.DBConn;

import days03.emp.empDTO;

public class Ex01 {

	public static void main(String[] args) {
		//p447 open for문
		Scanner sc = new Scanner(System.in);
		System.out.println("> 검색할 ename 입력 ?");
		String ename  = sc.next();
		//
		Connection con = DBConn.getConnection();
		CallableStatement cstmt = null;
		ResultSet rs = null;
		empDTO dto = null;

		ArrayList<empDTO> list = null;
		try {
			//"{call 프로시져명(매개변수)}"
			String sql = "{ call up_selectSearchEname(?,?) } ";
			cstmt = con.prepareCall(sql);
			// ?  ? 매개변수 값을 설정...
			//****** pCursor out sys_refcursor -> 값이 안으로 들어가는게 아니라 어떤값으로 받아오는거기때문에 타입을 준다.
			cstmt.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
			cstmt.setString(2, ename); 
			cstmt.executeQuery(); //평소에는 rs로 받았지만 여기서는 out으로 받기때문에 
			
			rs = (ResultSet) cstmt.getObject(1);//형변환 필요
			
			if(rs.next()) {
				list = new ArrayList<>();
				do {
					dto = new empDTO();
					dto.setDeptno(rs.getInt(1));
					dto.setEmpno(rs.getInt(2));
					dto.setEname(rs.getString(3));
					dto.setJob(rs.getString(4));
					list.add(dto);
				} while (rs.next());
				
			}
			
			rs.close();
			cstmt.close();
			DBConn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		//검색 결과 출력하는 메소드 
		dispList(list);

	}

	private static void dispList(ArrayList<empDTO> list) {
		
	//Connection con = DBConn.getConnection();
	if(list ==null) {
		System.out.println("사원 존재 x");
		return;
	}
	
		Iterator<empDTO> ir = list.iterator();
		while (ir.hasNext()) {
			empDTO dto =  ir.next();
			System.out.printf("%d %d %s %s\n",dto.getDeptno(), dto.getEmpno(),dto.getEname(),dto.getJob());
			
		}
		
		
	}

}


/*
 * create or replace PROCEDURE up_selectSearchEname
(
    pCursor out sys_refcursor,
  pename in emp.ename%type

)IS
    vsql varchar2(1000);
BEGIN
    vsql := 'select deptno, empno, job from emp ';
    vsql := vsql ||' where ename like :1 ';

    open pCursor for vsql
    using '%'|| pename||'%';
END;*/
 