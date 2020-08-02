
package collectiondemos;

import java.util.*;
import equalhashh.Item;

public class SetExample {

	public static void main(String[]args) {
		Comparator<Item> comparator=new TraineeComparator();
		//Set <Trainee>set=new HashSet();
		Set <Item>set=new TreeSet<>(comparator);
		Item trainee1=new Item(19, "chinna");
		set.add(trainee1);// adding element at the end
		Item trainee2=new Item(21, "chinna");
		set.add(trainee2);
		Item trainee3=new Item(20, "sri");
		set.add(trainee3);
		Item trainee4=new Item(20, "sonu");
		set.add(trainee4);
		Item trainee5=new Item(21, "ammu");
		set.add(trainee5);

		int size= set.size();
		System.out.println("before removing"+size);
		set.remove(trainee4);
		size= set.size();
		System.out.println("after removing"+size);
		for(Item trainee:set) {
		System.out.println(trainee.getId()+" "+trainee.getName());
			
		}	
		
	}
	
}