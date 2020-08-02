package assessment;
import java.util.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class AccountMain {
		private Map<String,Customer> store = new HashMap<>();

		public static void main(String[] args) {
			AccountMain demo = new AccountMain();
			demo.runApp();
		}

		public void runApp() {
			try {
				Account account1 = new Account("DDSPG",3000);
				Account account2 = new Account("DDPFG",3500);
				final String name1="chinna",name2="chinni",name3 = "prasanna", name4="siri";
				RegularCustomer customer1 = new RegularCustomer("AA",name1,"sattenapalli",account1);	
				RegularCustomer customer2 = new RegularCustomer("BB",name2,"guntur",account1);
				BusinessCustomer customer3 = new BusinessCustomer("CC",name3,"vijayawada",account2);
				BusinessCustomer customer4 = new BusinessCustomer("DD",name3,"hyd",account2);
				store.put(customer1.getName(), customer1);
				store.put(customer2.getName(), customer2);
				store.put(customer3.getName(), customer3);
				store.put(customer4.getName(), customer4);

				System.out.println("****fetch customer by name=" + name3);

				Customer fetched = findByName(name3);
			    if(fetched instanceof RegularCustomer ){
			     RegularCustomer fetchedRCustomer=(RegularCustomer) fetched;
			     display(fetchedRCustomer);
			    }
			    if(fetched instanceof BusinessCustomer) {
				     BusinessCustomer fetchedBCustomer=(BusinessCustomer) fetched;
				     display(fetchedBCustomer);
				}
				    
			    
				System.out.println("*******displaying all customers********"); 
				
				displayAll();
			} catch (InvalidCustomerArgumentException e) {
				System.out.println("customer is null");
			} catch (Exception e) {
				System.out.println("some error occurred in program");
			}

		}

		public Customer findByName(String name) {
			Customer customer = store.get(name);
			return customer;
		}

		public void displayAll() {
			Set<String> keys = store.keySet();
			for (String key : keys) {
				Customer current = store.get(key);
				boolean isRcust= current instanceof RegularCustomer;
				if (isRcust) {
					RegularCustomer rcc = (RegularCustomer) current;
					display(rcc);
				}

				boolean isBcust = current instanceof BusinessCustomer;
				if (isBcust) {
					BusinessCustomer bc = (BusinessCustomer) current;
					display(bc);
				}

			}

		}

		public void checkNull(Customer customer) {
			if (customer == null) {
				InvalidCustomerArgumentException exception = new InvalidCustomerArgumentException("null argument");
				throw exception;
			}
		}

		public void displayCustomer(Customer customer) {
			checkNull(customer);
			String id =  customer.getId();
			String name = customer.getName();
			System.out.println("id is" +id + "name is " + name);
			Account account  = customer.getAccount();
			System.out.println("customer balance and pan card are=" + account.getBalance() + " " + account.getPancard());
		}

		public void display(RegularCustomer customer) {
			checkNull(customer);
			displayCustomer(customer);
			//System.out.println("home address" +customer.getHomeAddress());

		}

		public void display(BusinessCustomer customer) {
			checkNull(customer);
			displayCustomer(customer);
			//System.out.println("business address=" +d());

		}

	}

