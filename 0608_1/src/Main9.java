import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main9 {
	public static void main(String[] args) {
		File target = new File("d:\\filetest\\testoutput.txt");

		String data = "abcdefg";
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(target);
			byte[] bytes = data.getBytes();
			for (int i = 0; i < bytes.length; i++) {
				fos.write(bytes[i]);
			}
//			fos.write(bytes);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}