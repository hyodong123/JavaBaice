package chap02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("화씨온도를 입력하시오.");
		double F = input.nextDouble();
		
		System.out.println (((5.0/9.0) * (F-32)));
		
			}

}
