package chap03;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		foo("안녕", 1);
		foo("안녕하세요", 1, 2);
		foo("잘 있어");
	}

	private static void foo(String string) {
		// TODO Auto-generated method stub
		System.out.println(string);
	}

	private static void foo(String string, int i, int j) {
		// TODO Auto-generated method stub
		System.out.println(string + " " + i +" "+ +j);
	}

	private static void foo(String string, int i) {
		// TODO Auto-generated method stub
		System.out.println(string +" "+ i);
	}

}
