package collectiondemos;

import java.util.*;

import equalhashh.Student;

public class LinkedHashExample {

	public static void main(String[]args) {
		Set<Student> set=new LinkedHashSet<>();
		Student trainee1=new Student(10, "prakash");
		set.add(trainee1);// adding element at the end
		Student trainee2=new Student(11, "pradeep");
		set.add(trainee2);
		Student trainee3=new Student(4, "anuj");
		set.add(trainee3);
		Student trainee4=new Student(13, "ankit");
		set.add(trainee4);
		Student trainee5=new Student(15, "pradeep");
		set.add(trainee5);

		int size= set.size();
		System.out.println("before remove size="+size);
		set.remove(trainee4);
		size= set.size();
		System.out.println("after remove size="+size);
		for(Student trainee:set) {
		System.out.println(trainee.getId()+" "+trainee.getName());
			
		}
		
		System.out.println("******using iterator*******");
		   Iterator<Student> iterator=set.iterator();
		   //hasNext() will return true if next element is available
		   while(iterator.hasNext()) {		 
				Student trainee = iterator.next();// fetch next element
				System.out.println("element=" + trainee.getId() + " " + trainee.getName());
			  
		   }

		
		
		
		
		
	}
	
}
	
