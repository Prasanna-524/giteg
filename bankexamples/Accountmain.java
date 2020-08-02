package bankexamples;

import java.util.*;

public class Accountmain {
	public static void main(String args[]) {
		List<Account> list=new ArrayList();
		Account ac1=new Account("chinni",21,1000);
		list.add(ac1);
		Account ac2=new Account("chinna",21,2000);
		list.add(ac2);
		Account ac3=new Account("Raniii",3000);
		list.add(ac3);
		Account ac4=new Account("Raj",18,4000);
		list.add(ac4);
		ac1.setCredit(200);
		ac2.setDebit(50);
		ac3.setCredit(500);
		ac3.setDebit(200);
		//for(int i=0;i<ac.length;i++)
		for(Account account:list)
		{
			System.out.println(account.getName()+"  "+account.getbalance()+"   "+account.getAge());
		}

	}
}
