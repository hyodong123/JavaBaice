package Scanner;
import java.util.Scanner;
public class Scanner02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.println("반지름을 입력하세요 (cm):");
		        double radius = scanner.nextDouble();
		        double area = Math.PI * radius * radius;
		        System.out.println("원의 넓이는: " + area + " 제곱센티미터");
		    }
	}
