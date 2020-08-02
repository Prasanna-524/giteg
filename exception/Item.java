package exception;

public class Item {
static int count;
	
	public Item() {
		count++;
	}

	public static int getCount() {
		return count;
	}
}
