package days26;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Ex04 {

	public static void main(String[] args) {
		String name = null;
		int kor =0, eng = 0, mat = 0;
		int tot = 0;
		double avg = 0; 
		String gender = null ;   // true "남자"  false "여자"

		String fileName = "score.dat";  
		PrintStream out = System.out;
		
		try( 
				FileInputStream in = new FileInputStream(fileName);
				DataInputStream dis = new DataInputStream(in);
				) {
			//a      bdgfdsafsafsadf 엔터
			// System.in.read()
			// System.in.skip( System.in.available() ==2 )  
			//  **** dis.available()  ******사용해서 끝까지 출력.
			while(true) { 
			    name = dis.readUTF(); // 
			    kor = dis.readInt();eng = dis.readInt();mat = dis.readInt();
			    tot = dis.readInt();
			    avg = dis.readDouble();
			    gender = dis.readBoolean() ? "남자" : "여자";
			    out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%s\n"
						, name, kor,eng, mat,tot,avg, gender);
			}
		} 
		catch (EOFException e) {
			//System.out.println("> 모든 학생 정보 출력 완료!!! <");
		}
		catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}
