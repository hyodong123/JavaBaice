package chap03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String c = input("철수 : ");
		String y = input("영희 : ");
		
		if ((c.equals("s") && (y.equals("p"))
				|| (c.equals("r") && (y.equals("s")) || (c.equals("p") && (y.equals("r")))))) {
			System.out.println("철수, 승!");
		} else if ((y.equals("s") && (c.equals("p"))
				|| (y.equals("r") && (c.equals("s")) || (y.equals("p") && (c.equals("r")))))) {
			System.out.println("영희, 승!");
		} else {
			System.out.println("무승부!");
		}

	}
	
	private static String input(String st) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print(st);
		return input.nextLine();
	}
}
