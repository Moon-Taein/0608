import java.io.File;

public class Main1 {
	public static void main(String[] args) {
		File f = new File("hi.txt");

		System.out.println("파일 이름: " + f.getName());
		System.out.println("경로: " + f.getPath());
		System.out.println("절대 경로: " + f.getAbsolutePath());

		// 구분자 백슬래쉬 2개 ( String 안에 있어서 )
		// File 객체 - 파일을 불러와서 만든거임 실제파일 X
		File f2 = new File("d:\\filetest\\textfile.txt");

		System.out.println("파일 이름: " + f2.getName());
		System.out.println("경로: " + f2.getPath());
	}
}
