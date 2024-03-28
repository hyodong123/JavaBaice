package Arr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_27433 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		long sum = 1;
		for (int i = 1; i <= N; i++) {
			sum *= i;

		}
		// long a = sum;  
		System.out.print(sum);
	}
}