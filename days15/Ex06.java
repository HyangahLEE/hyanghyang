package days15;

import java.util.Scanner;

public class Ex06 {
	
	// @어노테이션명
	// 컴파일러에게 문법 에러를 체크하도록 제공하는 예
	//@Override
	public String toString() { 
		return super.toString();
	}


	boolean flag ; 
	public boolean isFlag() {  // getFlag() 
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}


	public static void main(String[] args) {
		
		System.out.println("=END=");
		//@SuppressWarnings("resource")
		//Scanner scanner = new Scanner(System.in);
		//scanner.next();
		
		//scanner.close();
		
		// p 256 접근 제한자( Access Modifier )
		// p 256 생성자 접근 제한
		// p 265 Getter / Setter 메소드  :  무결성
		//     public   int kor;      obj.kor = 111;
		
		// p 269 어노테이션( Annotation )
		// 1. 메타데이터 ( metadata )
		//   > 애플리케이션이 처리해야할 데이터가 아니라
		//      컴파일 과정과 실행 과정에서 코드를 어떻게 컴파일하고
		//      어떻게 처리할 알려주는 정보..
		
		// 2. 형식
		//     @어노테이션명
		
		// 3.   3 가지 용도
		//   ㄱ. [컴파일러]에게 코드 문법 에러를 체크하도록 제공.
		//   ㄴ. 소프트웨어 개발 툴이 빌드(컴+실)나 배치 시 코드를 
		//       자동으로 생성할 수 있도록 정보를 제공
		//   ㄷ. 실행(런타임) 시 특정 기능을 실행하도록 정보를 제공
		
		

	}

}