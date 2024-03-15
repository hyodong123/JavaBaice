package chap02;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();

		if (a % 4 == 0 && a % 5 == 0) { //false
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		if (a % 4 == 0 || a % 5 == 0) { //true
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		if (!(a % 4 == 0 && a % 5 == 0)) { //true
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
