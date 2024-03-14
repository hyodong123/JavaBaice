package select;

import java.util.Scanner;

public class If01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 세 개의 숫자를 입력
		Scanner input = new Scanner(System.in);
		
		System.out.println("세 개의 숫자를 입력하세요.");
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		// 최대값 구하기
		int max = a;
		 if(b > max) {		
			 max = b;
		 if(c > max)
			 max = c;
		 }
		
		// 최대값 구하기
		 System.out.println("가장 큰 수는 " + max + "입니다.");
		 
	}

}
