import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TestLottoNumber {
	public static void main(String[] args) {
		LottoNumber ln = new LottoNumber();
		ln.roll();

		System.out.println(ln.getNumbers().toString());

		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new File("D:\\filetest\\lottonum.txt"));
			for (Integer i : ln.getNumbers()) {
				pw.println(i);
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