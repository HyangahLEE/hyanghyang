package days16.replyboard;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.ConnectionProvider;
import com.util.JdbcUtil;

public class List extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//검색 01
		//list.do?searchCondition=writer&searchWord=향아
		String searchCondition = request.getParameter("searchCondition");
	if(searchCondition == null) searchCondition ="subject";
		String searchWord= request.getParameter("searchWord");
		
		
		
		///////////////////////////////////
		//list.do?page=3
		int currentPage = request.getParameter("page")  == null ? 1:Integer.parseInt(request.getParameter("page")) ;
		
		//
		int start , end;
		int pageSize = 5; //한 페이지당 출력할 게시글 수 
		int pageBlock = 10; //페이지 블럭수 
		
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();
			
			ReplyBoardDAO dao = ReplyBoardDAO.getInstance();
			
			int totalRecords =0;
			int totalPages=0;
			
			if(searchWord == null) { //검색 x
				totalRecords = dao.getTotalRecords(conn );
				searchWord="";
			}else { //검색한다
				totalRecords = dao.getTotalRecords(conn ,searchCondition, searchWord);
				
			}
			
			//총 페이지 수 9/pageSize(4) =2.xxx > 3페이지
			totalPages = (int)Math.ceil((double)totalRecords/pageSize);
			start = (currentPage-1)*pageSize +1 ;
			end = start + pageSize -1;
			
			
			java.util.List<ReplyBoardDTO> list = null;
					dao.selectList(conn,start,end);
			
			if(searchWord == "") { //검색 x
				list = dao.selectList(conn, start, end);					
			}else { //검색한다
				list = dao.selectList(conn, start, end, searchCondition, searchWord);				
			}
			
			request.setAttribute("list", list);
			request.setAttribute("currentPage", currentPage);
			//
			String paging = dao.pagingProc(currentPage, pageSize, pageBlock, totalPages, searchCondition, searchWord);
			request.setAttribute("paging", paging);
			
			
			
			RequestDispatcher dispatcher =  request.getRequestDispatcher("list.jsp");
			dispatcher.forward(request, response);
		} catch (Exception e) {
			System.out.println("> List.doGet() : " + e.toString());
		}finally {
			if(conn !=null) { try {conn.close(); } catch (SQLException e) {e.printStackTrace();}}
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

	
	
}
