package days03;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.util.DBConn;

 

public class Ex01 {

 

	public static void main(String[] args) {

 

		System.out.println("검색 조건 선택");
		System.out.println("1.제목 검색");
		System.out.println("2.글쓴이 검색");
		System.out.println("3. 제목+내용 검색");		
		
		String title;
		String writer;
		String content;

		Scanner scanner = new Scanner(System.in);

		System.out.println("검색 조건 선택하세요?");

	    int n = scanner.nextInt();
		String sql = " select seq, title, writer, writedate, content ";
		sql += " from cstvsboard ";

		System.out.println("검색어 입력하세요.");
		String searchWord = scanner.next();
 

		switch (n) {
		case 1: sql += "where title like '%"+searchWord+"%'";			
			break;

		case 2: //sql += "where writer like '%"+searchWord+"%'";	
					sql += String.format("where writer like '%%%s%%'" , searchWord);
					//sql += String.format("where writer like '%s'" , "%"+searchWord+"%");
			break;

		case 3: //sql += "where title like '%"+searchWord+"%' or content like '%"+searchWord+"%'";		
				sql += String.format("where title like '%1$s' or content like '%1$s'" ,"%"+searchWord+"%");
			break;

		}

		
		Connection con = DBConn.getConnection();
		try(Statement stmt = con.createStatement()) {
			ResultSet rs = stmt.executeQuery(sql);

			if(rs.next()) {
			while (rs.next()) {

				title = rs.getString(2);
				writer = rs.getString(3);
				content = rs.getString(5);

				System.out.printf("%s\t %s\t %s\t %tF\n", title, writer, content,rs.getDate(4));
				
			}}else System.out.println("검색 결과 x");
			rs.close();
			DBConn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//	System.out.println(sql);

 	}
 
}

