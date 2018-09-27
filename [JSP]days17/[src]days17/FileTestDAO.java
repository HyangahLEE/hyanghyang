package days17;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.util.JdbcUtil;

import days16.replyboard.ReplyBoardDTO;

public class FileTestDAO {

	//싱글톤
	private static FileTestDAO dao = null;
	private FileTestDAO() {}
	public static FileTestDAO getInstance() {
		if( dao == null ) {
			dao = new FileTestDAO();
		}
		return dao;
	}

	
	public int insert(Connection conn,FileTestDTO dto) throws SQLException {
		int result = 0;
		String sql = " insert into filetest "
				   + " ( num, subject, filesystemname, originalfilename, filelength )"
				   + " values "
				   + " (seq_filetest.nextval, ? ,?, ? ,? ) ";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getSubject());
			pstmt.setString(2, dto.getFileSystemName());
			pstmt.setString(3, dto.getOriginalFileName());
			pstmt.setLong(4, dto.getFilelength());
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("> FileTestDAO.insert()");
			e.printStackTrace();
		}finally {			
			try {pstmt.close(); } catch (SQLException e) {e.printStackTrace();}
		}
		return result;
	
	}
	public ArrayList<FileTestDTO> selectFileList(Connection conn) {
		
		ArrayList<FileTestDTO> list = new ArrayList<>();;
		String sql = " select num, subject, filesystemname, originalfilename, filelength "
					+ " from filetest "
				    + " order by num desc ";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			FileTestDTO dto = null;
			while (rs.next()) {
				dto = new FileTestDTO();
				dto.setNum(rs.getInt("num"));
				dto.setSubject(rs.getString("subject"));
				dto.setFileSystemName(rs.getString("fileSystemName"));
				dto.setOriginalFileName(rs.getString("originalFileName"));
				dto.setFilelength(rs.getLong("filelength"));
				list.add(dto);
			}
		} catch (SQLException e) {
			System.out.println("> dao.selectFileList() : ");
			e.printStackTrace();
		}finally {
			try {pstmt.close(); } catch (SQLException e) {e.printStackTrace();}
			try {rs.close(); } catch (SQLException e) {e.printStackTrace();}
		}
		
		return list;
	}
	
	
	public int delete(Connection conn,int num) {
		int result = 0;
		String sql = " delete from filetest where num=? ";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("> dao.delete() :");
			e.printStackTrace();
		}finally {
			try {pstmt.close(); } catch (SQLException e) {e.printStackTrace();}
			try {conn.close(); } catch (SQLException e) {e.printStackTrace();}
		} 
		
		return result;
	}
	
	
	public FileTestDTO getDTO(Connection conn, int num) {
		
		String sql = " select num, subject, filesystemname, originalfilename, filelength "
					+ " from filetest "
				    + " where num = ? ";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		FileTestDTO dto = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				dto = new FileTestDTO();
				dto.setNum(rs.getInt("num"));
				dto.setSubject(rs.getString("subject"));
				dto.setFileSystemName(rs.getString("fileSystemName"));
				dto.setOriginalFileName(rs.getString("originalFileName"));
				dto.setFilelength(rs.getLong("filelength"));
				
			}
		} catch (SQLException e) {
			System.out.println("> dao.selectFileList() : ");
			e.printStackTrace();
		}finally {
			try {pstmt.close(); } catch (SQLException e) {e.printStackTrace();}
			try {rs.close(); } catch (SQLException e) {e.printStackTrace();}
		}
		
		return dto;
	}
	public int update(Connection conn, FileTestDTO dto) {
		int result = 0;
		String sql = " update filetest  "
				   + " set subject= ?,fileSystemName=?,originalFileName=?,filelength=?"
				   + " where num = ? ";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getSubject());
			pstmt.setString(2, dto.getFileSystemName());
			pstmt.setString(3, dto.getOriginalFileName());
			pstmt.setLong(4, dto.getFilelength());
			pstmt.setInt(5, dto.getNum());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("> dao.update() :");
			e.printStackTrace();
		}finally {
			try {pstmt.close(); } catch (SQLException e) {e.printStackTrace();}
			try {conn.close(); } catch (SQLException e) {e.printStackTrace();}
		} 
		
		return result;
		
	}
}
