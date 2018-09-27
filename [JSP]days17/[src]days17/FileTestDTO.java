package days17;

public class FileTestDTO {
	private int num;
	private String subject;
	private String fileSystemName;
	private String originalFileName;
	private long filelength;
	
	
	public FileTestDTO() {}

	public FileTestDTO(int num, String subject, String fileSystemName, String originalFileName, int filelength) {
		super();
		this.num = num;
		this.subject = subject;
		this.fileSystemName = fileSystemName;
		this.originalFileName = originalFileName;
		this.filelength = filelength;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getFileSystemName() {
		return fileSystemName;
	}
	public void setFileSystemName(String fileSystemName) {
		this.fileSystemName = fileSystemName;
	}
	public String getOriginalFileName() {
		return originalFileName;
	}
	public void setOriginalFileName(String originalFileName) {
		this.originalFileName = originalFileName;
	}
	public long getFilelength() {
		return filelength;
	}
	public void setFilelength(long filelength) {
		this.filelength = filelength;
	}
	
	
}
