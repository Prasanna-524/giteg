package inheritance;

import exception.Product;

public class Customer {
	String id;
	String name;
	double balance;
	Customer(String id,String name,double balance)
	{
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	String getId() {
		return id;
	}
	void setId(String idArg )
	{
		id=idArg;
	}
	String getName()
	{
		return name;
	}
	void setName(String nameArg)
	{
		name=nameArg;
	}
	double getBalance() {
		return balance;
	}
	void setBalance(double balanceArg)
	{
		balance=balanceArg;
	}
	public boolean equals(Object argument)
	{
		if(this==argument) {
			return true;
		}
		if(argument==null || !(argument instanceof Customer))
		{
			return false;
		}
		Customer that=(Customer)argument;
		boolean isequal=this.id==that.id;
		return isequal;
	}
}
