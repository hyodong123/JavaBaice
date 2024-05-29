package filestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {

	public static void main(String[] args) throws IOException {
		// 오리지널파일 이름 입력
		String orgFilename = "0_jung.png";
		// 복사될파일 이름
		String copiedFilename = "0_jung_capied.png";
		//try catch로 catch를 예외처리함
		try {
			// 파일 받을 스트림 생성
			FileInputStream fis = new FileInputStream(orgFilename);
			// 파일 출력 스트림 생성
			FileOutputStream fos = new FileOutputStream(copiedFilename);
			// 한 바이트씩 복사하기
			copyEachOneByte(fis, fos);
			// 한 키로바이트씩 복사하기
			// copyEachKByte(fis, fos);
			fos.flush(); // 버퍼 비우기
			fos.close(); // 버퍼 닫기
			fis.close(); // 버퍼 닫기
			// 완료 메세지 출력
			System.out.println("복사가 완료되었습니다.");
		} catch (FileNotFoundException e) {
			//예외처리 컴파일에러 시 메세지 출력 (한글로 나오는 이유는 컴퓨터 운영체제가 한글로 되어있어서 그런거 같다.)
			System.out.println(e.getMessage());
			
		}
	}
	// 파일을 한 바이트씩 복사
	private static void copyEachOneByte(FileInputStream fis, FileOutputStream fos) throws IOException {
		//현제 읽은 바이트를 저장하느 변수 선언
		int byteInput;
		// 읽어온 바이트 저장값이 -1 아니라면 FileOutputStream에 변수를 대입해준다 (즉 파일을 넣기)
		while ((byteInput = fis.read()) != -1) {
			fos.write(byteInput);
		}
	}
	//메소드의 기능은 같음
	private static void copyEachKByte(FileInputStream fis, FileOutputStream fos) throws IOException {
		//키로바이트는 1024byte라서 배열의 크기를 1024로 지정함
		byte kbInput[] = new byte[1024];
		while (fis.read(kbInput) != -1) {
			fos.write(kbInput);
		}
	}

}
