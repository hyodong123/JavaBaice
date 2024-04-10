package chap04;

class Dice {

	private double face;
	
	public Dice() {
		this.face=face;
	}
	public int roll() {
		this.face = ((Math.random() * 10 % 6 )+ 1);
		return (int)face;
	}
}