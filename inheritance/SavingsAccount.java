package inheritance;
public class SavingsAccount extends Account {
	String branchofbank;
	
	SavingsAccount(String name,int doorno,String hometown,String state,String branch)
	{
		super(name,doorno,hometown,state);
		this.branchofbank=branch;
	}
	public String getBranchofbank() {
		return branchofbank;
	}

	public void setBranchofbank(String branchbank) {
		this.branchofbank=branchbank;
	}
	
	 

}
