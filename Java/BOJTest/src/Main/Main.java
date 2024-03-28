package Main;

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int m = input.nextInt();

		if (m < n * 100) {
		System.out.println("Yes");}
		else
			System.out.println("No");

	}
}