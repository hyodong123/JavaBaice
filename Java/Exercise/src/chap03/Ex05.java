package chap03;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;

  		for (a = 1; a < 20; a++) {
			for (b = 1; b < 20; b++) {
				for (c = 1; c < 20; c++) {

					if (a + b > c) {
						if (((a * a) + (b * b)) == (c * c)) {
							if (a + b + c <= 20)
							System.out.println(a + "," + b + "," + c);
					
						}
					}
				}
			}
		}
	}
}