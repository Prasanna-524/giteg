package inheritance;
public class Customermain {
	public static void main(String args[]){
		Customer customers[]=new Customer[4];
		RegularCustomer customer1= new RegularCustomer("JR","chinni",5000,"sattenapalli");
		RegularCustomer customer2= new RegularCustomer("KKR","chinna",6000,"guntur");
		BusinessCustomer customer3= new BusinessCustomer("KSR","raja",7000,"bangolore");
		BusinessCustomer customer4= new BusinessCustomer("JC","sitha",8000,"chennai");
		customers[0]=customer1;
		customers[1]=customer2;
		customers[2]=customer3;
		customers[3]=customer4;
		for(int i=0;i<customers.length;i++) {
			Customer iterate=customers[i];
	
			String id=iterate.getId();
			String name=iterate.getName();
			double balance=iterate.getBalance();
			System.out.println("id is" +id+ "Name is " +name+ "balance is " +balance);
			boolean isRaccount = iterate instanceof RegularCustomer;
			if (isRaccount) {
				RegularCustomer rc=(RegularCustomer)iterate;
				System.out.println("homeaddress  is" + rc.gethomeAddress());
			}
			boolean isBaccount = iterate instanceof BusinessCustomer;
			if (isBaccount) {
				BusinessCustomer ba = (BusinessCustomer) iterate;
				System.out.println("business address" + ba.getbusinessAddress());
				}
	}
	}
}
