package Bank;

public class SavingAccountCreation {
	
	private static int randnum=10001;
	final private static String acctype="SAV000";
	
	public SavingsAccount createSavingsAccount(String custname,double accbal)
	{
		SavingsAccount sav= new SavingsAccount(acctype+randnum++,accbal,true,custname);
		return sav;
	}
}
