package override;

/**public class UI {
	public static void main(String args[])
	{
		Car car= new Car();
		car.move();
		//Vechile vechile=new Car();
		//vechile.move();
	}

}
*/
public class UI {
	public static void main(String args[]) {	
		Vechile car=new Car("c11");
		car.move();
		String carNumber=car.getNumberPlate();
		System.out.println("car number="+carNumber);
	
		Vechile Car=new Car("b11");
		car.move();
		String carnumber=car.getNumberPlate();
		System.out.println("bike number="+carNumber);
	
	}
	
}