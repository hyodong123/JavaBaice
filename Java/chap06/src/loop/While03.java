package loop;
import java.util.Scanner;


public class While03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int bcontinue = 1;
		
		while (bcontinue != 0) {
			
			System.out.println("숫자를 입력하세요. : ");
			Scanner input = new Scanner(System.in);
			int num = input.nextInt();
			
			if (num % 2 == 0)  {
				System.out.println(" >> 짝수입니다.");	
			}
			else {
				System.out.println(" >> 홀수입니다.");
			}
		System.out.println("계속 하시겠습니까? (0/1) : ");		
		bcontinue = input.nextInt();
		}
		System.out.println("다음에 또 봐요~~~");      
	}
	}