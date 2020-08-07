package assessone;
import java.util.LinkedHashSet;
import java.util.Set;
public class StudentMain {	
	public static void main(String[] args) {
			StudentMain demo = new StudentMain();
			demo.runApp();
		}
	public void runApp() {
		Set<Student> set=new LinkedHashSet<>();
		Student student1=new Student(22,"JR524");
		set.add(student1);
		Student student2=new Student(22,"JR525");
		set.add(student2);
		Student student3=new Student(21,"JR526");
		set.add(student3);
		Student student4=new Student(23,"JR520");
		set.add(student4);
		Student student5=new Student(21,"JR529");
		set.add(student5);
		boolean isEquals=student1.equals(student2);
		boolean isEquals1=student3.equals(student4);
		boolean isEquals2=student4.equals(student5);
		for(Student students:set) {
		//Object obj=set.get(i);
			//Student student=(Student)obj;
		 // int exc=Student.getAge();
			//if(exc>21) {
			System.out.println(students.getAge()+" "+students.getRollno());	
			}
			System.out.println("is equals"+isEquals);	
			System.out.println("is equals"+isEquals1);	
			System.out.println("is equals"+isEquals2);	
		}
		}
	
	


