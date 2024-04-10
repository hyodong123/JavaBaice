package classtest;

public class Circle {
	
	private double radius;
	private double area;
	final double PI = 3.14;

	public double getRadius() {
		return  radius;
	}

	public double getPI() {
		return PI;
	}

	Circle(double radius){
		this.radius = radius;
	}
	
	double getArea(){	
		return area;
	}
	
	void calArea() {
		area = PI * radius * radius;
	}

	void show() {
		System.out.printf("반지름 = %.2f, 면적 = %.2f\n", radius, area);
	}
}
