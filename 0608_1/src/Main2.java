import java.io.File;

public class Main2 {
	public static void main(String[] args) {
		// 파일 객체를 만든다.
		File f = new File("D:\\filetest\\wow.txt");

		System.out.println(f.getName());
		System.out.println(f.getPath());
		System.out.println("실제 존재하는 파일인가요? " + f.exists());
	}
}
