package assessment;

public class Account {
	private String pancard;
	private double balance;
	public Account(String pancard,double balance)
	{
		
		this.pancard=pancard;
		this.balance=balance;
	}
	public String getPancard()
	{
		return pancard;
	}
	void setPancard(String pancarda)
	{
		pancard=pancarda;
	}
	public double getBalance() {
		return balance;
	}
	void setBalance(double balancearg) {
		balance=balancearg;
	}
}



