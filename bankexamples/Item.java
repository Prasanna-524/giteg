package bankexamples;

public class Item {
	    String id;
		String name;
		double price;
		Item(String id, String name, double price)
		{
			this.id=id;
			this.name=name;
			this.price=price;
		}
		String getId(){
		return id;
		}
		void setId(String idd){
		id=idd;
		}
		String getName(){
		return name;
		}
		void setName(String nameArg){
		name=nameArg;
		}
		double getPrice(){
		return price;
		}
		void setPrice(double pricee){
	   price=pricee;
		}

}
