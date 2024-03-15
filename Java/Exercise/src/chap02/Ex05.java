package chap02;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			System.out.println("알파벳을 입력하세요 : ");
		
			char c = input.next().charAt(0);
			
			char c1 = (char)(c + (int)'A' - ((int)'a'));
			
			System.out.printf("%s", c1);
	}
}
