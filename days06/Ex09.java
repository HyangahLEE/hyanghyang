package days06;

public class Ex09 {

	public static void main(String[] args) {
		String data = "2018 , 5";
		// ,콤마 구분자로 [문자열 잘라내기]
		// "2018" "5"
		int year, month;
		// split()
		String[] datas = data.split("\\s*,\\s* ");
		//datas.length
		for (int i = 0; i < datas.length; i++) {
			System.out.println(datas[i]);
		}
//		System.out.println(datas[0]);
//		System.out.println(datas[1]);
//		//"2018,5"
		
		
	}
}
