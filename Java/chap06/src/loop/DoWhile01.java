package loop;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("숫자를 입력하세요. : ");
		int num = input.nextInt();
		int sum = 0;
				
        do {
        	sum +=num; 
        	num = input.nextInt();
        }while (num !=0);
        
        
	   System.out.print("지금까지 입력한 숫자의 합은" + sum + "입니다.");
	
	} 
}


		