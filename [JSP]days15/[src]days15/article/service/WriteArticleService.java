package days15.article.service;

import java.sql.Connection;

import com.util.ConnectionProvider;
import com.util.JdbcUtil;

import days15.article.dao.ArticleDao;
import days15.article.model.Article;

public class WriteArticleService {

	//p639
	private ArticleDao articleDao = new ArticleDao();
	public int write(Article article) {
		
		Connection conn = null;
	
		try {
			conn = ConnectionProvider.getConnection();
			//conn.setAutoCommit(false);
			return articleDao.insert(conn, article);
			//conn.commit();
		} catch (Exception e) {
			//conn.rollback();
			System.out.println("> WriteArticleService : "+ e.toString());
		}finally {
			JdbcUtil.close(conn);
		}
		
		
		return 1;
	}
	
}
