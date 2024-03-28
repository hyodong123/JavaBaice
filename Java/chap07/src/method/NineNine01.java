package method;

public class NineNine01 {

   //구구단 메소드
   public static void printNineNine(int num) {
      //숫자로 주어진 부분의 구구단 출력
      System.out.println("[구구단 " + num + "단 ]");
      for(int i = 1; i <=9; i++) {
         System.out.println(num + "X" + i + " = " + (num*i));
      }
      System.out.println();
   }
   
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      for(int i = 2; i <= 9; i++) {
         printNineNine(i);
      }
      
   }

}