
/* Subscriber subscription
 * 
 * @param monthlyCostts represent the monthly Cost
 * @param month represent the number of the month registered
 */

public class Subscriber {
	private int monthlyCost;
	private int month;
	
	
	public Subscriber (int monthlyCost, int month)
	{
		setMonthlyCost(monthlyCost);
		this.month = month;
	}

	public int getMonthlyCost() 
	{
		return monthlyCost;
	}

	public void setMonthlyCost(int monthlyCost) 
	{
		if(monthlyCost >= 100)
			this.monthlyCost = monthlyCost;
		else 
			this.monthlyCost = 100;
	}

	public int getMonth() 
	{
		return month;
	}

	public void setMonth(int month) 
	{
		this.month = month;
	}
	/*
	 * @return the manual cost
	 */
	public int calcCost()
	{
		return monthlyCost*12;
	}
	/*
	 * @return the refund cost
	 */
	public double calcRefund(int lastMonth)
	{
		if (lastMonth > month)
			return ((12-(lastMonth - month)+1)*monthlyCost);
		else
			return (((month - lastMonth-1))*monthlyCost);
	}
	
	public void print()
	{
		System.out.println("monthlyCost:<"+ this.monthlyCost + ">,month:<" + this.month + ">");

	}
}
