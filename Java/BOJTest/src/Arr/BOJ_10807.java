package Arr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10807 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		// 1. 첫번째 줄 N입력 (토큰을 만드는 갯수이다.)

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// 2. 공백으로 구분 할 입력받은 값을 " "으로 *토큰화 해서 N(토큰) 만큼 나열
		int v = Integer.parseInt(br.readLine());
		// 3. 세번쨰 줄 비교할 숫자 입력받음

		int count = 0;
		// for문을 돌때마다 초기화되면 안됌
		for (int i = 1; i <= N; i++) {
			// for문을 N만큼 N번 실행
			int a = Integer.parseInt(st.nextToken());
			// if
			if (v == a) {
				// 토근들을 N번만큼 비교
				count++;
				// 카운트는 이프가 몇번이나 총족되는지 횟수를 셈 증감이 되니깐
			} 
		}
		System.out.println(count);

	}

}
