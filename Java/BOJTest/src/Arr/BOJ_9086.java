package Arr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9086 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 입력 기능
		int T = Integer.parseInt(br.readLine());
		// T를 받기
		for(int i = 0; i < T; i++) {
			// 0부터 T까지 0++ 하면서
			String w = br.readLine();
			// for문 넣는 이유는 T를 T번 수행하기 위해 넣음
			// W를 먼저 선언시 한번만 수행됨
			System.out.print(w.charAt(0));
			// 문자열의 0번째를 받아옴
			System.out.print(w.charAt(w.length()-1)+ "\n");
			// 문자열의 -1 길이의 위치의 받아옴 + 개행
			}
		
	}

}
