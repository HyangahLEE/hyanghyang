package days13.mvc.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public interface CommandHandler {
	
	//jsp파일이 return으로 되야하기 때문에 String
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
