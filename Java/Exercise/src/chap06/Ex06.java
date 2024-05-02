package exercise;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car("파랑", 200, 1000, 5);
		c.show();
		c.toString();
		Vehicle v = c;
		v.show();
	}

}

class Vehicle {
	String color;
	int speed;

	Vehicle(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}

	void show() {
		System.out.println("색상 : " + color);
		System.out.println("속도 : " + speed);
	}

}

class Car extends Vehicle {

	int displacement;
	int gears;

	Car(String color, int speed, int displacement, int gears) {
		super(color, speed);
		this.displacement = displacement;
		this.gears = gears;
	}

	void show() {
		System.out.println("색상 : " + color);
		System.out.println("속도 : " + speed);
		System.out.println("배기량 : " + displacement);
		System.out.println("기어 단수 : " + gears);
	}
}