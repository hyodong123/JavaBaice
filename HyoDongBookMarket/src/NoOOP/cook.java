package NoOOP;

import java.util.Scanner;

public class cook {

	   static final int num = 4;

	   static String[][] bookList = { { "ID2401", "쉽게 배우는 자바 프로그래밍 2판", "우종정", "한빛아카데미", "20,000원" },
	         { "ID2402", "코딩 자율학습 HTML+CSS+자바스크립트", "김기수", "길벗", "30,000원" },
	         { "ID2403", "Do It! 자료구조와 함께 배우는 알고리즘 입문 - 자바편", "보요시바타", "이지스퍼블리싱", "25,000원" } };

	   static int[] cartList = { 0, 0, 0 };
	   static int numCartItem = 0;

	   public static void main(String[] args) {

	      displaywelcom();
	      boolean quit = false;
	      while (!quit) {
	         int menu = displayGetMenu();
	         switch (menu) {
	         case 1:
	            menuBookList();
	            break;
	         case 2:
	            menuCartList();
	            break;
	         case 3:
	            menuAddCartItem();
	            break;
	         case 4:
	            menuClearCart();
	            break;
	         case 0:
	            menuExit();
	            quit = true;
	            break;

	         default:
	            menulongnumber();

	         }
	      }
	   }

	   static void displaywelcom() {
	      String welcom = "*****************************************\r\n"
	            + "*    Welcome to Hyejeong Book Market    *\r\n" + "*****************************************";
	      System.out.println(welcom);
	   }

	   static int displayGetMenu() {
	      String menuStr = "=========================================\r\n" + "1. 도서 목록 보기\r\n" + "2. 장바구니 보기\r\n"
	            + "3. 장바구니에 도서 추가\r\n" + "4. 장바구니 비우기\r\n" + "0. 종료\r\n"
	            + "=========================================\r\n";

	      System.out.println(menuStr);
	      System.out.print(">> 메뉴 선택 : ");
	      Scanner sc = new Scanner(System.in);
	      return sc.nextInt();
	   }

	   static void menuBookList() {
	      String list = "------------------------------------------------------------------------\r\n"
	            + "ID2401, 쉽게 배우는 자바 프로그래밍 2판, 우종정, 한빛아카데미, 20,000원, \r\n"
	            + "ID2402, 코딩 자율학습 HTML+CSS+자바스크립트, 김기수, 길벗, 30,000원, \r\n"
	            + "ID2403, Do It! 자료구조와 함께 배우는 알고리즘 입문 - 자바편, 보요시바타, 이지스퍼블리싱, 25,000원, \r\n"
	            + "------------------------------------------------------------------------";
	      System.out.println(list);
	   }

	   static void menuCartList() {
	      if (numCartItem == 0) {
	         System.out.println("장바구니에 담긴 상품이 없습니다.");
	      } else {
	         System.out.println("장바구니 목록:");
	         for (int i = 0; i < cartList.length; i++) {
	            if (cartList[i] != 0) {
	               System.out.println(bookList[i][1] + " - " + bookList[i][4]);
	            }
	         }
	      }

	   }

	   static void menuAddCartItem() {
	      Scanner sc = new Scanner(System.in);
	      System.out.println(">> 추가할 도서 ID 입력 :");
	      String bookId = sc.nextLine();
	      boolean found = false; //
	      for (int i = 0; i < bookList.length; i++) {
	         if (bookList[i][0].equals(bookId)) {
	            System.out.println(">> 장바구니 추가 :" + bookList[i][1]);
	            found = true;
	            break;
	         }
	      }

	      if (!found) {
	         System.out.println("다시 입력하세요");
	      }
	      while (!found)
	         ;

	   }

	   static void menuClearCart() {
	      for (int i = 0; i < cartList.length; i++) {
	         cartList[i] = 0;
	      }
	      System.out.println();
	   }

	   static void menuExit() {
	      System.out.println(">> ck를 종료합니다. ");
	   }

	   static void menulongnumber() {
	      System.out.println("없는 메뉴입니다. 0번부터 4번까지의 숫자를 입력해주세요");
	   }



	}

