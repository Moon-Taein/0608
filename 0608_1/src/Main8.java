import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main8 {
	public static void main(String[] args) {

		File resource = new File("d:\\filetest\\canread.txt");

		FileReader fr = null;
		try {
			fr = new FileReader(resource);
			int ch;
			while ((ch = fr.read()) != -1) {
				System.out.println("읽은 한 문자: " + (char) ch);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
