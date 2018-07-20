package days04.cstvsBaord;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import days03.emp.empDTO;

public class BoardDAOImpl implements IBoardDAO {

	private Connection connection = null;

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public BoardDAOImpl(Connection connection) {
		super();
		this.connection = connection;
	}



	private PreparedStatement pstmt = null;
	private ResultSet rs= null;
	@Override
	public int insert(BoardDTO dto) throws SQLException {
		String sql ="insert into CSTVSBOARD ( seq,writer,pwd,email,title,ismode,content ) \r\n" + 
				"values (SEQ_CSTVSBOARD.nextval,?,?,?,?,?,? ) ";
		this.pstmt = this.connection.prepareStatement(sql);
		this.pstmt.setString(1,dto.getWriter());
		this.pstmt.setString(2,dto.getPwd());
		this.pstmt.setString(3,dto.getEmail());
		this.pstmt.setString(4,dto.getTitle());
		this.pstmt.setString(5, dto.getIsmode()+"");
		this.pstmt.setString(6,dto.getContent());

		int cnt = pstmt.executeUpdate();
		this.pstmt.close();
		return cnt;
	}

	public int update(BoardDTO dto) throws SQLException {
		String sql ="update CSTVSBOARD set email=?,title=?,content=?  \r\n" + 
				"where seq = ? ";
		this.pstmt = this.connection.prepareStatement(sql);


		this.pstmt.setString(1,dto.getEmail());
		this.pstmt.setString(2,dto.getTitle());
		this.pstmt.setString(3,dto.getContent());
		this.pstmt.setInt(4,dto.getSeq());

		int cnt = pstmt.executeUpdate();
		this.pstmt.close();
		return cnt;
	}

	@Override
	public void log(String message) {
		System.out.println(message);
	}



	@Override
	public void increasedReaded(int seq) throws SQLException {
		String sql = "update cstvsboard ";
		sql+= " set readed = readed +1";
		sql += " where seq = ?";
		this.pstmt = this.connection.prepareStatement(sql);
		this.pstmt.setInt(1, seq);
		this.pstmt.executeUpdate();

		this.pstmt.close();

	}



	@Override
	public int getTotalPages(int pageSize,String searchCondition, String searchWord) throws SQLException {
		int totalPages ;
		String sql = "select ceil(count(*)/?) totalPages from cstvsboard ";
		sql += " where " +searchWord + " like ?";
		this.pstmt = this.connection.prepareStatement(sql);
		this.pstmt.setInt(1, pageSize);
		this.pstmt.setString(2, "%"+searchCondition+"%");
		this.rs = this.pstmt.executeQuery();
		this.rs.next();
		totalPages = this.rs.getInt("totalPages");



		this.rs.close();
		this.pstmt.close();
		return totalPages;
	}



