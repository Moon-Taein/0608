import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestReadPerson {
	public static void main(String[] args) {
		File file = new File("d:\\filetest\\person.txt");

		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader(file));

			String name = br.readLine();
			int age = Integer.parseInt(br.readLine());
			boolean marry = Boolean.parseBoolean(br.readLine());

			Person p = new Person(name, age, marry);
			System.out.println(p.toString());

//			System.out.println("이름은 " + name + " 나이는 " + age + " 결혼여부는 " + marry);

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
