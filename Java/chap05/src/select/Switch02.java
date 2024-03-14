package select;

import java.util.Scanner;
public class Switch02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	
		String grade = (input.next());
		
		
		switch (grade) {
		case "A","B" :
			System.out.println("아주 열심히 하셨군요~~~!!");
			break;
		case "C" :
			System.out.println("아주 열심히 하셨군요~~~!!");
			break;
		case "D" :
			System.out.println("아주 열심히 하셨군요~~~!!");
			break;
		case "F" :
			System.out.println("아주 열심히 하셨군요~~~!!");
		}
	}

}
