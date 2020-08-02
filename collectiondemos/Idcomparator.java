package collectiondemos;
import java.util.Comparator;

public class Idcomparator implements Comparator<Integer> {
	public int compare(Integer o1, Integer o2) {
		int compared=o1-o2;
		return compared;
	}
}
