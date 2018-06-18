package days20;

import java.util.regex.Pattern;

public class Ex06 {

	public static void main(String[] args) {
		// p 518 Pattern 클래스
		// boolean result = Pattern.matches(regex, input)
		
		String regExp = "(02|010)-[0-9]{3,4}-\\d{4}";
		
		String [] tels = {
				"010-1234-1234",
				"018-1234-4533",
				"02-123-1234",
				"02-1111-3333",
				"011-9999-2222",
				"011-99999-2222"
		};
		
		for (String t : tels) {
			boolean  result = Pattern.matches(regExp, t);
			if(result) {
				System.out.println(t);
			}
		}
		
		// email       1@_     _@_._      _001@
		//  kenik@naver.com    kenik@naver.co.kr
		
		//    [a-zA-Z_0-9]
		// +  1~무한대
		String regex = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		
		//                    __@01.90
		

		// (문제-숙제) 메일 제출.
		// 비밀번호 입력 : [                      ]
		// 1.  문자열길이    8 문자 이상 ~
		// 2.  숫자   1개 , 특수문자 1개 , 알 대 1, 소 1 
		// 정규표현식 으로 나타내 보기
		/*
		String pwd;
		if( pwd.length() >= 8 && is숫자() && is특수문자() ) {
			if(  숫자 ? ) {
				if( 특수문자 ? ) {  // [#$&!@]
					if( 알대) {
						if( 알 소)
					}
				}
			}
		}
		*/
	}

}





