package days19;

import java.io.IOException;

public class Ex11 {

	public static void main(String[] args) throws IOException {
		// p 498
		byte [] bytes = new byte[100];
		
		System.out.print(" 입력 : ");
		
		//System.in.read(); 
		// 키보드로 부터 1바이트 -> int 반환하는 메소드
		// (기억)      0                                              99
		// bytes = [k][e][n][i][k][][l][e][e][13][10][][][][][][][][][][][][][][][][][][][]
		// 입력 : kenik lee 엔터
		
		// 키보드 출력 스트림으로 부터 읽어온 바이트 갯수.
		int readByteNo =  System.in.read(bytes);		
		// System.out.println(readByteNo);		
		String data = new String(bytes, 0, readByteNo-2); // 13, 10
		System.out.println(data);
		
		
		

	}

}



