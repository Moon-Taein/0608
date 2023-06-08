import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main13 {
	public static void main(String[] args) {
		// Buffer / io Stream
		File file = new File("D:\\filetest\\origin.txt");

		// TransFormer
		BufferedInputStream bis = null;
		try {
			bis = new BufferedInputStream(new FileInputStream(file));
			// byte배열 파일의 크기만큼 만들기
			byte[] bytes = new byte[(int) file.length()];
			// byte배열에 읽어오기
			bis.read(bytes);
			// String 으로 변환
			String data = new String(bytes);

			System.out.println(data);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bis != null) {
				try {
					// FileInputStream 도 같이 닫아짐 ;
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}