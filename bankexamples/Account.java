package bankexamples;

class Account {
	String name;
	int age;
	double balance;
	Account (String name, int age, double balance)
	{
		this.name=name;
		this.age=age;
		this.balance=balance;
	}
	Account (String name,  double balance)
	{
		//this.name=name;
		//this.balance=balance;
		this(name,22,balance);
	}
	Account()
	{
	this("chinni",21,2000);
	}
	int getAge(){
	return age;
	}
	void setAge(int ageAcc){
	age=ageAcc;
	}
	String getName(){
	return name;
	}
	void setName(String nameArg){
	name=nameArg;
	}
	double getbalance(){
	return balance;
	}
	void setBalance(double balanceee){
	balance=balanceee;
	}
	double getCredit() {
		return balance;
	}
	void setCredit(double amount) {
		balance=balance+amount;
	}
	double getDebit() {
		return balance;
	}
	void setDebit(double amount) {
		balance=balance-amount;
	}
	}

