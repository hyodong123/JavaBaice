package chap04;

class Printer2 {
	private int numOfPapers;
	private boolean duplex;

	public Printer2(int numOfPapers, boolean duplex) {
		this.numOfPapers = numOfPapers;
		this.duplex = duplex;
	}

	public void print(int amount) {
		if (duplex == true) {
			if ((amount / 2) == 0) { 
				// amount값이 짝수일 때
				numOfPapers -= amount / 2;
				System.out.printf("양면으로 %d장 출력했습니다. 현재 %d장 남아 있습니다.\n", (amount / 2), numOfPapers);
			} else { 
				// amount값이 홀수일 때 1장에 2면(앞,뒤)이 있으니 다르게 계산해줘야한다.
				numOfPapers -= (amount / 2) + 1;
				System.out.printf("양면으로 %d장 출력했습니다. 현재 %d장 남아 있습니다.\n", (amount / 2) + 1, numOfPapers);
			}
		} else {
			if (numOfPapers > amount) { 
				// 남아있는 용지의 수가 출력해야할 수 보다 많을 경우
				numOfPapers -= amount; 
				// 남아있는 용지의 수 - 출력해야할 수
				System.out.printf("단면으로 모두 출력하여 용지 %d장을 출력하고 남아있는 용지는 %d장 입니다.\n", amount, numOfPapers);
			} else { 
				// 출력해야 할 수가 더 많을 경우
				numOfPapers -= amount;
				// 음수값으로 부족한 용지의 수를 알 수 있다.
				amount += numOfPapers; 
				// 출력해야할 수에 음수값인 부족한 용지의 수를 더해서 출력된 용지의 수를 알 수 있다.
				System.out.printf("단면으로 모두 출력하려면 용지가 %d매 부족합니다. %d장만 출력합니다.\n", (numOfPapers * -1), amount);
			}
		}
	}

	public boolean getDuplex() { // 접근자 duplex의 값을 가져오기 위해
		return duplex;
	}

	public void setDuplex(boolean duplex) { // 설정자 duplex의 값을 변경하기 위해
		this.duplex = duplex;
	}

}

public class Printer {

	public static void main(String[] args) {
		Printer2 pt = new Printer2(20, true); // demoPrinter는 객체 인스턴스다.
		pt.print(25);
		pt.setDuplex(false);
		pt.print(10);
	}
}