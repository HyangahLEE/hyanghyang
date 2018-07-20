package days04.cstvsBaord;

import java.sql.Date;

public class BoardDTO {


	
	private char ismode;
	private String content;
	private Date writeDate;
	private int seq;
	private int readed ;
	private String email;
	private String writer;
	private String pwd;
	private String title;
	
	public BoardDTO() {}
	
	
	
	
	public BoardDTO(char ismode, String content, String email, String writer,
			String pwd, String title) {
		super();
		this.ismode = ismode;
		this.content = content;
		this.email = email;
		this.writer = writer;
		this.pwd = pwd;
		this.title = title;
	}
	
	/*public BoardDTO(Date writeDate, int seq, int readed) {
		super();
		this(ismode, content, email,writer,pwd,title);
		this.writeDate = writeDate;
		this.seq = seq;
		this.readed = readed;
	}*/
	
	public BoardDTO(char ismode, String content, Date writeDate, int seq, int readed, String email, String writer,
			String pwd, String title) {
		super();
		this.ismode = ismode;
		this.content = content;
		this.writeDate = writeDate;
		this.seq = seq;
		this.readed = readed;
		this.email = email;
		this.writer = writer;
		this.pwd = pwd;
		this.title = title;
	}
	
	public char getIsmode() {
		return ismode;
	}
	public void setIsmode(char ismode) {
		this.ismode = ismode;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public int getReaded() {
		return readed;
	}
	public void setReaded(int readed) {
		this.readed = readed;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
}
