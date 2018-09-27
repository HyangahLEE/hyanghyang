package days17;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.PageContext;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.oreilly.servlet.multipart.FileRenamePolicy;
import com.util.ConnectionProvider;
import com.util.DBConn;
import com.util.JdbcUtil;

public class FileTest extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		Connection conn = DBConn.getConnection();
		String saveDirectory = request.getRealPath("/days17/upload");
		
		if(uri.indexOf("write.do") != -1) {
			RequestDispatcher dispatcher=	request.getRequestDispatcher("write.jsp");
			dispatcher.forward(request, response);
		}else if(uri.indexOf("list.do") != -1) {
			FileTestDAO dao = FileTestDAO.getInstance();
			
			ArrayList<FileTestDTO> list = dao.selectFileList(conn);
			request.setAttribute("list", list);
			RequestDispatcher dispatcher = request.getRequestDispatcher("list.jsp");
			dispatcher.forward(request, response);
		}else if(uri.indexOf("write_ok.do") != -1) {
			//PageContext 객체 : jsp 내장된 기본객체 9개 중하나
			
			System.out.println(saveDirectory);
			
			File saveDir = new File(saveDirectory);
			if(!saveDir.exists()) saveDir.mkdirs();

			int maxPostSize=1024*1024*5; 
			String encoding="UTF-8";
			FileRenamePolicy policy = new DefaultFileRenamePolicy();
			
			//첨부파일은 업로드 된 상태...(객체생성된후로부터)
			MultipartRequest mrequest = new MultipartRequest(request,saveDirectory, maxPostSize, encoding, policy); //
			//첨부파일 저장
			
			String subject = mrequest.getParameter("subject"); //***mrequest여야함!!
			
			
			//DBinsert -> list.jsp
			FileTestDAO dao = FileTestDAO.getInstance();
			FileTestDTO dto = new FileTestDTO();
		dto.setSubject(subject);
			File uploadFile = mrequest.getFile("attachedFile");
			if(uploadFile != null ) {// 첨부파일이 있는 경우에만
				long uploadFile_length = uploadFile.length();
				String originalFileName = mrequest.getOriginalFileName("attachedFile");
				String fileSystemName = mrequest.getFilesystemName("attachedFile");
			dto.setFilelength(uploadFile_length);
			dto.setFileSystemName(fileSystemName);
			dto.setOriginalFileName(originalFileName);
			
				
			}
			
			try {
				int result = dao.insert(conn, dto);
				response.sendRedirect("list.do");
			/*	RequestDispatcher dispatcher = request.getRequestDispatcher("list.do");
				dispatcher.forward(request, response);*/
			} catch (SQLException e) {
				System.out.println("> FileTest()");
				e.printStackTrace();
			}
		}else if(uri.indexOf("delete.do") != -1){
			int num = Integer.parseInt(request.getParameter("num"));
			String fileSystemName  = request.getParameter("fileSystemName");
			//1. DB delete ~
			FileTestDAO dao= FileTestDAO.getInstance();
			int result = dao.delete(conn,num);
			//2. /upload/ 폴더에서 첨부파일 삭제
			//String deleteFilePath = saveDirectory+"/"+fileSystemName;
			String deleteFilePath = String.format("%s%s%s", saveDirectory,File.separator,fileSystemName);
			File attachedFile = new File(deleteFilePath);
			if(attachedFile.exists()) attachedFile.delete();
			//
			response.sendRedirect("list.do");
		}else if(uri.indexOf("update.do") != -1) {
			int num = Integer.parseInt(request.getParameter("num"));
			FileTestDAO dao= FileTestDAO.getInstance();
			FileTestDTO dto = dao.getDTO(conn,num);
			request.setAttribute("dto", dto);
			RequestDispatcher dispatcher=	request.getRequestDispatcher("update.jsp");
			dispatcher.forward(request, response);
			
		}if(uri.indexOf("update_ok.do") != -1) {
System.out.println( saveDirectory );
            // upload 폴더 생성 유무 -> 생성    init() 옮겨놓으면.. 
			File saveDir = new File(saveDirectory);
			if( !saveDir.exists() ) saveDir.mkdirs();			
			int maxPostSize = 1024*1024*5; // 5MB  단위 byte
			String encoding = "UTF-8";
			FileRenamePolicy policy = new DefaultFileRenamePolicy();

			// 첨부파일은 업로드 된 상태... 
			MultipartRequest mrequest 
			= new MultipartRequest(request, saveDirectory
					, maxPostSize, encoding, policy); 
			
			// 첨부파일 저장...
			int num = Integer.parseInt(request.getParameter("num"));
		String subject = mrequest.getParameter("subject");
			// DB insert -> list.jsp
			FileTestDAO dao = FileTestDAO.getInstance();
			FileTestDTO dto = new FileTestDTO();
		 dto.setSubject(subject);
		 dto.setNum(num);
			File uploadFile = mrequest.getFile("attachFile");
			
			if( uploadFile != null ) { // 첨부파일이 있는 경우에만.
				long uploadFile_length = uploadFile.length();
				String originalfilename = mrequest.getOriginalFileName("attachFile");
				String filesystemname  = mrequest.getFilesystemName("attachFile");
		dto.setFilelength(uploadFile_length);
		dto.setFileSystemName(filesystemname);
		dto.setOriginalFileName(originalfilename);
		
		          // 첨부된 파일이 있다면 이전 첨부파일은 삭제 코딩 추가...
		String delete_filesystemname = mrequest.getParameter("filesystemname");
		String deleteFilePath = String.format("%s%s%s",
				 saveDirectory, File.separator
				 ,delete_filesystemname);
		
		File attachedFile = new File(deleteFilePath);
		if( attachedFile.exists() ) attachedFile.delete();
		
			}else {
				//
			}
			
			int result = dao.update(conn, dto);
			// list.do 포워딩....
			response.sendRedirect("list.do");
			/*
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("list.do");
			dispatcher.forward(request, response);
			*/
		}
		
		DBConn.close();
	}


	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}



}
