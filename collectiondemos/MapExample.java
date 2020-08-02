	package collectiondemos;

	import java.util.*;

	import equalhashh.Item;

	public class MapExample {

		public static void main(String[] args) {
			Item trainee1 = new Item(10, "chinni");
			Item trainee2 = new Item(11, "chinna");
			Item trainee3 = new Item(4, "anu");
			Item trainee4 = new Item(13, "srii");
			Item trainee5 = new Item(15, "ammulu");

			Map <Integer,Item>map = new HashMap();
			map.put(10, trainee1);
			map.put(11, trainee2);
			map.put(4, trainee3);
			map.put(13, trainee4);
			map.put(15, trainee5);
			
			int size=map.size();
			
			System.out.println("size="+size);

			Item trainee = map.get(11);// fetching value associated with key 11
			System.out.println(trainee.getId() + " " + trainee.getName());

			map.remove(4);// removing element by key=4
			
			Set <Integer>keys = map.keySet();
			for (Integer k : keys) {
				Item traineeObj = map.get(k);
				System.out.println(traineeObj.getId() + " " + traineeObj.getName());

			}

		}	}

	
