package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Continue01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

			for (int a = 1; a <= 9; a++) {
				for (int i = 1; i <= 9; i++) {
					if (i == 4 || i == 7) {
						continue;
					}
					System.out.println(a + "X" + i + " = " + (a * i));
				}
			}
	}
}