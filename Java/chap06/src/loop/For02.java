package loop;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);	
		
		System.out.println("숫자를 입력하세요 : ");
		
		int num = 0, sum = 0;
		
		for (int i = 1; i <6; i++) {
			num = input.nextInt();
			sum += num;
		}
		System.out.println("5개의 숫자의 합은 " + sum + "입니다.");
	}
}