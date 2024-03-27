package Scanner;
import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("정수 타입의 숫자를 입력하세요");
        int numInt = scanner.nextInt();
        
        System.out.println("실수 타입의 숫자를 입력하세요");
        double numDouble = scanner.nextDouble();
        
        System.out.println(numInt + " + " + numDouble + " = " + (numInt + numDouble));
        System.out.println(numInt + " - " + numDouble + " = " + (numInt - numDouble));
        System.out.println(numInt + " * " + numDouble + " = " + numInt * numDouble);
        System.out.println(numInt + " / " + numDouble + " = " + numInt / numDouble);
      }
}