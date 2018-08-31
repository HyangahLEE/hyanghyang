package days02;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

//DBCP DataBase Connection Poolky
//> DB 처리를 하는 서블릿 클래스.
//디비연동하려면 ojdbc필요함!! lib파일에!!!
//C:\Program Files\Java\jre1.8.0_172\lib\ext 여기에 ojdbc파일이 있으면lib파일에 없어도 톰캣이 인식한다.
//계속 객체를 생성하는 것 보다 한번 생성 후 그 객체를 계속 활용하는 것이 더 효율적
//사용할 시점에 객체를 생성하는 것 보다 미리 connectionPool에 객체를 생성 후에 사용하는 것이 더 빠름
public class DBCPinit extends HttpServlet{

	private Connection connection;

	@Override
	public void init() throws ServletException {
		loadJDBCDriver();
		initConnectionPool();
	}

	private void initConnectionPool() {
		try {
			
			//web.xml에다가 파라미터 값만 설정하면 따로 수정할 필요없다.일일이 서블릿 하나하나 수정하는게 아니라 web.xml만 수정하면댐
			//web.xml에서 파라미터 값이 없으면 null값
			//하나의 서블릿이 아닌 전반적으로 초기화 하려면 ServletContextListener 사용
			 String url = "jdbc:oracle:thin:@localhost:1521:xe";
	         String userid = this.getInitParameter("userid");
	         String password = "tiger";

			 connection = DriverManager.getConnection(url, userid, password);
			 System.out.println("> 커넥션 풀 생성 완료");
		} catch (Exception e) {
			System.out.println("> 2. "+e.toString());
		}
	}
	
	private void loadJDBCDriver() {
		try {
			  Class.forName("oracle.jdbc.driver.OracleDriver");//드라이브 로딩
			  System.out.println("> loadJDBCDriver 로딩 완료");
		} catch (Exception e) {
			System.out.println("> 1. "+e.toString());
		}	
	}

	
	
}
