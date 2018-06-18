package days03;

public class Ex07 {

	public static void main(String[] args) {
	
		//증감 연산자 ++ -- 
		int x = 10;
		//x += 1 ;
		//단독으로 사용될때는 전위형==후위형, 결과는 같다. (다른연산자와 사용되면 달라짐)**
		//x++; 후위형 증감연산자   11
        //++x; 전위형 증감연산자   11 
		
		//int y = ++x;    (더하고 대입)*
		int y = x++;    //(대입하고 더하기)*
		
		System.out.printf(">x=%d, y=%d\n",x,y);
		
		
		
		
	}
}
