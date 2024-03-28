package loop;

import java.util.Scanner;

public class For6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("숫자를 입력하세요 : ");
		Scanner input = new Scanner(System.in);

	
		for (int i = 1; i <= 9; i++) {
			System.out.printf("\n[ 구구단 %d단 ]\n", i);
			for (int j = 1; j <= 9; j++) {

				System.out.printf("%d x %d = %d\n", i, j, i * j);
			}
		}
	}

}
