import java.io.File;
import java.io.IOException;

public class Main2 {
	public static void main(String[] args) {
		// 파일 객체를 만든다.
		File f = new File("D:\\filetest\\wow.txt");

		System.out.println(f.getName());
		System.out.println(f.getPath());
		System.out.println("실제 존재하는 파일인가요? " + f.exists());

		// create 예외처리 필요함
		try {
			boolean result = f.createNewFile();
			System.out.println("파일 생성 결과: " + result);
		} catch (IOException e) {
			System.out.println("입출력 예외 발생");
		}

	}
}