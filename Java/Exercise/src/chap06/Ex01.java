package exercise;

public class Ex01 {

    // Circle 클래스 정의
    static class Circle {
        int radius; // 원의 반지름

        // 생성자 메서드
        Circle(int radius) {
            this.radius = radius; // 반지름 초기화
        }

        // 원 정보 출력 메서드
        void show() {
            System.out.println("반지름이 " + radius + "인 원이다.");
        }
    }

    // ColoredCircle 클래스 정의 (Circle을 상속)
    static class ColoredCircle extends Circle {
        String color; // 원의 색상

        // 생성자 메서드
        ColoredCircle(int radius, String color) {
            super(radius); // 부모 클래스의 생성자 호출
            this.color = color; // 색상 초기화
        }

        // 원 정보 출력 메서드 (부모 클래스의 메서드 오버라이딩)
        void show() {
            System.out.println("반지름이 " + radius + "인 " + color + "인 원이다.");
        }
    }

    // 메인 메서드
    public static void main(String[] args) {
        Circle c1 = new Circle(5); // Circle 객체 생성
        ColoredCircle c2 = new ColoredCircle(10, "빨간색"); // ColoredCircle 객체 생성

        c1.show(); // 원 정보 출력
        c2.show(); // 색상이 있는 원 정보 출력
    }
}