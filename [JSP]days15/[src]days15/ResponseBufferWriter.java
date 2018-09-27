package days15;


import java.io.PrintWriter;
import java.io.StringWriter;

//1. 출력 스트림
public class ResponseBufferWriter extends PrintWriter{

	public ResponseBufferWriter() {
		super(new StringWriter(4096));
	}
	
	public String toString() {
		return ((StringWriter)super.out).toString();
	}

}
