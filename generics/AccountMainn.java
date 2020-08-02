package generics;
import inheritance.Accountt;
import inheritance.Customer;
import inheritance.Customerr;
import inheritance.BusinessCustomer;
import inheritance.RegularCustomer;
import inheritance.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
public class AccountMainn{
	public static void main(String args[]) {
		Map<String, Customer> store = new HashMap<>();
			Account account1=new Account("AA","chinni");
			Account account2=new Account("BB","chinna");
			RegularCustomer cust1=new RegularCustomer("JR","chinni",5000,"sattenapalli");
			cust1.setAccount(account1);
			RegularCustomer cust2=new RegularCustomer("KKR","chinna",6000,"guntur");
			cust2.setAccount(account2);
			BusinessCustomer cust3= new BusinessCustomer("JC","sitha",8000,"chennai");
			cust3.setCustomerr(customer1);
			BusinessCustomer cust4= new BusinessCustomer("JCC","sithaaaa",9000,"china");
			cust4.setCustomerr(customer2);
			store.put(cust1.getName(),cust1);
			store.put(cust2.getName(),cust2);
			store.put(cust3.getName(),cust3);
			store.put(cust4.getName(),cust4);
			Custtomerr fetched
			
		}
	}	
}
