package days16;

class AA{ 
	public void disp() { System.out.println("> AA 출력"); }
}
class BB extends AA{
	@Override
	public void disp() { System.out.println("> BB 출력"); }
}
class CC extends BB{
	@Override
	public void disp() { System.out.println("> CC 출력"); }
}
class DD extends CC{
	@Override
	public void disp() { System.out.println("> DD 출력"); }
}

public class Ex09 {
	// AA 출력하는 함수
	// p 321 매개변수 다형성
	public static void typeDisp(AA obj) { // UpCasting
		// 1. obj 실제 어떤 타입의 [객체인지 확인]하는 작업 한 후
		//  AA , BB, CC, DD 타입 
		// 2. 확인한 그 타입으로 [DownCasting]해서 사용할 경우 
		if (obj instanceof DD) { 
		   DD xx	= (DD)obj;
			System.out.println("obj는 DD 클래스 타입이다.");
		}else if (obj instanceof CC) { 
			System.out.println("obj는 CC 클래스 타입이다.");
		}else if (obj instanceof BB) { 
			System.out.println("obj는 BB 클래스 타입이다.");
		}else if (obj instanceof AA) { 
			System.out.println("obj는 AA 클래스 타입이다.");
		}
		
		
	}
	/*
	public static void typeDisp(AA obj) {
		obj.disp();
	}
	public static void typeDisp(BB obj) {
		obj.disp();
	}
	public static void typeDisp(CC obj) {
		obj.disp();
	}
	public static void typeDisp(DD obj) {
		obj.disp();
	}
	*/

	public static void main(String[] args) {
		// p 326 객체 타입 확인 ( instanceOf )
		/*AA obj01 = new AA();
		typeDisp(obj01);  // 매개변수 다형성....설명
		*/
		BB obj02 = new BB();
		typeDisp(obj02);
		/*
		CC obj03 = new CC();
		typeDisp(obj03);
		 
		DD obj04 = new DD();
		typeDisp(obj04);
		 
*/
	}

}
