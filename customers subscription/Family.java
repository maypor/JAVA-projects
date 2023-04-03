
/* Family subscription
 * 
 * @param adults represent the number of adults
 * @param kids represent the number of kids
 */
import java.util.ArrayList;

public class Family extends Advanced{
	
	private int adults;
	private int kids;
	
	
	
	public int getAdults() {
		return adults;
	}
	
	public void setAdults(int adults) {
		if ( adults >= 1)
			this.adults = adults;
		else
		{
			this.adults = 1;
			System.out.println("not a valid value for number of adults");
		}
	}
	public int getKids() {
		return kids;
	}
	
	public void setKids(int kids) {
		if ( kids >= 0)
			this.kids = kids;
		else
		{
			this.kids = 0;
			System.out.println("not a valid value for number of kids");
		}
	}
	
	public Family(int adults, int kids, int monthlyCost, int month) {
		super(monthlyCost, month);
		setKids(kids);
		setAdults(adults);
	}
	/*
	 * @return the manual cost
	 */
	
	public int calcCost()
	{		
		double result = super.calcCost();
		result = result + (adults - 1) * 0.80 * this.getMonthlyCost() * 12;
		result = result + (kids) * 0.60 * this.getMonthlyCost() * 12;
		return (int) result;
	}

	/*
	 * @return the refund cost
	 */
	public double calcRefund(int lastMonth)
	{
		int monthFoorRefunf = 0;
		if (lastMonth > super.getMonth())
			monthFoorRefunf = (12-(lastMonth - super.getMonth())+1);
		else
			monthFoorRefunf = (super.getMonth() - lastMonth-1);
		
		int firstAdult = super.getMonthlyCost();
		int sum = firstAdult;
		
		if(adults >= 2)
		{
			sum += (firstAdult * 0.75);
			if (adults >=3)
			{
				sum += ((adults-2) * firstAdult * 0.5);
			}
		}
		sum += (kids * firstAdult * 0.5);
		System.out.println();
		
		return ((monthFoorRefunf)* (sum+(super.calcRefund(lastMonth))));
		/*
		 * if (lastMonth > month)
			return ((12-(lastMonth - month)+1)*sum);
		else
			return (((month - lastMonth-1))*sum);
		 */
	}
	
	public void print()
	{
		super.print();
		System.out.println("adults:<" + adults + ">, kids:<" + kids + ">");
	}
	
}
