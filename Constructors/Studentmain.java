package Constructors;

public class Studentmain {
	public static void main(String args[]) {
		Student s1=new Student();
		int age=s1.getAge();
		String name=s1.getName();
		boolean placed=s1.getPlaced();
		System.out.println("before updation");
		System.out.println("name is "+name+" age is "+age+" placed is "+placed);
		s1.setAge(20);
		s1.setname("prasanna");
		s1.setPlaced(true);
		age=s1.getAge();
		name=s1.getName();
		placed=s1.getPlaced();
		System.out.println("after updation");
		System.out.println("name is "+name+" age is "+age+" placed is "+placed);
	
	}	
		
	}
