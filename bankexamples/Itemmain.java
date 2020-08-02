package bankexamples;


import java.util.*;

public class Itemmain {
		public static void main(String args[]) {
			List<Item> list=new ArrayList();
			//adding elements in to the list using add function.
			Item item1=new Item("1A", "chocloate",50);
			list.add(item1);// adding element at the end
			Item item2=new Item("2A","chocopie",20);
			list.add(item2);
			Item item3=new Item("3A","biscuit",20);
			list.add(item3);
			Item item4=new Item("4A","dairymilk",30);
			list.add(item4);
	System.out.println("for each");
	for(Item items:list)
	{
		System.out.println("element is"+items.getId() + "name is " + items.getName()); 

		}
}
}
	