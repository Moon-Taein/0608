import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TestPerson {
	public static void main(String[] args) {
		Person p = new Person("길동", 33, true);

		System.out.println(p);

		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new File("D:\\filetest\\person.txt"));
			pw.println(p.getName());
			pw.println(p.getAge());
			pw.println(p.isMarry());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.close();
			}
		}

	}
}
