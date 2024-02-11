package Admin;

import Bank.*;
import Transactions.*;
public class MainClass {
	public static void main(String[] args) {
		System.out.println("Banking System");
		SavingAccountCreation sac = new SavingAccountCreation();
		SavingsAccountclose saClose = new SavingsAccountclose();
		LoanAccountCreation lac = new LoanAccountCreation();
		LoanAccountclose laClose = new LoanAccountclose();
		
		ViewBalance vb = new ViewBalance();
		AmountDepositeTransaction adt = new AmountDepositeTransaction();
		AmountWithdrawTransaction awt = new AmountWithdrawTransaction();
		FundTransferTransaction ftt = new FundTransferTransaction();
		
		SavingsAccount sa1 = sac.createSavingsAccount("Akash", 10000);
		vb.viewAccountBalance(sa1);
		adt.amountDeposite(sa1, 30000);
		vb.viewAccountBalance(sa1);
		awt.anmountWithdraw(sa1, 50000);
		vb.viewAccountBalance(sa1);
		
		SavingsAccount sa2 = sac.createSavingsAccount("Prakash", 30000);
		
		saClose.closeSavingsAccount(sa1);
		vb.viewAccountBalance(sa1);
		
		System.out.println("==========================");
		
		LoanAccount la = lac.createLoanAccount("Ramesh",20000, 4.3);
		vb.viewAccountBalance(la);
		adt.amountDeposite(la, 10000);
		vb.viewAccountBalance(la);
		awt.anmountWithdraw(la, 20000);
		vb.viewAccountBalance(la);
		
//		laClose.closeLoanAccount(la);
		vb.viewAccountBalance(la);
		
		System.out.println("===========================");
		
		ftt.fundTransferTransaction(sa1, sa2, 40000);
		vb.viewAccountBalance(sa2);
	}
}
