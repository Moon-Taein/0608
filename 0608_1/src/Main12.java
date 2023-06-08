import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main12 {
	public static void main(String[] args) {

		// 복사본 만들기
		// 내용을 읽어와서 그대로 입력하기

		File origin = new File("d:\\filetest\\origin.txt");
		File copy = new File("d:\\filetest\\copy.txt");

		FileReader fd = null;
		FileWriter fw = null;
		try {
			// byte 씩 읽어서 적고 읽어서 적고
			fd = new FileReader(origin);
			fw = new FileWriter(copy);
			int read;
			while ((read = fd.read()) != -1) {
				fw.write(read);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fd != null) {
				try {
					fd.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
