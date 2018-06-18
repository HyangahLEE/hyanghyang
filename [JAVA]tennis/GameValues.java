package tennis;

import java.util.Random;
import java.util.Scanner;

public class GameValues {
	
	
	public final static int WOMAN = 1;
	public final static int MAN = 2;
	public static String [] menus = {"단식", "복식", "게임종료"};
	public static int playerNum;
	public static String[] p1 = new String[2];
	public static String[] p2=new String[2]; 

	
	public static int s_menu;
	public static int s_gender;
	public static int setNum = 3;
	public static int p;
	static int deucePoint = 0;// 어드벤티지 한번 출력
	static int deuceCount = 0; // 종료 조건
	static boolean condition=true;
	
	static int t1point = 0;		
	static int t2point = 0;	
	static int[] score = new int[] {0, 15, 30, 40, 45};
	static int t1Game = 0;		
	static int t2Game = 0;
	static int t1Set = 0;
	static int t2Set = 0;
	
	public static int getP() {
		return p;
	}
	public static void setP(int p) {
		GameValues.p = p;
	}
	
	
	
		
	}
	
	


