package days06;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.util.DBConn;

import days03.emp.empDTO;

public class Ex04 {

	public static void main(String[] args) {
		// up_selectEmp_30 > 검색 프로시저 생성
		// - pCursor 아웃풋용
		// - open for 구문~
		// up_deleteEmp_30 > 사원 삭제 프로시저 생성
		// - pempno 인풋용

		empDTO dto = null;
		Connection con = null;
		CallableStatement cstmt = null;
		ResultSet rs = null;
		String sql = " { call up_select_emp_30(?) }";

		ArrayList<empDTO> list = null;

		try {
			con = DBConn.getConnection();
			cstmt = con.prepareCall(sql);
			cstmt.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
			//cstmt.executeQuery();
			rs = (ResultSet) cstmt.getObject(1);

			if (rs.next()) {
				list = new ArrayList<>();
				do {
					dto = new empDTO();
					dto.setEmpno(rs.getInt(1));
					dto.setEname(rs.getString(2));
					dto.setJob(rs.getString(3));
					dto.setMgr(rs.getInt(4));
					dto.setHiredate(rs.getString(5));
					dto.setSal(rs.getInt(6));
					dto.setComm(rs.getInt(7));

					list.add(dto);
				} while (rs.next());
			} // if

			rs.close();
			cstmt.close();
			
			dispList(list);
			
			//-----------------------------
			
			Scanner scanner = new Scanner(System.in);
			
			
			System.out.println("> 삭제할 사원을 체크하세요? ");
			
			String d_empnos = scanner.next();
//			d_empnos.split(","); 
			String [] d_empnoArr = d_empnos.split(","); //값을 콤마(,)로 받을 예정 > 따라서 콤마를 기준으로 자른다.
			
			
			int d_empno = 0;
			sql = "{ call up_deleteEmp_30(?) }";
			cstmt = con.prepareCall(sql);

/*
			//성능이 좋지 않은 코딩
			for (String no : d_empnoArr) {
				d_empno = Integer.parseInt(no);
				cstmt.setInt(1, d_empno);
				int cnt = cstmt.executeUpdate();
				
				if ( cnt == 1 ) {
					System.out.println("?> 삭제 완료!!");
				}
			}*/
			
			
			for (String no : d_empnoArr) {
				d_empno = Integer.parseInt(no);
				cstmt.setInt(1, d_empno);
				
//				int cnt = cstmt.executeUpdate();
				
				cstmt.addBatch(); //실제 쿼리문을 수행하지 않고 특정 메모리에 적재한다.
				//기존 foreach문은 매 for문 마다 쿼리문을 얻고 실행을 하기 때문에 데이터가 많으면 느려진다.
				//batch문은 쿼리를 처음에 얻고 addbatch로 추가를 해 일괄처리하기 때문에 속더가 더 빠르다.
				//batch 쓰기 전에 오토커밋을 false로 해줘야 exception발생시 rollback이 가능하다.
				
/*				if ( cnt == 1 ) {
					System.out.println("?> 삭제 완료!!");
				}*/
				
			}
			
			
			int [] cnts = cstmt.executeBatch(); // 적재된 쿼리문을 실해하는 메소드, 추가된 명령의 처리 결과를 확인할 수 있다.

				
			cstmt.close();
			
			//-----------------------------

			
			DBConn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void dispList(ArrayList<empDTO> list) {

		if (list == null) {
			System.out.println("> 사원이 존재 X");
			return;
		}

		Iterator<empDTO> ir = list.iterator();

		while (ir.hasNext()) {// 자동으로 생성 가능
			empDTO dto = (empDTO) ir.next();
			System.out.println(dto);
			// ir.next(); >> 호출될 때마다 엘리먼트를 순서대로 리턴한다.
//			System.out.printf("> %d\t%s\t%s\t%d\t%tF\t%s\t%s\n", empDTO.getEmpno(), empDTO.getEname(), empDTO.getJob(), empDTO.getMgr(), empDTO.getHiredate(), empDTO.getSal(), empDTO.getComm());
			
		}
	}

}
