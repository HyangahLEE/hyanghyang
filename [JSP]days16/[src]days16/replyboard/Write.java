package days16.replyboard;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.ConnectionProvider;

public class Write extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//글쓰기 페이지 보여주는 역할
		//write.do -> 새글쓰기
		//write.do?num=부모글&ref=부모그룹&step&dept=부모-> 답글
		String p_num = request.getParameter("num"); //부모글 번호
		//int pnum= Integer.parseInt(p_num);
		
		if(p_num == null) { //새글쓰기
			//response.sendRedirect("write.jsp");
			RequestDispatcher dispatcher = request.getRequestDispatcher("write.jsp");
			dispatcher.forward(request, response);
		}else {//답글쓰기
			RequestDispatcher dispatcher =  request.getRequestDispatcher("write.jsp");
			dispatcher.forward(request, response);
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
	
		//입력된 새글 또는 답글 DB저장
		//새글 또는 답글 공통
		ReplyBoardDTO dto = new ReplyBoardDTO();
		dto.setContent(request.getParameter("content"));
		dto.setEmail(request.getParameter("email"));
		dto.setIp(request.getRemoteAddr());
		dto.setPass(request.getParameter("pass"));
		dto.setWriter(request.getParameter("writer"));
		dto.setSubject(request.getParameter("subject"));
		
		//hidden (p_num, p_ref, p_step, p_depth)
		if(request.getParameter("p_num") == "") {//새글일때 
			
		dto.setStep(0);
		dto.setDepth(0);
		
		}else {//답글쓰기
			//dto.setNum
			dto.setNum(Integer.parseInt(request.getParameter("p_num")));
			dto.setRef(Integer.parseInt(request.getParameter("p_ref")));
			dto.setStep(Integer.parseInt(request.getParameter("p_step")));
			dto.setDepth(Integer.parseInt(request.getParameter("p_depth")));
		}
		
		
		try {
			Connection conn = ConnectionProvider.getConnection();
			ReplyBoardDAO dao = ReplyBoardDAO.getInstance();
			int result = dao.insert(conn, dto);
			
			

			if(result ==1) {
				response.sendRedirect("list.do");
			}
			
		} catch (Exception e) {
			System.out.println("> Write.doPost() : "+e.toString());
		}finally {
			
			
		}
		
	}

	
	
}
