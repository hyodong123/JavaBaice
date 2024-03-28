package string;

import java.util.Scanner;

public class Break01 {
	public static void main(String[] args) { // TODO Auto-generated method stub
		System.out.println("숫자 입력: ");
		Scanner input = new Scanner(System.in);
		// 양의 숫자 입력 받기
		int sum = 0;
		int num = 0;
//		while (true) {
//			 if (num > 0){
//				int sum = 0;
//				for (int i = 1; i <= num; i++)
//					sum += i;
//				if (num == 0) {
//				System.out.println("1부터 " + num + "까지의 합 : " + sum);
//				break;
//			}
//			else {
//				System.out.println("0보다 큰 숫자를 입력하세요.: ");
//			}
//		}
//	}

		while (true) {
			num = input.nextInt();
			if (num > 0) {
				break;
			}
			System.out.println("0보다 큰 숫자 입력 : ");

		}
		for (int i = 1; i <= num; i++) {

			sum += i;
		}
		System.out.println("1부터 " + num + "까지의 합 : " + sum);
	}

}
