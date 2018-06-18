package tennis;

import java.util.Random;

public class GetScore extends SelectedGame implements Itennistennis {

	static Random rnd = new Random();
	public static int p;
	
	static GetScore gs = new GetScore();
	//static int w=(s_menu==1)? 0: rnd.nextInt(1)+1; 
		
void getDeuce() {		
		
		if(deuceCount == 2) {
			if (deucePoint ==1) gs.pointWinner(1);
			else gs.pointWinner(2);
			return;
		}						
		Random rnd = new Random();
		p = rnd.nextInt(2)+1;	
		if(p==1 && deucePoint != 1) {
			System.out.println("팀1이 득점 했습니다.");
			if(deucePoint == 2) {
				System.out.println("==듀스==");	
				deucePoint=0;
			}
			else {
			System.out.println("팀1 advantage~!!");
			deucePoint =1;
			}	    		
		deuceCount =0;    	
		}	else if(p==2 && deucePoint!=2) { 
				System.out.println("팀2이 득점 했습니다.");
				if(deucePoint==1) {
					System.out.println("==듀스==");	
					deucePoint=0;
				}				   
				else {
					System.out.println("팀2 advantage~!!");
					deucePoint =2;
				}	    		
		deuceCount = 0;		
		
			}
		deuceCount ++;
		
		getDeuce();
		
		deuceCount = 0;
		deucePoint = 0;		
		}
	
	

	void getServe() {
		 Random rnd = new Random();
	      int a = rnd.nextInt(2);
	      if(a==1) {
	         System.out.println("\n팀1가 서브를 먼저 시작합니다.");      
	      }else System.out.println("\n팀2가 서브를 먼저 시작합니다.");


	      System.out.println();      

	      while(condition) {

	         try {
	         Thread.sleep(100);
	      } catch (InterruptedException e) {	         
	         e.printStackTrace();
	      }          
	         
	         p = rnd.nextInt(2)+1;
	        
	         gs.pointWinner(p);       // 해당 선수에 따른 랜덤 포인트 증가.
	         
	         if(t1point == t2point && t1point >=3 && t2point >= 3) {
	            System.out.println("\n==듀스==");
	            getDeuce();        
	         }         
	         gs.dispScoreBoard(); // 게임과 set을 설정함.
	      }      
	}

	
	public void dispScoreBoard() {// 점수판
		
		// int w=(s_menu==1)? 0: rnd.nextInt(1)+1; 
		System.out.println();
		if(t1point  == 4) {
			System.out.println("-------------------------");
			System.out.printf("t1 player가 Game을 가져갑니다!\n");
			t1Game ++;
			t1point=0;
			t2point=0;
			System.out.println("-------------------------");
			System.out.printf("Game Score - %d : %d\n", t1Game, t2Game);
			System.out.printf("Set Score - %d : %d\n", t1Set, t2Set);
			System.out.println("==============");
		} else if(t2point  == 4) {
			System.out.println("-------------------------");
			System.out.printf("t2 player가 Game을  가져갑니다!\n");
			t2Game ++;
			t1point=0;
			t2point=0;	   
			System.out.println("-------------------------");
			System.out.printf("Game Score - %d : %d\n", t1Game, t2Game);
			System.out.printf("Set Score - %d : %d\n", t1Set, t2Set);
			System.out.println("==============");
		}   
		if(t1Game  == 6) {
			System.out.printf("t1 player가 Set을 가져갑니다!\n");
			t1Set++;
			t1Game =0;
			t2Game =0;
			System.out.println("-------------------------");
			System.out.printf("Game Score - %d : %d\n", t1Game, t2Game);
			System.out.printf("Set Score - %d : %d\n", t1Set, t2Set);
			System.out.println("-------------------------");
		} else if(t2Game  == 6) {
			System.out.printf("t2 player가 Set을  가져갑니다!\n");
			t2Set ++;
			t1Game =0;
			t2Game =0; 
			System.out.println("-------------------------");
			System.out.printf("Game Score - %d : %d\n", t1Game, t2Game);
			System.out.printf("Set Score - %d : %d\n", t1Set, t2Set);
			System.out.println("-------------------------");
		}   

		if(t1Set  == (setNum/2)+1) {
			System.out.println("★t1이 우승하셨습니다.★");
			System.out.println(">>최종스코어<<");	
			System.out.printf("Set Score - %d : %d\n", t1Set, t2Set);
			condition=false; 
	
		} else if(t2Set  == (setNum/2)+1) {
			System.out.println("★t2이 우승하셨습니다.★");
			System.out.println(">>최종스코어<<");	
			System.out.printf("Set Score - %d : %d\n", t1Set, t2Set);
			condition=false;
		} 
		
	}

	@Override
	public void pointWinner(int p) {// 포인트 증가
		
		//p= rnd.nextInt(2)+1;
	      if(p==1) {
	         System.out.println(">> t1 득점!!");      
	         t1point ++;

	      }else {
	         System.out.println(">> t2 득점!!");   
	      t2point ++;
	      }
	      if(t1point == 4 || t2point == 4) { 
	      }else {
	         System.out.printf("[점수] %d:%d", score[t1point],score[t2point]);
	      }
		  
	}

	
	@Override
	public void WinSetGame() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void WinnerOfMatch() {
		// TODO Auto-generated method stub
		
	}

	

	
}
