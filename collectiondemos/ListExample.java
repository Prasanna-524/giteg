package collectiondemos;

import java.util.*;
import equalhashh.Student;

public class ListExample {
		public static void main(String args[])
		{
			List<Student> list=new ArrayList();
			//adding elements in to the list using add function.
			Student trainee1=new Student(10, "sri");
			list.add(trainee1);// adding element at the end
			Student trainee2=new Student(11, "siri");
			list.add(trainee2);
			Student trainee3=new Student(4, "anu");
			list.add(trainee3);
			Student trainee4=new Student(13, "devika");
			list.add(trainee4);
			Student trainee5=new Student(15, "lucky");
			list.add(trainee5);
			Comparator<Student> comparator=new TraineeComparator();
			list.sort(comparator);
			 Student ele=list.get(2);
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
				Student trainee =list.get(i); 
				System.out.println("element is"+trainee.getId() + "name is " + trainee.getName()); 
			 
			 }
		
			 System.out.println("for each");
			 for(Student trainee:list) { 
				System.out.println("element is"+trainee.getId() + "name is " + trainee.getName()); 
				
			 }	
			 System.out.println("iterator");
			 Iterator<Student> iterator=list.iterator();
			   //hasNext() will return true if next element is available
			   while(iterator.hasNext()) {		 
					Student trainee = iterator.next();// fetch next element
					System.out.println("element=" + trainee.getId() + " " + trainee.getName());
			   }
			 
		
		}}
			

			
			
		