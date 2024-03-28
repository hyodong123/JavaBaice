package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11720 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int n = Integer.parseInt(br.readLine());
		
		String number = br.readLine();
		 
		int result = 0;
		for(int i = 0; i < number.length(); i++) {
			
			int num = Integer.parseInt(String.valueOf(number.charAt(i)));
			result += num;
		}
	System.out.println(result);	

	}

}
