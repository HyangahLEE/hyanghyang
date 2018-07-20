package days03;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.util.DBConn;

import days03.emp.empDAOImpl;
import days03.emp.empDTO;
import days03.emp.empService;

public class Ex05 {

	static int s_num = 1;
	static char con = 'y';
	static empDAOImpl empdao = null;
	static empService empservice = null;
	static private Connection connection = null;
	public final static int allList = 1;
	public final static int addEmp = 2;
	public final static int updateEmp = 3;
	public final static int deleteEmp = 4;

	public static void main(String[] args) {
		connection = DBConn.getConnection();
		empdao = new empDAOImpl(connection);
		empservice = new empService(empdao);


		while (true) {
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
			String menus[] = {

					"��� ��� ���� ���"
					,"����߰�"
					,"����"
			};

			for (int i = 0; i < menus.length; i++) {
				System.out.printf("%d. %s\n",i+1,menus[i]);
			}

			Scanner sc = new Scanner(System.in);
			System.out.println("�޴��� �����Ͻÿ�.");
			s_num = sc.nextInt();



			switch (s_num) {
			case allList:

				������������();
				break;
			case addEmp:

				����߰�();
				break;
			case updateEmp:

				������������();
				break;
			case deleteEmp:

				������������();
				break;

			default:
				break;
			}

		}


	}



	private static void ����߰�() {
		
		
		int cnt = empservice.getAddEmpService();
		
		
	}



	private static void ������������() {

		List <empDTO> list = empservice.getEmpAllListService();
		if(list ==null) {

			System.out.println("����� �����ϴ�!!");
			return;
		}
		Iterator<empDTO> ir = list.iterator();
		while (ir.hasNext()) {
			empDTO dto = (empDTO) ir.next();
			System.out.printf("%d %s\n",dto.getEmpno(),dto.getEname());
		}



	}

}
