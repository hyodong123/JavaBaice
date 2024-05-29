package filestream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamExample {

	public static void main(String[] args) throws IOException {
		// 원본 파일 이름
		String orgFilename = "D1_Student.txt";
		// 복사될 파일 이름
		String copiedFilename = "D1_Student_copied.txt";
		//try catch로 catch를 예외처리함
		try {
			// 파일 받을 스트림 생성
			FileReader fr = new FileReader(orgFilename);
			// 파일 출력 스트림 생성
			FileWriter fw =new FileWriter(copiedFilename); 
			// 한 문자씩 복사하는 메서드
			//copyCharData(fr, fw);
			// 배열로 문자를 복사하는 메서드
			copyCharArrData(fr, fw);
			fw.flush();
			fw.close();
			fr.close();
			System.out.println(orgFilename + " 복사가 완료되었습니다.");
			// 예외처리
		} catch (FileNotFoundException e) {
			// 에러 메세지 출력
			System.out.println(e.getMessage());
		}

	}

	private static void copyCharArrData(FileReader fr, FileWriter fw) throws IOException {
		// 한번에 처리할 크기를 100 로 지정함
		char[] charArrData = new char[100];
		// 읽어올 문자 배열의 크기가 -1이 아닐때까지 실행함
		while (fr.read(charArrData) != -1) {
			//콘솔 출력
			System.out.print(charArrData);
			// 복사
			fw.write(charArrData);
		}
		
	}

	private static void copyCharData(FileReader fr, FileWriter fw) throws IOException {
		// 정수형 변수 charData로 선언함
		int charData;
		// 읽어온 문자를 한 글자씩 -1이 될때까지 출력
		while ((charData = fr.read()) != -1) {
			//콘솔 출력
			System.out.print((char)charData);
			// 복사
			fw.write(charData);
		}
	}

}
