package chap02;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		int r = input.nextInt();
		int h = input.nextInt();
		double pi = 3.14;

		System.out.println("원기둥의 밑면 반지름은? " + r); 
		System.out.println("원기둥의 높이는? " + h); 
		System.out.println("원기둥의 부피는? " + pi*r*r*h); 
	}
}
