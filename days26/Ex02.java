package days26;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintStream;
import java.security.GeneralSecurityException;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// Ex01.java     student.txt 학생 정보를 2명 저장시킨 상태.
		// 1. 파일읽기              FileReader
		// 파일쓰기 X
		// 2. 화면쓰기(출력)    PrintStream System.out
		PrintStream out = System.out;
		String fileName = "student.txt";
		String line = null;
		
		String name = null;
		int kor =0, eng = 0, mat = 0;
		int tot = 0;
		double avg = 0;
		//boolean gender = false ;   // true 남자  false 여자
		String gender = null ;   // true 남자  false 여자
		
		try (
				FileReader in = new FileReader(fileName);
				BufferedReader br = new BufferedReader(in)
				) {
			while( ( line=br.readLine() ) != null) {  // -1   null
				//System.out.println(line);
				Scanner scanner = new Scanner(line).useDelimiter(",");
				name = scanner.next();
				kor = scanner.nextInt();
				eng = scanner.nextInt();
				mat = scanner.nextInt();
				tot = scanner.nextInt();
				avg = scanner.nextDouble();
				gender = scanner.nextBoolean() ? "남자" : "여자";
				out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%s\n"
						, name, kor,eng, mat,tot,avg, gender);
				/*
				String regex = ",";
			    String[] datas = line.split(regex );
			    name = datas[0];
			    kor = Integer.parseInt(datas[1]);
			    eng = Integer.parseInt(datas[2]);
			    mat = Integer.parseInt(datas[3]);
			    tot = Integer.parseInt(datas[4]);
			    avg = Double.parseDouble(datas[5]);
			    gender = Boolean.parseBoolean(datas[6]) ? "남자" :"여자";				
			    out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%s\n"
						, name, kor,eng, mat,tot,avg, gender);
				*/		
			}
		} catch (Exception e) { 
			e.printStackTrace();
		}

	}

}
