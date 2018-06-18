package tennis;

import java.io.Console;
import java.util.Random;
import java.util.Scanner;



public class SelectedGame extends GameValues{

	Scanner sc = new Scanner(System.in);
	
	void getName() {

		sc.nextLine();
		System.out.println("♠ Team1 player입력 : ");
		String playerName1= sc.nextLine();

		System.out.println("♠ Team2 player입력 :  ");
		String playerName2=sc.nextLine();

		p1=playerName1.split("\\s* ");
		p2=playerName2.split("\\s* ");

		for (int i = 0; i < p1.length; i++) {
			System.out.println(" ♠ team1 선수 명: "+ p1[i]+ " ");
		}
	
		for (int i = 0; i < p2.length; i++) {
			System.out.println(" ♠ team2 선수 명: " +p2[i]+ " ");
		}
	}

	void setNum(int s_gender) {
		
		if(s_gender==MAN) {
			System.out.println("[ 세트수 선택하시오.]");

			System.out.println("1. 3세트\t 2.5세트");
			setNum =sc.nextInt();

			if(setNum==1) {setNum=3;}
			else if(setNum==2){setNum=5;}

		}
	}

	int selectedGender() {

		System.out.printf("%d. 여자\n%d. 남자\n",WOMAN,MAN);
		if(s_menu==2){
			System.out.println("3. 혼합복식");
		}
		s_gender = sc.nextInt();
		if(s_gender >3) System.out.println(" 오류 !!");
		return s_gender;
	}

	void dispMenus() {

		System.out.println("[게임 종목 선택]");
		for (int i = 0; i < menus.length; i++) {
			System.out.printf("%d. %s\t\n", i+1, menus[i]);
		}
		s_menu = sc.nextInt();
		if(s_menu >4) System.out.println(" 오류 !!");
		if(s_menu==3) {
			System.out.println("--게임종료--");
			System.exit(0);}
	}
}


