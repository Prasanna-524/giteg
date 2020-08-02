package assessment;

public class RegularCustomer extends Customer{
	String homeaddress;
	RegularCustomer(String id,String name,String homeaddress,Account account){
		super(id,name,account);
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


