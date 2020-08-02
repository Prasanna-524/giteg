package collectiondemos;

import java.util.*;

import equalhashh.Item;
public class LinkedExample {

	public static void main(String[] args) {

		List list = new LinkedList();
		Item trainee1=new Item(18, "chinni");
		list.add(trainee1);// adding element at the end
		Item trainee2=new Item(19, "chinna");
		list.add(trainee2);
		Item trainee3=new Item(14, "sonu");
		list.add(trainee3);
		Item trainee4=new Item(19, "ammu");
		list.add(trainee4);
		Item trainee5=new Item(20, "deepu");
		list.add(trainee5);

		Object ele = list.get(2);// fetching element at index 2
		Item etrainee = (Item) ele;
		int size = list.size();

		System.out.println(" before removing " + size);

		list.remove(1);// removing element at index 1

		size = list.size();// size of list

		// list.clear();// clearing list

		System.out.println("after removing " + size);

		boolean iscontain = list.contains("ammu");
		System.out.println("contains" + iscontain);

		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			Item trainee = (Item) obj;
			System.out.println("element" + trainee.getId() + " " + trainee.getName());

		}

		System.out.println("for each");
		for (Object obj : list) {
			Item trainee = (Item) obj;
			System.out.println("element" + trainee.getId() + " " + trainee.getName());
		}

	}
}




/**
 * 
 * 
 * Collection is a group of similar elements since list is a collection, it is
 * also a group of similar elements List inherits Collection and both are
 * interfaces
 * 
 * Features of List
 * 
 * 1) Indexed Collection
 * 
 * 2) Ordered Collection
 * 
 * 3) Elements can be duplicated
 * 
 * arraylist is good in performance fetching element by index arraylist is bad
 * in performance when elements are added or removed at start or middle
 *
 */