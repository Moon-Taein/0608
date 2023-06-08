import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Moon_Taein
 */
public class LottoNumber {
	private List<Integer> numbers;

	public LottoNumber() {
		numbers = new ArrayList<>();

	}

	/**
	 * @author Moon_Taein
	 * @return void
	 */
	public void roll() {
		Random r = new Random();
		Set<Integer> set = new TreeSet<>();

		while (set.size() < 6) {
			set.add(r.nextInt(45) + 1);

		}
		numbers.clear();
		numbers.addAll(set);
	}

	public List<Integer> getNumbers() {
		return numbers;
	}

}