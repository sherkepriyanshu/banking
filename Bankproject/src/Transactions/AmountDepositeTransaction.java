package Transactions;

import Bank.Account;

public class AmountDepositeTransaction {
	
	public void amountDeposite(Account a,double amount) {
		a.deposit(amount);
	}
}
