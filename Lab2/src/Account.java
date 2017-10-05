
public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private java.util.Date dateCreated;
	public Account()
	{
		id = 0;
		balance = 1000;
		annualInterestRate = 4.50;
		dateCreated = new java.util.Date();
	}
	public Account(int id, double balance)
	{
		this.id = id;
		this.balance = balance;
		annualInterestRate = 4.50;
		dateCreated = new java.util.Date();
	}
	public int getID()
	{
		return id;
	}
	public double getBalance()
	{
		return balance;
		
	}
	public double getAnnualInterestRate()
	{
		return annualInterestRate;
	}
	public java.util.Date getDate()
	{
		return dateCreated;
	}
	public void setID(int id)
	{
		this.id = id;
	}
	public void setAnnualInterestRate(double rate)
	{
		this.annualInterestRate = rate;
		
	}
	public void setBalance(double b)
	{
		this.balance = b;
	}
	public double getMonthlyInterestRate()
	{
		return annualInterestRate/12;
	}
	public void withDraw(double amount)
	{
		if ((balance -= amount) >= 0)
		{
			balance -= amount;
			System.out.println("Withdraw of " + amount + " successful");
		}
		else
		{
			System.out.println("Not enough funds to withdraw " + amount);
			
		}
		System.out.println("Current Balance: " + getBalance());
		
	}
	public void deposit(double amount)
	{
		balance += amount;
	}
	

}
