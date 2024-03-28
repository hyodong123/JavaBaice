package loop;

import java.util.Scanner;

public class For05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("숫자를 입력하세요 : ");
		Scanner input = new Scanner(System.in);	
		int num = input.nextInt();
		
		for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}