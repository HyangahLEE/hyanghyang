package days06;

import java.sql.Connection;

import com.util.ConnPool;

public class Ex08 {

	public static void main(String[] args) throws InterruptedException {
		//ConnPool �׽�Ʈ
		Connection conn = null;
		
		ConnPool pool = ConnPool.getConnPool();
		conn = pool.getConnection();
		System.out.println(conn);
		
		for (int i = 1; i <=8; i++) {
			conn = pool.getConnection();
		}
		System.out.println(" END ");
		//Ŀ�ؼ� Ǯ = Conn Conn Conn Conn -> ����
		//										    	<- ��ȯ
		// �������
	}

}
