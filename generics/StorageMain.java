package generics;
import equalhashh.Item;

public class StorageMain {
	public static void main(String[]args) {
		Item element=new Item(12,"chinni");
		Storage<Item> storage=new Storage<>();
		storage.add(element);
		Item obj=storage.getElement();
		System.out.println("" +obj.getId()+ " "+obj.getName());
	
	}
}
