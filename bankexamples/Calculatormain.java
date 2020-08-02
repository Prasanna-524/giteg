package bankexamples;

public class Calculatormain {
	public static void main(String args[])
	{
		Calculator cal=new Calculator();
		int addres=cal.add(20,30);
		int subres=cal.sub(30,20);
		int mulres=cal.mul(5,5);
		System.out.println("Addition result is:"+addres);
		System.out.println("Subtraction result is:"+subres);
		System.out.println("Multiplication result is:"+mulres);
	}

}

