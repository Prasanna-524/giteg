package inheritance;

public class BusinessCustomer extends Customer {
	String businessaddress;
	BusinessCustomer(String id,String name,double balance,String businessaddress){
		super(id,name,balance);
		this.businessaddress=businessaddress;
	}
	String getbusinessAddress() {
		return businessaddress;
	}
	void setbusinessAddress(String businessAddress)
	{
		businessaddress=businessAddress;
	}

}
