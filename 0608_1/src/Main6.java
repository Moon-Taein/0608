import java.io.File;

public class Main6 {
	public static void main(String[] args) {
		File f = new File("d:\\filetest\\another\\newname.txt");
		System.out.println(f.exists());

		// 결과값이 참이나 거짓으로 나뉘는 메소드들은
		// boolean 리턴값을 가지는게 많다
		boolean result = f.delete();
		System.out.println("삭제 결과: " + result);
	}
}
