package Arr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2739 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		// N에 집어넣기 (문자열로 받음으로 정수로 선언해줘야함)

		for (int i = 1; i <= 9; i++) {
			System.out.println(N + " * " + i + " = " + N * i);
		}

	}
}



