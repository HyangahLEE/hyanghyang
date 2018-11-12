package days18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		String name = null;
		try {
			name = inputData();
		} catch (IOException e) { 
			e.printStackTrace();
		}
		System.out.println(name);
	}

	private static String inputData() throws IOException {
		//Scanner scanner = new Scanner(System.in);
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)
                                    );
		System.out.println("> 이름 입력 ? ");
		String name =  br.readLine();
		return name;
	}

}
