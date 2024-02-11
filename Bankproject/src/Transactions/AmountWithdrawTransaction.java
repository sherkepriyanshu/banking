package Transactions;

import Bank.Account;

public class AmountWithdrawTransaction {
	
	public void anmountWithdraw(Account a,double amount) {
		a.withdraw(amount);
	}
}
