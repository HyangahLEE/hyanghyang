package days25;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

class FNameFilter implements FilenameFilter{

	// 파일객체의   .....XXX.java true 
	@Override
	public boolean accept(File dir, String name) {
		return name.endsWith(".java");
	}
	
}

public class Ex12 {

	public static void main(String[] args)
			           throws IOException {
		/*
		File file = new File("C:\\D\\Class\\JavaClass");
		FilenameFilter filter = new FNameFilter();
		// C 드라이버  안에   자바만 목록 가져오고 싶다...
		File [] lists = file.listFiles(filter);
		for (File f : lists) {
			System.out.println(f.getName());
		}
		*/
		
		// String pathname = "C:\\D\\Class\\JavaClass\\javaPro";
		 String pathname = ".\\";
		
		File f = new File(pathname);
		/*
		C:\D\Class\JavaClass\javaPro
		C:\D\Class\JavaClass\javaPro
		C:\D\Class\JavaClass\javaPro
		*/
		/* 상대경로...
		C:\D\Class\JavaClass\javaPro\.    f.getAbsolutePath()
		C:\D\Class\JavaClass\javaPro      f.getCanonicalPath()
		.                                              f.getPath()
		*/
		System.out.println( f.getAbsolutePath() );   // 절대 경로
		System.out.println( f.getCanonicalPath() );  // 표준 경로 
		System.out.println( f.getPath() );
		
		
		
		

	}

}
