import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main7 {
	public static void main(String[] args) {
		// 입출력 흐름 - I/O Stream
		File resource = new File("d:\\filetest\\canread.txt");

		// 1. 파일입력스트림 생성
		// 2. 파일 읽기
		// 3. 파일입력스트림 해제(닫기)

		FileInputStream fis = null; // 미리 초기화
		try {
			// stream 사용 후 자원 해제를 해줘야함
			fis = new FileInputStream(resource);
			int read;
			// 파일의 끝 - End Of File - EOF
			// read -> eof만날시 -1 값 반환
			while ((read = fis.read()) != -1) {
				System.out.println("바이트값: " + read);
				System.out.println("문자단위 변환: " + (char) read);
				System.out.println("---");
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("IO 예외가 발생해 파일을 읽을 수 없습니다.");
		} finally { // 자원을 사용한후 try-catch 문에서 반드시 실행하는 finally 이용해서 자원해제
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}