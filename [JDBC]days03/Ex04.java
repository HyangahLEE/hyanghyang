package days03;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

import com.util.DBConn;

import days03.emp.empDTO;

public class Ex04 {

	public static void main(String[] args) {
		
	ArrayList<empDTO> list = getEmpDeptno(20);
	if(list == null) {
		System.out.println("> 사원 존재x <");
		return;
		
	}	
	
		//출력
	Iterator<empDTO> ir= 	list.iterator();
	while (ir.hasNext()) {
		empDTO dto = (empDTO) ir.next();
		System.out.printf("%d %s\n", dto.getEmpno(),dto.getEname());
	}
	}

	private static ArrayList<empDTO> getEmpDeptno(int deptno) {
		ArrayList<empDTO> list = null; // null이 넘어가면 사원이 존재하지않음 !
		Connection con = DBConn.getConnection();
		try (Statement stmt = con.createStatement()) {
			
			String sql= String.format("select * from emp where deptno = %d", deptno);
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				list = new ArrayList<>();
				empDTO dto = null;
				do {
					dto = new empDTO();
					dto.setEmpno(rs.getInt("empno"));
					dto.setEname(rs.getString("ename"));
					list.add(dto);
					
				}while (rs.next());
				
				
				
			} 
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
}
