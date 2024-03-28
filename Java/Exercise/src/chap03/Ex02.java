package chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		
		switch (a) {
		case 1: {System.out.println("아주 잘했습니다.");
		break;}
		case 2,3 : {System.out.println("잘했습니다.");
		break;}
		case 4,5,6 : {System.out.println("보통입니다.");
		break;}
		default :
			System.out.println("노력해야겠습니다.");
	} 
	}
}

