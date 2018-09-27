package days15.article.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import days13.mvc.command.CommandHandler;
import days15.article.model.Article;
import days15.article.service.WriteArticleService;

public class WriteArticleHandler implements CommandHandler{

	private static final String FORM_VIEW = "/days15/article/newArticleForm.jsp";
	
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		if(request.getMethod().equals("GET")) {//대문자 !!!
			return FORM_VIEW;
		}else if(request.getMethod().equals("POST")) {
			return processSubmit(request,response);
		}else {
			response.setStatus(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
		}
		return null;
	}

	private WriteArticleService writeService = new WriteArticleService();
	private String processSubmit(HttpServletRequest request, HttpServletResponse response) {
		Article article = new Article();
		
		article.setWriter_id(request.getParameter("writer_id"));
		article.setWriter_name(request.getParameter("writer_name"));
		article.setTitle(request.getParameter("title"));
		article.setContent(request.getParameter("content"));
		
		int result = this.writeService.write(article);
		return "/days15/article/newArticleSuccess.jsp";
	}

}
