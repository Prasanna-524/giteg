package examples;

public class Greatestarray {
public static void main(String args[])
		{
	int a[]= {2,4,7,8,6};
	int great=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(great<a[i])
		{
			great=a[i];
		}
	}
	System.out.println(great);
		}
}
