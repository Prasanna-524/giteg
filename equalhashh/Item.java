package equalhashh;

public class Item {

	private int id; 
	
	private String name;
	
	public Item(int id, String name) {
		this.id=id;
		this.name=name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	// Returns the hash code for the invoking collection.
	public int hashCode() {
		return id;
	}
	
	
	/**
	 *  Trainee t1=new Trainee(10,"srilu");
	    Trainee t2=new Trainee(10,"sri")
  	    boolean isEquals=t1.equals(t2);	
	 */
    @Override
	public boolean equals(Object arg) {
		if(this==arg) {
			return true;
		}
		
	   if(arg==null || !(arg instanceof Item) ) {
			return false;
	   }
		
	    Item that=(Item)arg;	
		boolean isequal=this.id==that.id;
		return isequal;
	}
	
	
	
}