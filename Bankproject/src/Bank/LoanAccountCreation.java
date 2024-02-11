package Bank;

public class LoanAccountCreation {
	private static int randnum=10001;
	final private static String acctype="LA0000";
	
	public LoanAccount createLoanAccount(String custname, double accbal,double tenure) {
		LoanAccount la = new LoanAccount(acctype+randnum++,custname,accbal,tenure,true);
		return la;
	}
}
