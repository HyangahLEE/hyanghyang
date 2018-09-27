package days15.article.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.util.JdbcUtil;

import days15.article.model.Article;

public class ArticleDao {

	public List<Article> select(Connection conn,int start, int end) throws SQLException{
		PreparedStatement pstmt =null;
		ResultSet rs = null;
		
		
		try {
			String sql=" select * from (       ";
			sql+=" select  ROW_NUMBER() over (  order by article_no desc)  No";
			sql+=" ,writer_id, writer_name, title, regdate, read_cnt";
			sql+=" from board_article";
			sql+=" )";
			sql+=" where no between ? and ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			rs = pstmt.executeQuery();
			List<Article> list =new ArrayList<>(); 
			Article dto =null;
			while (rs.next()) {
				dto = new Article();
				dto.setArticle_no(rs.getInt("no"));
				dto.setWriter_id(rs.getString("writer_id"));
				dto.setWriter_name(rs.getString("writer_name"));
				dto.setTitle(rs.getString("title"));
				dto.setRegdate(rs.getDate("regdate"));
				dto.setRead_cnt(rs.getInt("read_cnt"));
				list.add(dto);
			}
			return list;
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
	}
	
	public int selectCount(Connection conn) throws SQLException{
		PreparedStatement pstmt =null;
		ResultSet rs = null;

		try {
			String sql = " SELECT count(*) from board_article ";			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if(rs.next()) return rs.getInt(1);
			

			return 0;
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
	}

	public int insert(Connection conn, Article article) throws SQLException{

		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			String sql = " insert into board_article "
					+ " (article_no, writer_id, writer_name, title, content) "
					+ " values (seq_board_article.nextval,?,?,?,?) ";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, article.getWriter_id());
			pstmt.setString(2, article.getWriter_name());
			pstmt.setString(3, article.getTitle());
			pstmt.setString(4, article.getContent());
			int insertedCnt = pstmt.executeUpdate();

			return insertedCnt;
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
			//JdbcUtil.close(conn);
		}



	}
}
