package days02;

public class Ex05 {

	public static void main(String[] args) {
		// -128 ~ 127 byte
		byte  b = 120;
		System.out.println(b);
		// Type mismatch: cannot convert from int to byte
		b = (byte) 130;		
		System.out.println(b);  //  -126 산술 오버플로워
		
		// Type mismatch: cannot convert from int to String
		//String name = "355";
		
	}

}





