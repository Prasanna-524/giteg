package inheritance;

public class StudentMain {
	public static void main(String[] args) {
		Student students[] = new Student[4];

		ElectronicsStudentt student1 = new ElectronicsStudentt("ankit", 21, true, "multimeter");
		Computerscience student2 = new Computerscience("balakrishna", 21, true, "dell");
		Computerscience student3 = new Computerscience("prasanna", 22, true, "asus");
		ElectronicsStudentt student4 = new ElectronicsStudentt("saiteja", 22, true, "diode");

		students[0] = student1;
		students[1] = student2;
		students[2] = student3;
		students[3] = student4;

		for (int i = 0; i < students.length; i++) {
			Student current = students[i];
			String name = current.getName();
			int age = current.getAge();
			boolean placed = current.getPlaced();
			System.out.println("name is " + name + " age is " + age + " is placed " + placed);
			boolean isCSGuy = current instanceof Computerscience;
			if (isCSGuy) {
				Computerscience cs = (Computerscience) current;
				System.out.println("laptop available=" + cs.getLaptopAlloted());
			}

			boolean isECEGuy = current instanceof ElectronicsStudentt;
			if (isECEGuy) {
				ElectronicsStudentt es = (ElectronicsStudentt) current;
				System.out.println("gadget available=" + es.getGadgetAlloted());
			}

		}

	}



}
