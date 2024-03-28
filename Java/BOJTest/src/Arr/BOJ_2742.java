package Arr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2742 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		//자연수 N
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		
		for(int i=N; 0 < i; i--){
		//		  5	 		 5 4 3 2 1
			
		System.out.println(i);
		}
	}

}
