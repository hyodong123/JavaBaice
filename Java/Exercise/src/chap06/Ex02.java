package exercise;

public class Ex02 {
	public static void main(String[] args) {
		Person s1 = new Student("길동이", 22, 0);
		Student s2 = new Student("황진이", 23, 100);
		ForeignStudent s3 = new ForeignStudent("Amy",30,200,"U.S.A");
		
		s1.show();
		s2.show();
		s3.show();
	}

}

class Person {
	String name; //필드? 역할은? 클래스의 속성을 정
	int age;

	Person(String name, int age) { //생성자 속성을 어떻게 쓸껀지
		this.name = name;
		this.age = age;
	}

	void show() {   //출력 메서
		System.out.println("사람[이름 : " + name + ", 나이 : " + age + "]");
	}
}

class Student extends Person {
	int StudentNum;

	Student(String name, int age, int StudentNum) {
		super(name, age);
		this.StudentNum = StudentNum;
	}

	void show() {
		System.out.println("학생[이름 : " + name + ",나이 : " + age + ", 학번 : " + StudentNum + " ]");
	}
}

class ForeignStudent extends Student {
	String ForeignStudent;

	ForeignStudent(String name, int age, int StudentNum, String ForeignStudent) {
		super(name, age, StudentNum);
		this.ForeignStudent = ForeignStudent;

	}

	void show() {
		System.out.println("학생[이름 : " + name + ",나이 : " + age + ", 학번 : " + StudentNum + ", 국적 : " + ForeignStudent+ "]");
	}
}

