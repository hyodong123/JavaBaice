package chap03;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(5));
	}

	static int factorial(int n) {
		int sum = 1;
		switch (n) {
		case 5:
			sum *= n--;
			// sum = sum*n--
		case 4:
			sum *= n--;
		case 3:
			sum *= n--;
		case 2:
			sum *= n--;
		case 1:
			sum *= n--;
		}
		return sum;
	}
}
