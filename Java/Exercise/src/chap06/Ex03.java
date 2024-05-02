package exercise;

public class Ex03 {
	
}
class Point{
	private int x,y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
class MovablePoint extends Point{
	private int xSpeed, ySpeed;

	MovablePoint(int x, int y,int xSpeed, int ySpeed){
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
	