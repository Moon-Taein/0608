import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestReadLotto {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader(new File("D:\\filetest\\lottonum.txt")));
			String line;
			while ((line = br.readLine()) != null) {
				list.add(Integer.valueOf(line));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
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

		System.out.println("파일에서 읽은 정보로 구성한 List 객체: " + list);

	}
}