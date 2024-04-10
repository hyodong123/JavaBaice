package chap04;

public class Print {

	int numOfPapers;

	public Print(int numOfPapers, boolean duplex) {
		this.numOfPapers = numOfPapers;

	}

	public void print(int amount) {
		// 코드추가
		this.numOfPapers -= amount;
		// 용지 없음
		if (numOfPapers == 0) {
			System.out.println("용지가 없습니다.");
		}
		// 용지 충분
		else if (numOfPapers >= amount) {
			this.numOfPapers -= amount;
			System.out.println(amount + "장 출력 했습니다. 현재 " + numOfPapers + "장 남아 있습니다.");
		}
		// 용지 부족
		else {
			System.out.println("모두 출력할려면 용지가" + (amount - numOfPapers) + "장 부족합니다. " + numOfPapers + "장만 출력합니다.");
			this.numOfPapers = 0;
		}
	}

}
class PrinterTest {

	public static void main(String[] args) {
		// Printer 클래스를 테스트하는 코드
		Print p = new Print(10, false);
		p.print(2);
		p.print(20);
		p.print(10);
		System.out.println(p.numOfPapers);
	}
}



