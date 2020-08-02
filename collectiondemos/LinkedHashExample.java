package collectiondemos;

import java.util.*;

import equalhashh.Item;

public class LinkedHashExample {

	public static void main(String[]args) {
		Set<Item> set=new LinkedHashSet<>();
		Item trainee1=new Item(10, "prakash");
		set.add(trainee1);// adding element at the end
		Item trainee2=new Item(11, "pradeep");
		set.add(trainee2);
		Item trainee3=new Item(4, "anuj");
		set.add(trainee3);
		Item trainee4=new Item(13, "ankit");
		set.add(trainee4);
		Item trainee5=new Item(15, "pradeep");
		set.add(trainee5);

		int size= set.size();
		System.out.println("before remove size="+size);
		set.remove(trainee4);
		size= set.size();
		System.out.println("after remove size="+size);
		for(Item trainee:set) {
		System.out.println(trainee.getId()+" "+trainee.getName());
			
		}
		
		System.out.println("******using iterator*******");
		   Iterator<Item> iterator=set.iterator();
		   //hasNext() will return true if next element is available
		   while(iterator.hasNext()) {		 
				Item trainee = iterator.next();// fetch next element
				System.out.println("element=" + trainee.getId() + " " + trainee.getName());
			  
		   }

		
		
		
		
		
	}
	
}
	
