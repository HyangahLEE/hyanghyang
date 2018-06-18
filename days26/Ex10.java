package days26;

import java.io.BufferedReader;
import java.io.StringReader;

public class Ex10 {

	public static void main(String[] args) {
		/*
		 * [장소에 따른 스트림 분류]
		 * 1. File 스트림
		 * 2. [Memory 스트림]
		 *    ㄱ. ByteArrayInputStream/ByteArrayOutputStream 바스
		 *    ㄴ. CharArrayReader / CharArrayWriter 문스
		 *    ㄷ. [ StringReader / StringWriter ]  문스 *** 
		 *          String(문자열)을  메모리상에 읽기/쓰기  문자 스트림
		 * */
		String msg = "package days26;\r\n" + 
				"\r\n" + 
				"public class Ex10 {\r\n" + 
				"\r\n" + 
				"	public static void main(String[] args) {\r\n" + 
				"		/*\r\n" + 
				"		 * [장소에 따른 스트림 분류]\r\n" + 
				"		 * 1. File 스트림\r\n" + 
				"		 * 2. [Memory 스트림]\r\n" + 
				"		 *    ㄱ. ByteArrayInputStream/ByteArrayOutputStream 바스\r\n" + 
				"		 *    ㄴ. CharArrayReader / CharArrayWriter 문스\r\n" + 
				"		 *    ㄷ. [ StringReader / StringWriter ]  문스 *** \r\n" + 
				"		 *          String(문자열)을  메모리상에 읽기/쓰기  문자 스트림\r\n" + 
				"		 * */\r\n" +
				"		String msg = \"\";\r\n" + 
				"\r\n" + 
				"	}\r\n" + 
				"\r\n" + 
				"}\r\n" + 
				"";
		/*
		String [] msgs = msg.split("\r\n");
		System.out.println(msgs[4]);
        */
		
		
		/*
		StringReader in = new StringReader(msg);
		BufferedReader br = new BufferedReader(in);
		br.readLine();
		*/
	}

}
