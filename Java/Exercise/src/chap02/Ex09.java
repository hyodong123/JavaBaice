package chap02;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//  total >= 140 a >=70, (b&c >= 30) || (b+c >= 80)
		
		int	a = sc.nextInt();  //전공
		System.out.print("전공 이수 학점 : " );
		
		int	b = sc.nextInt(); //교양
		System.out.print("교양 이수 학점 : " );
		
		int	c = sc.nextInt();  //일반
		System.out.print("일반 이수 학점 : ");
        
		int d = a+b+c; // 총 학점
        
		if(d >= 140) {
			if(a >= 70) {
				if((b&c) >= 30 || b+c >= 80) {
					System.out.println("졸업 가능");					
				}
			}
		}else {
			System.out.println("졸업 불가능");
		}
			
		
	 
	}

}
