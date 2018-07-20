package days05;

import com.util.DBConn;

import days04.cstvsBaord.BoardDAOImpl;

public class Ex01 {

	public static void main(String[] args) {
		
		
		
		
		days04.cstvsBaord.BoardDAOImpl dao = new BoardDAOImpl(DBConn.getConnection());
		System.out.println(dao.pageBlock(3, 15, 10, 68));
		
		
		
/*		int PageSize = 15;
		int TotalPages = 68;
		
		int blockStart=1;
		int blockEnd =10;
		for (int currentPage = 1; currentPage <= 68; currentPage++) {
			System.out.printf("> cp =%d bs=%d~be =%d\n"
					,currentPage,blockStart,blockEnd);
			
			if((currentPage%10==0)) {
				blockStart +=10;
				blockEnd +=10;
				System.out.println("----------------------------");
				if (currentPage > 61) blockEnd = 68;
				
			}
		}*/

	}

}
