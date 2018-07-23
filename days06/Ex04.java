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
		// up_selectEmp_30 > �˻� ���ν��� ����
		// - pCursor �ƿ�ǲ��
		// - open for ����~
		// up_deleteEmp_30 > ��� ���� ���ν��� ����
		// - pempno ��ǲ��

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
			
			
			System.out.println("> ������ ����� üũ�ϼ���? ");
			
			String d_empnos = scanner.next();
//			d_empnos.split(","); 
			String [] d_empnoArr = d_empnos.split(","); //���� �޸�(,)�� ���� ���� > ���� �޸��� �������� �ڸ���.
			
			
			int d_empno = 0;
			sql = "{ call up_deleteEmp_30(?) }";
			cstmt = con.prepareCall(sql);

/*
			//������ ���� ���� �ڵ�
			for (String no : d_empnoArr) {
				d_empno = Integer.parseInt(no);
				cstmt.setInt(1, d_empno);
				int cnt = cstmt.executeUpdate();
				
				if ( cnt == 1 ) {
					System.out.println("?> ���� �Ϸ�!!");
				}
			}*/
			
			
			for (String no : d_empnoArr) {
				d_empno = Integer.parseInt(no);
				cstmt.setInt(1, d_empno);
				
//				int cnt = cstmt.executeUpdate();
				
				cstmt.addBatch(); //���� �������� �������� �ʰ� Ư�� �޸𸮿� �����Ѵ�.
				//���� foreach���� �� for�� ���� �������� ��� ������ �ϱ� ������ �����Ͱ� ������ ��������.
				//batch���� ������ ó���� ��� addbatch�� �߰��� �� �ϰ�ó���ϱ� ������ �Ӵ��� �� ������.
				//batch ���� ���� ����Ŀ���� false�� ����� exception�߻��� rollback�� �����ϴ�.
				
/*				if ( cnt == 1 ) {
					System.out.println("?> ���� �Ϸ�!!");
				}*/
				
			}
			
			
			int [] cnts = cstmt.executeBatch(); // ����� �������� �����ϴ� �޼ҵ�, �߰��� ����� ó�� ����� Ȯ���� �� �ִ�.

				
			cstmt.close();
			
			//-----------------------------

			
			DBConn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void dispList(ArrayList<empDTO> list) {

		if (list == null) {
			System.out.println("> ����� ���� X");
			return;
		}

		Iterator<empDTO> ir = list.iterator();

		while (ir.hasNext()) {// �ڵ����� ���� ����
			empDTO dto = (empDTO) ir.next();
			System.out.println(dto);
			// ir.next(); >> ȣ��� ������ ������Ʈ�� ������� �����Ѵ�.
//			System.out.printf("> %d\t%s\t%s\t%d\t%tF\t%s\t%s\n", empDTO.getEmpno(), empDTO.getEname(), empDTO.getJob(), empDTO.getMgr(), empDTO.getHiredate(), empDTO.getSal(), empDTO.getComm());
			
		}
	}

}
