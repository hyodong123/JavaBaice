package chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;
		int sum = 0;

		do {
			System.out.print("양의 정수를 입력하세요 : ");
			num = Integer.parseInt(br.readLine());
			if (num < 0) {
				break;
			}if ( num %2 == 0)
			sum += num;
		} while (true);
		System.out.println("입력한 양의 정수 중에서 짝수의 합은 " + sum);
	}

}
