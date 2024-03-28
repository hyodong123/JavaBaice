package chap03;

import java.sql.Struct;
import java.util.Scanner;

public class EX06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("철수 : ");
		String a = input.nextLine();
		System.out.print("영희 : ");
		String b = input.nextLine();

		if ((a.equals("s") && (b.equals("p"))
				|| (a.equals("r") && (b.equals("s")) || (a.equals("p") && (b.equals("r")))))) {
			System.out.println("철수, 승!");
		} else if ((b.equals("s") && (a.equals("p"))
				|| (b.equals("r") && (a.equals("s")) || (b.equals("p") && (a.equals("r")))))) {
			System.out.println("영희, 승!");
		} else {
			System.out.println("무승부!");
		}

	}
}