import java.io.File;

public class Main5 {
	public static void main(String[] args) {
		File f = new File("d:\\filetest\\another\\a.txt");
//		System.out.println(f.exists());

		boolean result = f.renameTo(new File("d:\\filetest\\another\\newname.txt"));
		System.out.println("파일 이름 변경: " + result);

	}
}
