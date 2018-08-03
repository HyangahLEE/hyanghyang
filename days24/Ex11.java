package days24;

import java.util.Vector;

import days17.Employee;
import days17.Regular;
import days17.SalesMan;

public class Ex11 {

	public static void main(String[] args) {
		// p 664 제한된 타입 파라미터 ( 오후 수업 부터 ~~ )
		
		/*
		// IEmployee -> Employee -> Regular -> SalesMan
		//                                    -> Temp
		SalesMan emp = new SalesMan();
		Regular reg = emp; // UpCasting 자동 형 변환
		*/
		
		// vs [s][s][][][
		// vr []
		// Type mismatch: cannot convert 
		//                 from Vector<SalesMan> to Vector<Regular>  //형변환 못함.
		/*
		Vector<SalesMan> vs = new Vector<>();
		Vector<Regular>    vr = vs ; 
        */
		
		// 상속 관계   융통성 제공....
		//            [?] 와일드 카드 사용
		Vector<SalesMan> vs = new Vector<>();
		//Vector<Regular> vs = new Vector<>();
		//Vector<Temp> vs = new Vector<>();
		Vector<? extends Employee>    vr = vs ; //Employee 상속 받은거 vs에 담겟다..
		
		// Vector<? extends Number> vt = ??;
		
		
		//Vector<Regular> vr = new Vector<>();
		//Vector<Temp> vt = new Vector<>();
		//Vector<? super SalesMan> vt = vt;
		
	}

}




