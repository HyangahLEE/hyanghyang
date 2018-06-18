package days05;

public class Ex02 {


		public static void main(String[] args) {
			// 문제) 1~10 까지의 합을 출력
			int i = 10 , sum = 0;
			for ( ;; ) {
				if( i == 0 ) break;
				
				//if( i == 1)   System.out.printf("%d", 11- i);
				//else          System.out.printf("%d+", 11- i);			
				
				//System.out.printf( i==1?"%d":"%d+", 11- i);
				
				System.out.printf("%d+", 11- i);
				sum += i--;			
				//i--;
			}
			// sum cannot be resolved to a variable
			System.out.printf("\b=%d", sum);
			
			//int n = 1+2+3+4+5+6+7+8+9+10;
			//System.out.println(n);
			/*
			int sum = 0 ; //  
			for (int i = 1; i <=10 ; i++) {
				sum += i ;			 //sum = sum + i ;
				System.out.printf("%d+",i);
			}
			System.out.printf("=%d", sum);
			*/

		}

	}

