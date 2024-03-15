package chap02;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // ctrl + shift + o
		
		int a = input.nextInt();
		 
		int sum = 0;
		
		while (a>0)
		{
		sum += a % 10; //7
		a /= 10; // 
					
		}
		System.out.println(sum);		
		 
//		
//		int b = (a%10); //4
//		
//		int c = (a/10)%10; //9
//		
//		int d = ((a/100)); //1
//		
//	System.out.println(b+c+d);
	}
//   
}
