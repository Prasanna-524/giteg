package Constructors;

public class Studentmainn {
		public static void main(String args[]) {
			//Student s1=new Student();
			//s1.setAge(20);
			//s1.setname("prasanna");
		//	s1.setPlaced(true);
			//Student s2=new Student();
			//s2.setAge(20);
			//s2.setname("prasanna");
			//s2.setPlaced(true);
			//Student students[]=new Student[2];
		//	students[0]=s1;
			//students[1]=s2;
			Student students[]=new Student[2];
			
			
			
			
			
			for(int i=0;i<students.length;i++) {
				Student iterated=students[i];
				String name=iterated.getName();
				int age=iterated.getAge();
				boolean placed=iterated.getPlaced();
				System.out.println("name is "+name+" age is "+age+" placed is "+placed);
			}
		}

}
