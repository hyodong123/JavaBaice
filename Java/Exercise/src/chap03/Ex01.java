package chap03;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if (num <= 19) {
			System.out.println("미성년");
		} else {
			System.out.println("성년");
		}
	}
}