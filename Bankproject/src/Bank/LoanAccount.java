package Bank;

public class LoanAccount extends Account {
	private double tenure;

	public LoanAccount(String accnum,String custname,double accbal,double tenure, boolean isActive) {
		super(accnum, accbal, isActive, custname);
		this.tenure = tenure;
	}

	public double getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public void deposit(double amt)
	{
		System.out.println("Depositing Rs "+amt);
		this.setAccbal(this.getAccbal()-amt);
	}
	public void withdraw(double amt)
	{
		System.out.println("Withdrawing Rs "+amt);
		
		this.setAccbal(this.getAccbal()+amt);
	}
}
