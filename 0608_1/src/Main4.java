import java.io.File;
import java.io.IOException;

public class Main4 {
	public static void main(String[] args) {
		File f = new File("d:\\filetest\\another\\a.txt");

		File folder = new File(f.getParent());
		System.out.println(folder.getPath());

		if (!folder.exists()) {
			folder.mkdir();
		}

		try {
			boolean result = f.createNewFile();
			System.out.println("파일 생성 확인: " + result);
		} catch (IOException e) {
			System.out.println("IO 예외 발생");
		}
	}
}
