import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main15 {
	public static void main(String[] args) {
		File file = new File("d:\\filetest\\korean.txt");
		List<String> list = new ArrayList<>(Arrays.asList("동해물과", "백두산이", "마르고", "닳도록"));

		PrintWriter pw = null;
		try {
			pw = new PrintWriter(file);
			for (String string : list) {
				pw.println(string);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.close();
			}
		}

	}
}