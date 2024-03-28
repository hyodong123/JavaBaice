package string;

public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Java";
		String s2 = "Java";
		String s3 = "java";
		System.out.println(s1 == s2);
		System.out.println(s2 != s3);
		System.out.println(s1.equals(s2));
		String s4 = s2 + s3;
		System.out.println(s4);
	}

}
