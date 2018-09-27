package days15.article.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import days13.mvc.command.CommandHandler;
import days15.article.service.ArticlePage;
import days15.article.service.ListArticleService;

public class ListArticleHandler implements CommandHandler{

	private ListArticleService ListArticleService = new ListArticleService();
	
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String pageNoVal = request.getParameter("pageNo");
		
		int pageNo =1;
		if(pageNoVal != null) {
			pageNo = Integer.parseInt(pageNoVal);
		}
		ArticlePage articlePage = ListArticleService.getArticlePage(pageNo);
		request.setAttribute("articlePage", articlePage);
		return "/days15/article/listArticle.jsp";
	}

}
