package exception;

public class ArrayOutOfBoundExample {
	public static void main(String args[])
	{
		try {
	int num[]= {1,2,3};
	int ele=num[4];
	System.out.println(ele);
	}
		catch(Exception e) {
			System.out.println("exception raised");
			e.printStackTrace();
	}
		System.out.println("hi");
	}
}
