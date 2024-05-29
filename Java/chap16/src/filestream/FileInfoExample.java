package filestream;

import java.io.File;
import java.io.IOException;

public class FileInfoExample {

	public static void main(String[] args) throws IOException {

		// 파일을 생성하는 클래스 호출
		// 이미지 디렉토리 생성
		File imgDir = new File("C:/Temp/images");
		// 텍스트 파일 생성
		File testFile = new File("C:/Temp/test.txt");
		
		//이미지 디렉토리가 없다면 생성
		if(imgDir.exists() == false) { 
			imgDir.mkdirs();
			System.out.println(imgDir.getName() + "을 생성합니다.");
		}
		//텍스트 파일이 없다면 생성
		if(testFile.exists() == false) {
			testFile.createNewFile();
			System.out.println(testFile.getName() + "을 생성합니다.");
		}
		// "C:/Temp"위치의 파일을 불러옴
		File tempDir = new File("C:/Temp");
		//Temp 풀더안의 모든 컨테츠를 불러옴
		File[] contents = tempDir.listFiles();
		
		System.out.println(tempDir.getName() + "의 내용을 출력합니다.");
		//파일 또는 디렉토리를 순환해서 출력함
		for(File file : contents) {
			System.out.print("\t" + file.getName());
			//파일의 이름을 출력함
			if (file.isDirectory()) {
				// 디렉토리인 경우 DIR을 출력함
				System.out.print("<DIR>");
			}
			else {
				// 파일이라면 길이만큼 출력함
				System.out.print("<"+file.length() + ">");
			}
			System.out.println();
		}

	}

}