	@Override
	public String pageBlock(int currentPage, int pageSize, int pageBlock, int totalPages) {

		int blockStart= ((currentPage-1)/pageBlock)*pageBlock+1;
		int blockEnd=blockStart + pageBlock -1 > totalPages ? totalPages : blockStart + pageBlock-1;
		String result = "";

		if(blockStart != 1) {
			result +=String.format("| < < (%d)", blockStart-1);
		}
		for (int i = blockStart; i <=blockEnd; i++) {
			result += i== currentPage ? "["+ i+"] " : i  +" ";
		}
		if(blockEnd < totalPages) {
			result +=String.format(" >(%d) >| (%d)", blockEnd+1,totalPages);
		}
		return result;
	}

	
	@Override
	public int delete(int seq) {
		String sql = "delete from cstvsboard ";
		sql+= "where seq = ? ";
		int cnt = 0;
		try {
			this.pstmt = this.connection.prepareStatement(sql);
			this.pstmt.setInt(1, seq);
			cnt = this.pstmt.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return cnt;
	}

	@Override
	public BoardDTO selectOne(int seq) throws SQLException {
		String sql = "select seq, writer, email,title, writedate, readed, content ";
		sql +=	" from cstvsboard";
		sql += " where seq = ?";
		BoardDTO dto = null;
		this.pstmt = this.connection.prepareStatement(sql);
		this.pstmt.setInt(1,seq);

		this.rs = this.pstmt.executeQuery();

		if(rs.next()) {

			dto = new BoardDTO(); //
			dto.setSeq(rs.getInt("seq"));
			dto.setWriter(rs.getString("writer"));
			dto.setReaded(rs.getInt("readed"));
			dto.setTitle(rs.getString("title"));
			dto.setContent(rs.getString("content"));
			dto.setWriteDate(rs.getDate("writedate"));
			dto.setEmail(rs.getString("email"));

		}
		this.rs.close();
		this.pstmt.close();
		return dto ;
	}

	@Override
	public List<BoardDTO> select(int currentPage, int pageSize) throws SQLException {
		ArrayList<BoardDTO> list = null;
		String sql = "select seq,writer, email, title, readed, writedate \r\n" + 
				" from\r\n" + 
				" (select seq,writer, email, title, readed, writedate\r\n" + 
				"        ,rank() over(order by seq DESC) no\r\n" + 
				" from CSTVSBOARD)\r\n" + 
				" where no BETWEEN ? and ?";
		int start = (currentPage -1)*pageSize +1;
		int end=(currentPage -1)*pageSize +pageSize;
		this.pstmt = this.connection.prepareStatement(sql);
		this.pstmt.setInt(1, start);
		this.pstmt.setInt(2, end );
		this.rs= this.pstmt.executeQuery();

		if(rs.next()) {

			list = new ArrayList<>();
			BoardDTO dto = null;
			do {
				dto = new BoardDTO();
				dto.setSeq(this.rs.getInt(1));
				dto.setWriter(this.rs.getString(2));
				dto.setEmail(this.rs.getString(3));
				dto.setTitle(this.rs.getString(4));
				dto.setReaded(this.rs.getInt(5));
				dto.setWriteDate(this.rs.getDate(6));
				list.add(dto);


			} while (rs.next());
		}

		this.rs.close();
		this.pstmt.close();

		return list;
	}

	
	 
/*	@Override
	public List<BoardDTO> searchArticle(int SearchCondition, String SearchWord ,int currentPage, int pageSize) throws SQLException{
		BoardDTO dto = null;
		ArrayList<BoardDTO> list = null;
		String sql = "select select seq,writer, email, title, readed, writedate ";
		sql += " from CSTVSBOARD";
		switch (SearchCondition) {
		case 1: sql += " where title like ?";
		SearchWord = '%'+SearchWord+'%';		
		pstmt.setString(1, SearchWord);
			break;

		case 2: sql += " where writer like ?";
		SearchWord = '%'+SearchWord+'%';	
		pstmt.setString(1, SearchWord);
			break;

		case 3: sql += " where title like ? or content like ?";
		SearchWord = '%'+SearchWord+'%';
		pstmt.setString(1, SearchWord);
		pstmt.setString(2, SearchWord);
			break;
		}

		pstmt = connection.prepareStatement(sql);
		ResultSet rs  = pstmt.executeQuery();
		if (rs.next()) {
			list = new ArrayList<>();
			
			do {
				dto = new BoardDTO();
				dto.setSeq(this.rs.getInt(1));
				dto.setWriter(this.rs.getString(2));
				dto.setEmail(this.rs.getString(3));
				dto.setTitle(this.rs.getString(4));
				dto.setReaded(this.rs.getInt(5));
				dto.setWriteDate(this.rs.getDate(6));
				list.add(dto);
			}while (rs.next());
			
	
		} 
		this.rs.close();
		this.pstmt.close();
		

		return list;
	}
*/

	@Override
	public List<BoardDTO> search(String searchCondition, String searchWord, int currentPage, int pageSize)
			throws SQLException {
		   ArrayList<BoardDTO> list = null;

		      String sql = "select seq, writer, email, title, readed, writedate ";
		      sql += " from ";
		      sql += " ( ";
		      sql += " select seq, writer, email, title, readed, writedate ";
		      sql += " , rank() over( order by seq desc ) no ";
		      sql += " from cstvsboard ";
		      sql += " where " + searchCondition + " like ? ";
		      sql += " ) ";
		      sql += " where no between ? and ? ";

		      int start = (currentPage - 1) * pageSize + 1;
		      int end = (currentPage - 1) * pageSize + pageSize;

		      this.pstmt = this.connection.prepareStatement(sql);
		      // ?, ?,? 바인딩 변수의 매개변수 값 설정 한 후 execute~
		      this.pstmt.setString(1, "%" + searchWord + "%");
		      this.pstmt.setInt(2, start);
		      this.pstmt.setInt(3, end);
		      this.rs = this.pstmt.executeQuery();

		      if (rs.next()) {
		         list = new ArrayList<>();
		         BoardDTO dto = null;
		         do {
		            dto = new BoardDTO();
		            // seq, writer, email, title, readed, writedate
		            dto.setSeq(this.rs.getInt("seq"));
		            dto.setWriter(this.rs.getString("writer"));
		            dto.setEmail(this.rs.getString("email"));
		            dto.setTitle(this.rs.getString("title"));
		            dto.setReaded(this.rs.getInt("readed"));
		            dto.setWriteDate(this.rs.getDate("writedate"));
		            list.add(dto);
		         } while (rs.next());
		      }

		      this.rs.close();
		      this.pstmt.close();

		      return list;

	}


}
