package override;

/**public class Car extends Vechile {
	public void move()
	{
		System.out.println("car moves");
	}

}
*/
public class 	Car extends Vechile{
	
	public Car(String numberPlate) {
		super(numberPlate);
	}
	public void move() {
		System.out.println("car moves");
	}
	
}
