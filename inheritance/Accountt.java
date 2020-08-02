package inheritance;

public class Accountt {
	String pancard;
	double balance;
	Accountt(String pancard,double balance)
	{
		
		this.pancard=pancard;
		this.balance=balance;
	}
	String getPancard()
	{
		return pancard;
	}
	void setPancard(String pancarda)
	{
		pancard=pancarda;
	}
	double getBalance() {
		return balance;
	}
	void setBalance(double balancearg) {
		balance=balancearg;
	}


}
