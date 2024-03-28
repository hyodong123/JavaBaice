package loop;


import java.util.Scanner;

public class star03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("숫자를 입력하세요 : ");
        int num = input.nextInt(); // 사용자 입력을 읽기

        // 행 반복
        for (int i = 1; i <= num; i++) {
            // 공백 출력 (오른쪽 정렬을 위한 공백)
            for (int k = 1; k <= num - i; k++) {
                System.out.print(" ");
            }
            // 별표 출력
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // 다음 행으로 이동
        }
    }
}