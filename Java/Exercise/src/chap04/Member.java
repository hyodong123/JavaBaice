package chap04;

public class Member {

	private String name;
	private String id;
	private String pw;
	private int age;

	public Member(String name, String id, String pw, int age) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getid() {
		return id;
	}

	public String getpw() {
		return pw;
	}

	public int getage() {
		return age;
	}

	public void showMemberInfo() {
		System.out.println("이름 : " + name);
		System.out.println("ID : " + id);
		System.out.println("PW : " + pw);
		System.out.println("나이 : " + age);
	}

}
