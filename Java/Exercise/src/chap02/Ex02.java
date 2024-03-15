package chap02;

import java.awt.print.Printable;
import java.util.Scanner;
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		
		int a = input.nextInt();
		
		System.out.println(a + "의 제곱은 " + (a*a));
		
	}

}
