package days29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Ex06 {

	public static void main(String[] args) {
		
	     try {
	    	// URL 객체 ? 
			URL url = new URL("https://www.daum.net");
			
			// InputStream is = System.in;
			InputStream is = url.openStream();
			
			try( BufferedReader br = 
					new BufferedReader(new InputStreamReader(is)) ){
				String line = null;
				while(( line = br.readLine()) != null) {
					System.out.println(line);
				}
			}catch(Exception e1) {}
			
		} catch (MalformedURLException e) { 
			e.printStackTrace();
		} catch (IOException e) { 
			e.printStackTrace();
		}
	    

	}

}





