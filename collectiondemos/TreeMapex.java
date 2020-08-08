package collectiondemos;

import java.util.*;

import equalhashh.Student;

public class TreeMapex {

	public static void main(String[] args) {
		Student trainee1 = new Student(10, "prakash");
		Student trainee2 = new Student(11, "pradeep");
		Student trainee3 = new Student(4, "anuj");
		Student trainee4 = new Student(13, "ankit");
		Student trainee5 = new Student(15, "pradeep");

		// HashMap is hash based map implementation in which addition/insertion is NOT maintained
		//LinkedHashMap is hash based map implementation  is maintained
		//
		Comparator<Integer>comparator=new Idcomparator();
		Map<Integer,Student> map = new TreeMap<>(comparator);
		map.put(10, trainee1);
		map.put(11, trainee2);
		map.put(4, trainee3);
		map.put(13, trainee4);
		map.put(15, trainee5);
		
	
		int size=map.size();
		
		System.out.println("size="+size);

		Student trainee = map.get(11);// fetching value associated with key 11
		System.out.println(trainee.getId() + " " + trainee.getName());

		map.remove(4);// removing element by key=4

		System.out.println("***forach on keys, printing values***");
		//map.keySet() is returning set of keys
		//
		Set<Integer> keys = map.keySet();
		for (Integer k : keys) {
			Student fetched = map.get(k);
			System.out.println(fetched.getId() + " " +fetched.getName());

		}
		
		System.out.println("***forach on values, printing values***");
			Collection<Student>values=map.values();
        for(Student value: values) {
        System.out.println("value="+value.getId()+" "+value.getName());	
        }
		
	}

}