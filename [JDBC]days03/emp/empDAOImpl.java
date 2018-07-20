package days03.emp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class empDAOImpl implements IempDAO {

	
	private Connection connection = null;
	
	
	public void setConnection(Connection connection) {
		this.connection = connection;
	}


	public empDAOImpl(Connection connection) {
		super();
		this.connection = connection;
	}


	private Statement stmt = null;
	private ResultSet rs= null;
	@Override
	public List<empDTO> getEmpAllList() {
		
		ArrayList<empDTO> list = null;
		
		try {
			this.stmt = this.connection.createStatement();
			String sql = "select * from emp ";
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				
				list = new ArrayList<>();
				empDTO  dto = null;
				do {
					
					dto = new empDTO();
					dto.setEmpno(rs.getInt(1));
					dto.setEname("ename");
					list.add(dto);
					
				}while(rs.next());				
								
			}
			/*	
			stmt.close();
			rs.close();
			*/
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		return list;
	}



	int cnt=0;
	@Override
	public int addEmp() {
		try {
			Scanner sc= new Scanner(System.in);
			empDTO dto = new empDTO();
			System.out.println("사원번호와 사원명을 입력하세요 ");
			int empno = sc.nextInt();
			String ename = sc.next();
			String sql = String.format("insert into emp values(%d, %s)",empno,ename );
			dto.setEmpno(empno);
			dto.setEname(ename);
			stmt = connection.createStatement();
			cnt = stmt.executeUpdate(sql);
			
						
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}

}
