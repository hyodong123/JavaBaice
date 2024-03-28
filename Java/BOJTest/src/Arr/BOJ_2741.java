package Arr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2741 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 자연수 N이 주어짐
		int N = Integer.parseInt(br.readLine());
		int i;
		int[] M = new int[N];//0 1 2 3 4  1 2 3 4 5

		// 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

		for (i = 1; i <= N; i++) {
			M[i-1] = i;
			System.out.println(M[i-1]);
		}

	}

}
