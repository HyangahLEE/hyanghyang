package days16.replyboard;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.util.JdbcUtil;

public class ReplyBoardDAO {

	//싱글톤

	private static ReplyBoardDAO dao = null;
	private ReplyBoardDAO() {}
	public static ReplyBoardDAO getInstance() {
		if( dao == null ) {
			dao = new ReplyBoardDAO();
		}
		return dao;
	}

	//페이징 처리 하고 가져오는 메서드 : 검색기능 o
	public List<ReplyBoardDTO> selectList(Connection conn,int start, int end){


		String sql="select * from ";
		sql+="(";
		sql+=" select rownum rnum, num, writer, email, subject, pass, regdate, readcount, ref, step, depth, content,ip ";
		sql+= ", case  when ( sysdate - regdate ) < 0.041667  then  'true'  else 'false'  end  new ";
		sql+=" from ( ";
		sql+="          select * from replyboard ";
		sql+=" order by ref desc, step asc  ";
		sql+="         ) ";
		sql+=")";
		sql+=" where rnum between ? and ?";	

		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<ReplyBoardDTO> list= new ArrayList<>();
		try {
		
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			rs= pstmt.executeQuery();
			ReplyBoardDTO dto = null;
			while (rs.next()) {
				dto = new ReplyBoardDTO();
				dto.setNum(rs.getInt("num"));
				dto.setWriter(rs.getString("writer"));
				dto.setEmail(rs.getString("email"));
				dto.setSubject(rs.getString("subject"));
				dto.setReadcount(rs.getInt("readcount"));
				dto.setRegdate(rs.getDate("regdate"));
				dto.setIp(rs.getString("ip"));
				dto.setStep(rs.getInt("step"));
				dto.setDepth(rs.getInt("depth"));
				//
				//dto.setNewImg(rs.getBoolean("new")); -> true
				dto.setNewImg(new Boolean(rs.getString("new")));
				list.add(dto);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {pstmt.close(); } catch (SQLException e) {e.printStackTrace();}
			try {rs.close(); } catch (SQLException e) {e.printStackTrace();}
			/*	if(conn !=null) { try {conn.close(); } catch (SQLException e) {e.printStackTrace();}}*/
		}
		
		return list;



	}
	
	//페이징 처리 하고 가져오는 메서드 : 검색기능 x
	public List<ReplyBoardDTO> selectList(Connection conn,int start, int end,String searchCondition, String searchWord){


		String sql="select * from ";
		sql+="(";
		sql+=" select rownum rnum, num,writer,email,subject,pass, regdate,readcount,ref,step,depth,content,ip ";
		sql+= ", case  when ( sysdate - regdate ) < 0.041667  then  'true'  else 'false'  end  new ";
		sql+=" from ( ";
		sql+="          select * from replyboard ";
		sql+= " where " + searchCondition + " like '%"+ searchWord +"%'";
		sql+=" order by ref desc, step asc  ";
		sql+="         ) ";
		sql+=")";
		sql+=" where rnum between ? and ?";	

		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<ReplyBoardDTO> list= new ArrayList<>();
		try {
		
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			rs= pstmt.executeQuery();
			ReplyBoardDTO dto = null;
			while (rs.next()) {
				dto = new ReplyBoardDTO();
				dto.setNum(rs.getInt("num"));
				dto.setWriter(rs.getString("writer"));
				dto.setEmail(rs.getString("email"));
				
			//dto.setSubject(rs.getString("subject"));
				String subject = rs.getString("subject"); 
				if(searchCondition.equals("subject")) {
				subject = subject.replace(searchWord
						, String.format("<span style='color:pink;background:gray;font-weight:bold'>%s</span>", searchWord));
				}
				dto.setSubject(subject);			
						
				dto.setReadcount(rs.getInt("readcount"));
				dto.setRegdate(rs.getDate("regdate"));
				dto.setIp(rs.getString("ip"));
				dto.setStep(rs.getInt("step"));
				dto.setDepth(rs.getInt("depth"));
				//
				//dto.setNewImg(rs.getBoolean("new")); -> true
				dto.setNewImg(new Boolean(rs.getString("new")));
				list.add(dto);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {pstmt.close(); } catch (SQLException e) {e.printStackTrace();}
			try {rs.close(); } catch (SQLException e) {e.printStackTrace();}
			/*	if(conn !=null) { try {conn.close(); } catch (SQLException e) {e.printStackTrace();}}*/
		}
		
		return list;



	}

	public int insert(Connection conn,ReplyBoardDTO dto) throws SQLException {
		PreparedStatement pstmt = null;
		int result = 0;

		if(dto.getNum() != 0) {//답글
			//1
			String sql = "update replyboard "
					+ " set step = step +1 "
					+ " where ref = ? and step > ? ";
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, dto.getRef());
				pstmt.setInt(2,dto.getStep());

				result =  pstmt.executeUpdate();

				//2
				sql = "insert into replyboard( "
						+ " num, writer,email, subject, pass, "
						+ " ref, step, depth, content, ip )"
						+ "  values "
						+ " (seq_replyboard.nextval, ?,?,?,?,?,?,?,?,? ) ";

				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1,dto.getWriter());
				pstmt.setString(2,dto.getEmail());
				pstmt.setString(3,dto.getSubject());
				pstmt.setString(4,dto.getPass());
				pstmt.setInt(5,dto.getRef());						
				pstmt.setInt(6,dto.getStep()+1);
				pstmt.setInt(7,dto.getDepth()+1);
				pstmt.setString(8, dto.getContent());
				pstmt.setString(9,dto.getIp());
				
				result =  pstmt.executeUpdate();


			}catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {pstmt.close(); } catch (SQLException e) {e.printStackTrace();}
				try {conn.close(); } catch (SQLException e) {e.printStackTrace();}
			}


		}else {//새글
			//1. 새글쓰기
			String sql = "insert into replyboard( "
					+ " num, writer,email, subject, pass, "
					+ " ref, step, depth, content, ip )"
					+ "  values "
					+ " (seq_replyboard.nextval, ?,?,?,?,seq_replyboard.currval,?,?,?,? ) ";
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1,dto.getWriter());
				pstmt.setString(2,dto.getEmail());
				pstmt.setString(3,dto.getSubject());
				pstmt.setString(4,dto.getPass());
				pstmt.setInt(5,dto.getStep());
				pstmt.setInt(6,dto.getDepth());
				pstmt.setString(7,dto.getContent());
				pstmt.setString(8,dto.getIp());


				result =  pstmt.executeUpdate();

			}catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {pstmt.close(); } catch (SQLException e) {e.printStackTrace();}
				try {conn.close(); } catch (SQLException e) {e.printStackTrace();}
			}

		}

		return result;


	}

	//전체 게시글 페이징 처리 없이 가져오는 메서드
	public List<ReplyBoardDTO> selectList(Connection conn){


		String sql = " select * from replyboard "
				+ " order by ref desc, step asc ";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<ReplyBoardDTO> list= new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sql);
			rs= pstmt.executeQuery();
			ReplyBoardDTO dto = null;
			while (rs.next()) {
				dto = new ReplyBoardDTO();
				dto.setNum(rs.getInt("num"));
				dto.setWriter(rs.getString("writer"));
				dto.setEmail(rs.getString("email"));
				dto.setSubject(rs.getString("subject"));
				dto.setReadcount(rs.getInt("readcount"));
				dto.setRegdate(rs.getDate("regdate"));
				dto.setIp(rs.getString("ip"));
				dto.setStep(rs.getInt("step"));
				dto.setDepth(rs.getInt("depth"));
				list.add(dto);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {pstmt.close(); } catch (SQLException e) {e.printStackTrace();}
			try {rs.close(); } catch (SQLException e) {e.printStackTrace();}
			/*	if(conn !=null) { try {conn.close(); } catch (SQLException e) {e.printStackTrace();}}*/
		}
		return list;



	}

	public int updateReadcount(Connection conn, int num) {
		String sql = " update replyboard "
				+ " set readcount = readcount + 1 "
				+ " where num = ? ";
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			result = pstmt.executeUpdate();


		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {pstmt.close(); } catch (SQLException e) {e.printStackTrace();}
			/*try {conn.close(); } catch (SQLException e) {e.printStackTrace();}*/
		}
		return result;

	}
	public ReplyBoardDTO selectOne(Connection conn, int num) {
		String sql = " select * from replyboard "
				+ " where num = ? ";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ReplyBoardDTO dto = new ReplyBoardDTO();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs= pstmt.executeQuery();


			if(rs.next()) {
				dto.setNum(rs.getInt("num"));
				dto.setWriter(rs.getString("writer"));
				dto.setEmail(rs.getString("email"));
				dto.setSubject(rs.getString("subject"));
				dto.setReadcount(rs.getInt("readcount"));
				dto.setRegdate(rs.getDate("regdate"));
				dto.setIp(rs.getString("ip"));
				dto.setStep(rs.getInt("step"));
				dto.setDepth(rs.getInt("depth"));
				dto.setRef(rs.getInt("ref"));

				dto.setPass(rs.getString("pass"));
				dto.setContent(rs.getString("content"));


			}

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {pstmt.close(); } catch (SQLException e) {e.printStackTrace();}
			try {rs.close(); } catch (SQLException e) {e.printStackTrace();}
			/*if(conn !=null) {try {conn.close(); } catch (SQLException e) {e.printStackTrace();}}*/
		}


		return dto;
	}

	// 총 게시글 수 : 검색기능 o
	public int getTotalRecords(Connection conn, String searchCondition, String searchWord ) {

		int cnt = 0;
		String sql = " select count(*) cnt from replyboard ";
				sql += " where " + searchCondition + " like '%"+ searchWord+"%'";
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			pstmt = conn.prepareStatement(sql);
			rs= pstmt.executeQuery();
			rs.next();
			cnt = rs.getInt("cnt");

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {pstmt.close(); } catch (SQLException e) {e.printStackTrace();}
			try {rs.close(); } catch (SQLException e) {e.printStackTrace();}
			
		}

		return cnt;
	}
	
	
	//총 게시글 수 retrun : 검색기능x 전체 게시글 가져오기
	public int getTotalRecords(Connection conn) {

		int cnt = 0;
		String sql = " select count(*) cnt from replyboard ";
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			pstmt = conn.prepareStatement(sql);
			rs= pstmt.executeQuery();
			rs.next();
			cnt = rs.getInt("cnt");

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {pstmt.close(); } catch (SQLException e) {e.printStackTrace();}
			try {rs.close(); } catch (SQLException e) {e.printStackTrace();}
			
		}

		return cnt;
	}
	
	
	
	
	public String pagingProc(int currentPage, int pageSize, int pageBlock, int totalPages
			, String searchCondition, String searchWord) {
		//int currentPage, - 현재 페이지 번호
		//int pageSize, - 한 페이지에 출력할 게시글 수 
		//int pageBlock, - 1 2 3 4 5 ..10
		//int totalPages -총 페이지 수 
		
		int blockStart = ((currentPage-1)/pageBlock)*pageBlock+1;
		int blockEnd = blockStart+pageBlock-1;
		if(blockEnd > totalPages) blockEnd = totalPages;
		String paging = "<div style='width:100%; text-align: center'>";
		for(int i =blockStart; i <=blockEnd; i++) {
			
			if(i== currentPage) paging += i;
			else paging += String.format("<a href='list.do?page=%d&searchCondition=%s&searchWord=%s'>%d</a>", i, searchCondition, searchWord, i);
			//else paging+="<a href='list.do?page="+i+"'>"+i+"</a>";
		}
			paging +="</div>";			
			return paging;
	}
	
	public int delete(Connection conn, int num, String pass) {
		int result = 0;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String original_pass = null;
		String sql = " select pass from replyboard "
				   + " where num = ? ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			rs.next();
			original_pass = rs.getString(1);
			
			if(original_pass.equals(pass)) {
				sql = " delete from replyboard where num = ? ";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, num);
				result = pstmt.executeUpdate();
			}else {
				return -1; // 비번이 잘못됨
			}
			
		} catch (Exception e) {
			System.out.println("> ReplyBoardDAO.delete() : "+e.toString());
			
		}finally {
			try {pstmt.close(); } catch (SQLException e) {e.printStackTrace();}
			try {rs.close(); } catch (SQLException e) {e.printStackTrace();}
			try {conn.close(); } catch (SQLException e) {e.printStackTrace();}
		}
		 
		return result;
	}
	
	public int edit(Connection conn, ReplyBoardDTO dto) {
		int result = 0 ;		 
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String original_pass= null;
		String sql= "select pass from replyboard where num = ?";
		try {
			pstmt =  conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getNum());
			rs = pstmt.executeQuery();
			if( rs.next() ){
				original_pass = rs.getString("pass");
				if( original_pass.equals(dto.getPass())){
					// 수정 처리
					sql=" update replyboard ";
					sql+=" set email=?,subject=?,content=? ";
					sql+=" where num = ?";
					
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, dto.getEmail());
					pstmt.setString(2, dto.getSubject());
					pstmt.setString(3, dto.getContent());
					pstmt.setInt(4, dto.getNum());
					
					result = pstmt.executeUpdate();  // result =1
				}else{
					result = -1; // 비밀번호 틀리다.
				}
			}else{
				// 게시글 삭제된 경우
				result = -2;
			}
		} catch (SQLException e) { 
			e.printStackTrace();
		}finally{
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) { 
				e.printStackTrace();
			}
		}
		
		return result; 
	}
	
}
