package Arr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10871 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 1. N과 X를 받아야한다.
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// N과 X를 받음 토크나이저로 받았다
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		// N과 X를 토크나이로 각각 받음
		StringTokenizer j = new StringTokenizer(br.readLine(), " ");
		// 수열 A를 이루는거 N개 만큼
		int[] a = new int[N];
		// a라는 배열에 N 크기의 배열을 선언함
		for (int i = 0; i < N; i++) {
			// 배열의 i번쨰부터 (0부터) N-1까지 반복하는거다
			a[i] = Integer.parseInt(j.nextToken());
			// a라는 배열의 i번쨰들을 숫자로 나타내기 위해 인트형 선언해준거임
		}
		for (int i = 0; i < N; i++) {
			// a라는 배열안의 들어간 값을 N 만큼실행함
			if (a[i] < X) {
			// a의 배열 안에 값 i를 x보다 작다는 조건
				System.out.print(a[i] + " "); 
				// 조건에서 걸려진 a의 배열 값 i를 " " (띄어쓰기)해서 출력함
			}

		}
	}

}
