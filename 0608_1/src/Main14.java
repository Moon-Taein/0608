import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main14 {
	public static void main(String[] args) {
		File file = new File("d:\\filetest\\origin.txt");

		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
			// 한줄씩 읽어나감
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}