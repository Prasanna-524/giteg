package override;
abstract public class Vechile {

	public String numberPlate;
	
	public Vechile(String numberPlate) {
		this.numberPlate=numberPlate;
	}
 	
	public String getNumberPlate() {
		return numberPlate;
	}
	
  public abstract void move() ; 
	
}
/**public class Vechile {
public void move()
{
	System.out.println("vechile moves");
}

}
*/