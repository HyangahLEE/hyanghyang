package days05;

public class Ex12eseses {


		/*1. 2~10까지의 홀수 합 출력
		   ㄱ. for문 사용 ( break 사용 )
*/

		/*package days06;

		public class Test01 {

			public static void main(String[] args) {

				
				int sum=0;
				for (int i = 2;; i++) {
					if(10<i) break;
					
					else if(i%2 !=0) {
						sum += i;
						System.out.printf(i==10||i == 9?"%d":"%d+",i);
					}			
					
				}
				
				System.out.printf("=%d",sum);
				

			}

		}


		   ㄴ. while문 사용 ( continue 사용 )

		package days06;

		public class Test01 {

			public static void main(String[] args) {
				
				int i=2, sum=0;
				
				while (i<=10) {
					
					if(i%2!=0) {
						sum +=i;
						System.out.printf(i==10||i==9?"%d":"%d+",i);
						 i++; 
					}
					
					else i++; continue;
					
					
				}
				
				System.out.printf("=%d",sum);
				
			}
		}

		2. 두 정수를 입력받아서 두 정수사이의 홀수의 합 출력
		    n , m

		package days06;

		import java.util.Scanner;

		public class Test01 {

			public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
				
				System.out.print("> 첫번째 수를 입력하세요 : ");
				int n = scanner.nextInt();
				System.out.print("> 두번째 수를 입력하세요 : ");
				int m = scanner.nextInt();
				
				int sum=0;
				
				if(m<n) {
					int temp = n;
					n = m;
					m = temp;			
				}		
					
				for (int i = n;i<=m;i++ ) {
								
					if(i%2 !=0) {
						sum += i;
						System.out.printf(i==m||i == m-1?"%d":"%d+",i);
					}			
					
				}
				
				System.out.printf("=%d",sum);
				
			}
		}


		 
		3. 구구단 출력
		  ㄱ. 가로 출력
		package days06;

		public class Test01 {

			public static void main(String[] args) {
				
				for (int i = 2; i <=9; i++) {
					for (int j = 1; j <=9; j++) {
						
							System.out.printf("%d * %d = %d\t",i,j,i*j);
					}
					
					System.out.println();
					
				}
			}
		}	
				




		  ㄴ. 세로 출력
		package days06;

		import java.util.Scanner;

		public class Test01 {

			public static void main(String[] args) {
				
				for (int i = 1; i <=9; i++) {
					for (int j = 2; j <=9; j++) {
					
						System.out.printf("%d * %d = %d\t",j,i,i*j);
					}
					
					System.out.println();
					
				}
				
			}
		}

		  ㄷ. 아래와 같이 출력. 
		       2단 3단 4단
		       5단 6단 7단
		       8단 9단
		       




		package days06;

		import java.util.Scanner;

		public class Test01 {

			public static void main(String[] args) {



				for (int k = 1; k <=3; k++) {
					for (int i = 1; i <=9; i++) {
						for (int j = 3*k-1; j <=3*k+1 && j<10; j++) {

							System.out.printf("%d * %d = %d\t",j,i,i*j);
						}

						System.out.println();

					}

					System.out.println();

				}
			}
		}
		
	}
}
*/
}
