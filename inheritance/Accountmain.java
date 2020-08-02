package inheritance;

public class Accountmain {
	public static void main(String args[])
			{
		Account accounts[]=new Account[4];
		CurrentAccount account1=new CurrentAccount("chinni",101,"sattenapalli","andhra","india");
		CurrentAccount account2=new CurrentAccount("chinna",201,"guntur","andhra","india");
		SavingsAccount account3=new SavingsAccount("raja",301,"vijayawada","andhra","bangolorehdfc");
		SavingsAccount account4=new SavingsAccount("sitha",401,"vinukonda","andhra","bangoloreaxis");
		accounts[0]=account1;
		accounts[1]=account2;
		accounts[2]=account3;
		accounts[3]=account4;
		for(int i=0;i<accounts.length;i++) {
			Account iterate=accounts[i];
			String name=iterate.getName();
			int doorno=iterate.getdoorNo();
			String hometown=iterate.getHometown();
			String state=iterate.getState();
			System.out.println("Name is " +name+ "  Door no is " +doorno+ " Hometown is" +hometown+ "  state is " +state);
			boolean isCaccount = iterate instanceof CurrentAccount;
			if (isCaccount) {
			CurrentAccount ca=(CurrentAccount) iterate;
			System.out.println("Country is" + ca.getcountry());
			}
			boolean isSaccount = iterate instanceof SavingsAccount;
			if (isSaccount) {
			SavingsAccount sa = (SavingsAccount) iterate;
			System.out.println("gadget available=" + sa.getBranchofbank());
			}
			}
			}
}
