package days11;

public class Ex05 {
      public static void main(String[] args) {
	
    	  int [][] m ={  
    			       { 1,5,3,8},
    			       {2,7,6,4}  
    			  };
  		
  		//2차원 배열.
  		int [] n = new int[8]	;
  		
  		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n.length; j++) {
				n[ 4*i+j ] = m[i][j];     //잘 알아보기,
			
			}
		}
  		
}
}
