package select;

import java.util.Scanner;
public class Switch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Input = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		
		int a = Input.nextInt();
		
		if(a > 0);
		
	switch (a % 2) {
		case 0:
			System.out.println("짝수입니다.");
			break;
		case 1 :
			System.out.println("홀수입니다.");
			break;
	}
	}

}
