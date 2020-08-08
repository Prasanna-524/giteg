
package collectiondemos;

import java.util.*;
import equalhashh.Student;

public class SetExample {

	public static void main(String[]args) {
		Comparator<Student> comparator=new TraineeComparator();
		//Set <Trainee>set=new HashSet();
		Set <Student>set=new TreeSet<>(comparator);
		Student trainee1=new Student(19, "chinna");
		set.add(trainee1);// adding element at the end
		Student trainee2=new Student(21, "chinna");
		set.add(trainee2);
		Student trainee3=new Student(20, "sri");
		set.add(trainee3);
		Student trainee4=new Student(20, "sonu");
		set.add(trainee4);
		Student trainee5=new Student(21, "ammu");
		set.add(trainee5);

		int size= set.size();
		System.out.println("before removing"+size);
		set.remove(trainee4);
		size= set.size();
		System.out.println("after removing"+size);
		for(Student trainee:set) {
		System.out.println(trainee.getId()+" "+trainee.getName());
			
		}	
		
	}
	
}