package inheritance;

public class RegularCustomer extends Customer {
	String homeaddress;
	RegularCustomer(String id,String name,double balance,String homeaddress){
		super(id,name,balance);
		this.homeaddress=homeaddress;
	}
	String gethomeAddress() {
		return homeaddress;
	}
	void sethomeAddress(String homeAddress)
	{
		homeaddress=homeAddress;
	}

}
