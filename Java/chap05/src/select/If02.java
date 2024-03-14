package select;

import java.util.Scanner;
public class If02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		
		int a = input.nextInt();
		
		if (a % 2 == 0) {
			System.out.println("짝수입니다.");
		 }
			else {
				System.out.println("홀수입니다.");
		}
	}

}
