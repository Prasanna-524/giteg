package inheritance;
public class CurrentAccount extends Account {

	String country;

	CurrentAccount(String name,int doorno, String hometown,String state,String country) {
		super(name, doorno, hometown,state);
		this.country =country;
	}

	String getcountry() {
		return country;
	}

	void setcountry(String country) {
		this.country = country;
	}

}
