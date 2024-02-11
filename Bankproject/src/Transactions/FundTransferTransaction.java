package Transactions;

import Bank.Account;
import Bank.LoanAccount;
import Bank.SavingsAccount;

public class FundTransferTransaction {
	
	public void fundTransferTransaction(Account fromacc,Account toacc,double amount) {
		if(fromacc.isActive() && toacc.isActive()) {
			if(fromacc instanceof SavingsAccount && toacc instanceof SavingsAccount){
				if(fromacc.getAccbal()>=amount) {
					fromacc.withdraw(amount);
					toacc.deposit(amount);
				}else System.out.println("Insufficient Balance");
				
			}else if(fromacc instanceof SavingsAccount && toacc instanceof LoanAccount) {
				if(fromacc.getAccbal()>=amount) {
					fromacc.withdraw(amount);
					toacc.deposit(amount);
				} 
				else System.out.println("Insufficient Balance");
				
			}

		}else if(fromacc.isActive()){
			System.out.println("Reciever Account is Inactive");
		}else System.out.println("Sender Bank is Inactive");
			
	}

}
