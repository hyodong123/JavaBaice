package sequence;
	import java.util.Scanner;
		public class Sequence01 {
	
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner scanner = new Scanner(System.in);
				
				System.out.println("변수 a에 넣을 숫자 입력");
				int a = scanner.nextInt();
				System.out.println("변수 b에 넣을 숫자 입력");
				int b = scanner.nextInt();
		
				int temp = a;
				a = b;
				b = temp;
	
				System.out.println("Swapping 결과 >");
				System.out.println("변수 a의 값 =" + a);
				System.out.println("변수 b의 값 =" + b);
			}

}
