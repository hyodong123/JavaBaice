package loop;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("숫자를 입력하세요 : ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();

		System.out.println("구구단 " + num + "단");

		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		

			}
		}
}