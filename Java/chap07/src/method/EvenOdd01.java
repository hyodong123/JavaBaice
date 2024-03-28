package method;

import java.util.Scanner;

public class EvenOdd01 {

	public static String decideEvenOdd() {
		// 숫자를 입력
		System.out.print("숫자를 입력하세요 : ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();

		// 짝수, 홀수 판단하여 출력
		if (num % 2 == 0) {
			return ">> 짝수입니다.";
		} else {
			return ">> 홀수입니다.";
		}
	}

	public static void main(String[] args) {

		int bContinue = 1;
		
		while (bContinue != 0) { // 1이면 계속, 0이면 멈춤

			String result = decideEvenOdd();
			System.out.println(result);
			
			// 계속할 것인지 확인
			System.out.print("계속 하시겠습니까? (0/1) : ");
			
			Scanner input = new Scanner(System.in);
			bContinue = input.nextInt();
		}

		System.out.println("다음에 또 봐요~~~");

	}
	
}