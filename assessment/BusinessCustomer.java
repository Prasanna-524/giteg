package assessment;

public class BusinessCustomer extends Customer {
	String businessaddress;
	BusinessCustomer(String id,String name,String businessaddress,Account account){
		super(id,name,account);
		this.businessaddress=businessaddress;

	
	}
	String getBusinessAddress() {
		return businessaddress;
	}
	void setBusinessAddress(String businessAddress)
	{
		businessaddress=businessAddress;
	}

}



