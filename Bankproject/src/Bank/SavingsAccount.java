package Bank;
 public class SavingsAccount extends Account{

	public SavingsAccount(String accnum, double accbal,boolean isActive, String custname) {
		super(accnum,accbal,isActive,custname);
	}
	public void deposit(double amt)
	{
		System.out.println("Depositing Rs "+amt);
		this.setAccbal(this.getAccbal()+amt);
	}
	public void withdraw(double amt)
	{
		System.out.println("Withdrawing Rs "+amt);
		if(amt<=this.getAccbal())
		{
			this.setAccbal(this.getAccbal()-amt);
		}
		else
		{
			System.out.println("failed due to insufisient bal");
		}
	}
 }
	
