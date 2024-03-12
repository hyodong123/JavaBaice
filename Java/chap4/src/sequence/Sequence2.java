package sequence;
import java.util.Scanner;
public class Sequence2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("금액을 입력하세요(원)");
			int amount = scanner.nextInt();
			
			int five = amount/500;
			int hundred = (amount%500)/100;
			
			System.out.println("500원 동전" + five + "개와 100원 동전" + hundred + "개가 필요합니다." );
	}

}