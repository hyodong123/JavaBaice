package testing;
import java.util.Scanner;
public class tasting01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.print("숫자를 입력하세요 : ");
            int number = scanner.nextInt(); // 숫자 입력 받음
            
            // 입력된 숫자가 짝수인지 홀수인지 판별
            if (number % 2 == 0) {
                System.out.println(">> 짝수입니다.");
            } else {
                System.out.println(">> 홀수입니다.");
            }

            // 계속할지 여부 물어보기
            System.out.print("계속 하시겠습니까? (0-멈춤/1-계속) : ");
            choice = scanner.nextInt();
        } while (choice != 0);

        scanner.close();
    }
}
