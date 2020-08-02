package collectiondemos;

import java.util.*;

import equalhashh.Item;

public class TreeMapex {

	public static void main(String[] args) {
		Item trainee1 = new Item(10, "prakash");
		Item trainee2 = new Item(11, "pradeep");
		Item trainee3 = new Item(4, "anuj");
		Item trainee4 = new Item(13, "ankit");
		Item trainee5 = new Item(15, "pradeep");

		// HashMap is hash based map implementation in which addition/insertion is NOT maintained
		//LinkedHashMap is hash based map implementation  is maintained
		//
		Comparator<Integer>comparator=new Idcomparator();
		Map<Integer,Item> map = new TreeMap<>(comparator);
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

		System.out.println("***forach on keys, printing values***");
		//map.keySet() is returning set of keys
		//
		Set<Integer> keys = map.keySet();
		for (Integer k : keys) {
			Item fetched = map.get(k);
			System.out.println(fetched.getId() + " " +fetched.getName());

		}
		
		System.out.println("***forach on values, printing values***");
			Collection<Item>values=map.values();
        for(Item value: values) {
        System.out.println("value="+value.getId()+" "+value.getName());	
        }
		
	}

}