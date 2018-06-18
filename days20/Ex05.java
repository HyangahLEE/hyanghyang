package days20;

public class Ex05 {

	public static void main(String[] args) {
		// 재곤 일꾼( 생산 스레드 )
		
		// 버퍼 [*][*][*][][][][][][]  16     >> 동기화 처리
		
		// 석화 일꾼( 소비 )
		
		//StringBuilder sb = new StringBuilder(16);		
		StringBuffer sb = new StringBuffer(16);  // ***
		 
		sb.append("홍길동");
		sb.append('A');
		sb.append(75);
		sb.append(true);
		// "홍길동A75true"
		//System.out.println(  sb.toString()  );
		System.out.println(  sb  );
		
		// 홍길동  + "장군" 삽입.
		int offset = sb.indexOf("홍길동") + "홍길동".length();
		sb.insert(offset, "장군");
		System.out.println(sb);
		
		// 장군 삭제...
		int start = sb.indexOf("장군");
		int end = start +"장군".length();
		//sb.delete(start, end);
		
		System.out.println(sb);
		// 장군   -> XX 변경
		// 
		//sb.replace(start, end, "XX")
		sb.reverse();
		
		System.out.println(sb);
		
		// 3  t -> T 수정
		sb.setCharAt(3, 'T');

		System.out.println(sb);
	}

}
