package days19;

public class Ex13 {

	public static void main(String[] args) {
		// p 504
		// charAt() / length() / toUpperCase() / toLowerCase()
		// getBytes() / equals()
		// 문자열 찾기 : indexOf()
		String source = "안녕하세요. 이석화.. 이석화... 이석화 입니다.";
		String name ="이석화";
		
		int fromIndex = 0, fidx = -1; 
		/*
		int f_index =  source.indexOf(name);
		System.out.println(f_index);
		fromIndex =  f_index + name.length();
		f_index = source.indexOf(name, fromIndex);
		fromIndex =  f_index + name.length();
		*/		
		
		/*
		while( (fidx =  source.indexOf(name, fromIndex) ) != -1) {
			System.out.println(fidx);
			fromIndex =  fidx + name.length();
		}
		*/
		
		fromIndex = source.length();
		while( (fidx =  source.lastIndexOf(name, fromIndex) ) != -1) {
			System.out.println(fidx);
			fromIndex =  fidx - 1;
		}

	}

}
