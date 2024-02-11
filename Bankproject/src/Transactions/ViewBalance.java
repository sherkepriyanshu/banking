package Transactions;

import Bank.Account;

public class ViewBalance {
	
	public void viewAccountBalance(Account a) {
		if(a.isActive()) System.out.println(a.getAccbal());
		else System.out.println("Account Inactive");
	}
}
