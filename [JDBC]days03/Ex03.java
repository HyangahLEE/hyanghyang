package days03;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

import days03.emp.empDTO;

public class Ex03 {

	public static void main(String[] args) {
		//ArrayList 컬렉션 
		ArrayList<empDTO> empList_10 = new ArrayList<>();
		/*
		7782	CLARK	MANAGER	7839	81/06/09	2450		10
		7839	KING	PRESIDENT		81/11/17	5000		10
		7934	MILLER	CLERK	7782	82/01/23	1300		10
		*/
	
		empDTO emp1 = new empDTO();
		emp1.setEmpno(7782); emp1.setEname("CLARK");
		empList_10.add(emp1);
		
		empDTO emp2 = new empDTO();
		emp2.setEmpno(7839); emp2.setEname("KING");
		empList_10.add(emp2);
		
		empDTO emp3 = new empDTO();
		emp3.setEmpno(7934); emp3 .setEname("MILLER");
		empList_10.add(emp3);
		
		
		//
		Hashtable<Integer, ArrayList<empDTO>> ht = new Hashtable<>();
		int deptno = 10;
		ht.put(10, empList_10);
		
		   deptno = 20;
		      ArrayList<empDTO> empList_20 = new ArrayList<>();
		      
		      emp1.setEmpno(7369);
		      emp1.setEname("SMITH");
		      empList_20.add(emp1);

		      emp2.setEmpno(7566);
		      emp2.setEname("JONES");
		      empList_20.add(emp2);

		      emp3.setEmpno(7902);
		      emp3.setEname("FORD");
		      empList_20.add(emp3);
		      
		      ht.put(deptno, empList_20);
		
		//ArrayList 출력
		Iterator<empDTO> ir =empList_10.iterator();
		while (ir.hasNext()) {
			empDTO dto = (empDTO) ir.next();
			System.out.printf("> empno : %d, ename : %s\n",dto.getEmpno(),dto.getEname());
		}
		
	
	}

}
