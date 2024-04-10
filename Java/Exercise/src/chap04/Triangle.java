package chap04;

class Triangle {
	private double side;
	private double height;
	// 속성, 설계도의 부품 (private인 이유는 나만 보기)

	public Triangle(double side, double height) {
		this.height = height;
		this.side = side;
		// 메소드 내에서 사용하기 위해 변수값을 새로 넣는 느낌? //생성자
		// 생성자의 인스턴스를 초기화 해주는 메서드 (생성자도 메서드의 일종)
		 
		
	} 
	public double getSide() {
		 return side;
		 // 게터로 사이드값 새로 받음
	}
	public double getHeight() {
		return height;
		// 게터로 높이 새로 받음
	}
	
	public double findArea() {
		return getSide() * getHeight() * 0.5;
		//넓이를 구하는 메소드임	
	}
	   public boolean isSameArea(Triangle k) {
		   // Triangle K 참조변수 : 
	        if(k.findArea()==this.findArea())
	            return true;
	        else
	            return false;
	    }
	   //return k.findarea()==this.findarea();
	   
}
	
//	public static void main(String[] args) {
//		Triangle t = new Triangle(10.0, 5.0);
//		System.out.println(t.findArea());
//	}