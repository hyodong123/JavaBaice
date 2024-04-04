package NoOOP;

import java.util.Scanner;

public class HyoDongBookMarket {

    static final int NUM_BOOKS = 3;

    static String[][] bookList = { 
        { "ID2401", "쉽게 배우는 자바 프로그래밍 2판", "우종정", "한빛아카데미", "20,000원" },
        { "ID2402", "코딩 자율학습 HTML+CSS+자바스크립트", "김기수", "길벗", "30,000원" },
        { "ID2403", "Do It! 자료구조와 함께 배우는 알고리즘 입문 - 자바편", "보요시바타", "이지스퍼블리싱", "25,000원" } 
    };

    static int[] cartList = new int[NUM_BOOKS];
    static int numCartItem = 0;

    public static void main(String[] args) {
        displayWelcome();
        boolean quit = false;
        while (!quit) {
            int menu = displayAndGetMenu();
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
                    menuInvalidNumber();
            }
        }
    }

    static void displayWelcome() {
        String welcome = "*****************************************\n" +
                         "*    Welcome to Hyodong Book Market    *\n" +
                         "*****************************************";
        System.out.println(welcome);
    }

    static int displayAndGetMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=========================================");
        System.out.println("1. 도서 목록 보기");
        System.out.println("2. 장바구니 보기");
        System.out.println("3. 장바구니에 도서 추가");
        System.out.println("4. 장바구니 비우기");
        System.out.println("0. 종료");
        System.out.println("=========================================");
        System.out.print(">> 메뉴 선택: ");
        return scanner.nextInt();
    }

    static void menuBookList() {
        System.out.println(">> 도서 목록");
        System.out.println("------------------------------------------------------------------------");
        for (String[] book : bookList) {
            System.out.printf("%s, %s, %s, %s, %s\n", book[0], book[1], book[2], book[3], book[4]);
        }
        System.out.println("------------------------------------------------------------------------");
    }

    static void menuCartList() {
        if (numCartItem == 0) {
            System.out.println("장바구니에 담긴 상품이 없습니다.");
        } else {
            System.out.println("장바구니 목록:");
            for (int i = 0; i < cartList.length; i++) {
                if (cartList[i] != 0) {
                    System.out.printf("%d권, %s - %s\n", cartList[i], bookList[i][1], bookList[i][4]);
                }
            }
        }
    }

    static void menuAddCartItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(">> 추가할 도서 ID 입력: ");
        String bookId = scanner.next();
        boolean found = false;

        for (int i = 0; i < bookList.length; i++) {
            if (bookList[i][0].equals(bookId)) {
                cartList[i]++;
                numCartItem++;
                System.out.println(">> 장바구니 추가: " + bookList[i][1]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(">> 잘못된 도서 ID입니다. 도서 목록에 있는 ID를 입력하세요.");
        }
    }

    static void menuClearCart() {
        for (int i = 0; i < cartList.length; i++) {
            cartList[i] = 0;
        }
        numCartItem = 0;
        System.out.println(">> 장바구니가 비워졌습니다.");
    }

    static void menuExit() {
        System.out.println(">> 	Hyodong Book Market을 종료합니다.");
    }

    static void menuInvalidNumber() {
        System.out.println(">> 잘못된 번호입니다. 0부터 4까지의 번호 중에서 선택해주세요.");
    }
}