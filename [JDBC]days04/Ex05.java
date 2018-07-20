package days04;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;

import com.util.DBConn;

public class Ex05 {

	public static void main(String[] args) {
		//empVO (value object)

		
		//
		ArrayList<empVO> list = getempVO();
		
		if( list == null) {
			
		System.out.println(" 사원정보 업습니다. ");
		return;
		}

		// 사원정보 출력
		Iterator<empVO>ir = list.iterator();
		while (ir.hasNext()) {
			empVO vo = (empVO) ir.next();
			System.out.println(vo);
			
		}

	}

	private static ArrayList<empVO> getempVO() {
		ArrayList<empVO> list =null;
		
		String sql = "select empno, d.dname, ename, sal, s.grade ";
		sql += "from emp e join dept d on e.deptno = d.deptno ";
		sql+= " join salgrade s on e.sal between s.losal and s.hisal";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DBConn.getConnection();
			
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				list = new ArrayList<>();
				do {
					
				int empno = rs.getInt(1);
				String dname = rs.getString(2);
				String ename= rs.getString(3);
				double sal = rs.getDouble(4);
				int grade = rs.getInt(5);
				empVO vo = new empVO(empno, dname, ename, sal, grade);
				list.add(vo);
				
				} while (rs.next());
				
			}
			
			
			rs.close();
			pstmt.close();
			DBConn.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
