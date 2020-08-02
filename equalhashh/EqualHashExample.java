package equalhashh;

public class EqualHashExample {
	public static void main(String args[])
	{
		Item t1=new Item(10,"chinni");
	//	Trainee t2=t1;
		Item t2=new Item(10,"chinna");
		boolean issame=t1==t2;
		boolean isEquals=t1.equals(t2);
		System.out.println(""+issame);
		System.out.println(""+isEquals);
		
		String s1="hello";
		 String s2="hello";
		 boolean isStringSame=s1==s2;
		 boolean isStringEqual=s1.equals(s2);
		 System.out.println("is string same="+isStringSame);
		 System.out.println("is strings equal="+isStringEqual);
	}

}







