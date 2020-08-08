package generics;
import equalhashh.Student;

public class StorageMain {
	public static void main(String[]args) {
		Student element=new Student(12,"chinni");
		Storage<Student> storage=new Storage<>();
		storage.add(element);
		Student obj=storage.getElement();
		System.out.println("" +obj.getId()+ " "+obj.getName());
	
	}
}
