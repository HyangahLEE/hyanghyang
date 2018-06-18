package days25;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex11 {

	public static void main(String[] args) {		
		// p 1018 File 클래스
		// 1. 파일 관리하는 기능
		//     파일크기, 파일 속성, 파일 이름 등의 정보를 얻어오는 기능
		//     파일 생성 및 삭제 기능 제공.....
		// 2. 디렉토리(폴더) 관리하는 기능
		//     디렉토리 생성, 디렉토리 안에 존재하는 서브디렉토리, 파일 목록..등등
		//                삭제, 이름변경....
		
		
		/*
		 * 1. boolean  createNewFile()  새로운 파일 생성
		 * 2. mkdir()
		 *     mkdirs() C:\\test\\xxx\\yyy\\abc.txt  새로운 파일 생성
		 * 3. delete() 파일 또는 디렉토리 삭제
		 * */ 
		
		File dir = new File("C:\\Temp\\Dir");
		if( !dir.exists() )			dir.mkdirs();   //
		
		File file1 = new File("C:\\Temp\\file1.txt");
		if( !file1.exists() )
			try {
				file1.createNewFile();  //
			} catch (IOException e) { 
				e.printStackTrace();
			}
		//         file1.createTempFile(prefix, suffix)
		
		File temp = new File("C:\\Temp");
		// p 1020  14줄 코딩....
		SimpleDateFormat sdf =
				new SimpleDateFormat("yyyy-MM-dd  a  HH:mm");
		// String [] contents = temp.list();
		File[] contents=temp.listFiles();  // 폴더 + 파일 => 목록  String [] X
		
		System.out.println("날짜                         시간               형태          크기           이름");
		System.out.println("-----------------------------------------------------");
		for (File file: contents) {
			// (기억)
			// 날짜 + 시간 = long  file.lastModified()
			// 날짜형 변환.....\
			System.out.print(sdf.format(new Date(file.lastModified())));
			
			if (file.isDirectory()) { // file 객체가 디렉토리(폴더) 냐 ? true/ false
				System.out.print("\t<DIR>\t\t\t"+file.getName());
			} else {
				System.out.print("\t\t\t"+file.length()+"\t"+file.getName());
			}
			System.out.println(
					);
		}
		
		
	}

}






