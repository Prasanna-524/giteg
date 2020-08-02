package collectiondemos;

import java.util.*;
import equalhashh.Item;

public class ListExample {
		public static void main(String args[])
		{
			List<Item> list=new ArrayList();
			//adding elements in to the list using add function.
			Item trainee1=new Item(10, "sri");
			list.add(trainee1);// adding element at the end
			Item trainee2=new Item(11, "siri");
			list.add(trainee2);
			Item trainee3=new Item(4, "anu");
			list.add(trainee3);
			Item trainee4=new Item(13, "devika");
			list.add(trainee4);
			Item trainee5=new Item(15, "lucky");
			list.add(trainee5);
			Comparator<Item> comparator=new TraineeComparator();
			list.sort(comparator);
			 Item ele=list.get(2);
			 //get(2) to get element at particular location
			 int size=list.size();
				 
			 System.out.println("before removing element"+size);
			 
			 list.remove(2);
			 //removing elemnet at index 1.
			 
			 size=list.size();
			
			 //list.clear(); clear all the elements that present in the array
			 
			 System.out.println("after removing element"+size);
			 boolean iscontain=list.contains("chinni");
			 System.out.println("contains="+iscontain);
			 //if object is an element of collection
			 
			 
			 for(int i=0;i<list.size();i++) {
				Item trainee =list.get(i); 
				System.out.println("element is"+trainee.getId() + "name is " + trainee.getName()); 
			 
			 }
		
			 System.out.println("for each");
			 for(Item trainee:list) { 
				System.out.println("element is"+trainee.getId() + "name is " + trainee.getName()); 
				
			 }	
			 System.out.println("iterator");
			 Iterator<Item> iterator=list.iterator();
			   //hasNext() will return true if next element is available
			   while(iterator.hasNext()) {		 
					Item trainee = iterator.next();// fetch next element
					System.out.println("element=" + trainee.getId() + " " + trainee.getName());
			   }
			 
		
		}}
			

			
			
		