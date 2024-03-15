package chap02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
			int sec = input.nextInt();
			int min = sec/60; 
			int hour = min/60;
			
		System.out.println( hour + "시간 " + min + "분 " + sec%60 + "초" );
		
		}

}
