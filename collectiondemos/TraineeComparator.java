package collectiondemos;
import java.util.Comparator;
import equalhashh.Item;

public class TraineeComparator implements Comparator<Item>{
	public int compare(Item o1,Item o2)
	{
		int id1=o1.getId();
		int id2=o2.getId();
		int compare=id1-id2;
		return compare;
	}

}
