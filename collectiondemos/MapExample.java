	package collectiondemos;

	import java.util.*;

	import equalhashh.Student;

	public class MapExample {

		public static void main(String[] args) {
			Student trainee1 = new Student(10, "chinni");
			Student trainee2 = new Student(11, "chinna");
			Student trainee3 = new Student(4, "anu");
			Student trainee4 = new Student(13, "srii");
			Student trainee5 = new Student(15, "ammulu");

			Map <Integer,Student>map = new HashMap();
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
			
			Set <Integer>keys = map.keySet();
			for (Integer k : keys) {
				Student traineeObj = map.get(k);
				System.out.println(traineeObj.getId() + " " + traineeObj.getName());

			}

		}	}

	
