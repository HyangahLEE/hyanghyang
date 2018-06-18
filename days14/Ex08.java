package days14;


// 저축 클래스
class Save{
	// fields
	String name;
	double money = 1000;
	private static double rate = 0.04;  // 클래스변수, 정적필드.....
	
	// constructors
	Save(){} 
	Save(String name, double money) {
		this.name = name;
		this.money = money;
		}
	
	Save(String name, double money, double rate) {
		this.name = name;
		this.money = money;
		this.rate = rate;
	}
	
	// methods
	public void inputMoney(double money) {
		this.money += money;
	}
	public void outputMoney(double money) {
		this.money -= money;
	}
	public void dispInfo() {
		System.out.printf("> 예금주:%s, 예금액:%.2f, 이자율:%.2f\n",
				this.name, this.money, this.rate);
	}
	
	// 인스턴스 메서드
	// 정적(static) 메서드
	public static void aaa() {		
		System.out.println("aaa");
	}
}


public class Ex08 {
	//
	public static int sum(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {
		//Ex08.sum(2, 45);
		
		
		// static 필드, 메서드
		// 프로그램 시작하면 스태틱(static) 영역에 기억공간 할당.
		// 클래스명.static멤버
		/*
		System.out.println( Save.rate );
		Save p =new Save();
		p.rate = 0.08;
		System.out.println( Save.rate );
		*/
		// Save.aaa();
		//Save p =new Save();
		//p.aaa();
		// Save.aaa();
		
		
		// p 236 정적 멤버와 static
		// [기업은행 보통예금.]
		/*
		Save m1 = new Save("이석화", 20000, 0.04);
		Save m2 = new Save("김재곤", 13000, 0.04);
		Save m3 = new Save("이혜원", 25000, 0.04);
		Save m4 = new Save("박주영", 200000, 0.04);
		Save m5 = new Save("김의", 1000, 0.04);
		*/ 
		// 클래스 배열 초기화 
		/*
		Save [] persons = {
						             new Save("이석화", 20000, 0.04),  
				                     new Save("김재곤", 13000, 0.04),   
		                             new Save("이혜원", 25000, 0.04),   
			                         new Save("박주영", 200000, 0.04),  
		                             new Save("김의", 1000, 0.04)
				                   };
		for (int i = 0; i < persons.length; i++) {
			 System.out.printf("[%d]번 ", i+1);
			 persons[i].dispInfo();
		}
		*/
	}
}