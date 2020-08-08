package collectiondemos;
import java.util.Comparator;
import equalhashh.Student;

public class TraineeComparator implements Comparator<Student>{
	public int compare(Student o1,Student o2)
	{
		int id1=o1.getId();
		int id2=o2.getId();
		int compare=id1-id2;
		return compare;
	}

}
