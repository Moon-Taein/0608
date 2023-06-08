import java.io.File;

public class Main3 {
	public static void main(String[] args) {
		// 폴더를 이용해서 객체로 만들기
		File f = new File("D:\\filetest\\newfolder");

		boolean result = f.mkdir();

		System.out.println("폴더 생성 결과 " + result);

		System.out.println("파일 객체로 알아본 폴더(디렉토리) 여부: " + f.isDirectory());
	}
}
