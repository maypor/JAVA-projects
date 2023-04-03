
import java.util.ArrayList;

/* Advanced subscription
 * 
 * @param monthlyCostts represent the monthly Cost
 * @param month represent the number of the month registered
 */
public class Advanced extends Subscriber {

	protected ArrayList <Service>  services ;

	public Advanced(int monthlyCost, int month) {
		super(monthlyCost, month);
		services = new ArrayList<>();
	}
	/*
	 * @return the manual cost
	 */
	public int calcCost()
	{
		int subCost = super.calcCost();
		
		int i = 0;
		int sum =0;
		
		while (i < services.size())
		{
			sum += services.get(i).getServiceMontlyCost();
			i++;
		}
		sum *= 12;
		return sum + subCost;
	}
	/*
	 * @return the refund cost
	 */
	public double calcRefund(int lastMonth)
	{
		int i = 0;
		double sum = 0;

		while (i < services.size())
		{
			if( services.get(i).isRefundable())
				sum += services.get(i).getServiceMontlyCost();
			i++;
		}
		
		return sum;
		
	}
	
	public boolean serviceExist(String nameOfServise)
	{
		int i = 0;
		
		while (i < services.size())
		{
			if (services.get(i).getServiceName().equals(nameOfServise))
				return true;
			i++;
		}
		
		return false;

	}
	
	public void addService(Service servise)
	{
		Service copy = new Service(servise);
		
		if (!serviceExist(servise.getServiceName()))
			services.add(copy);
		else
			System.out.println("the servise " + servise.getServiceName() + " already exist");
		
	}
	
	public void print()
		{
			super.print();
			int i = 0;
			
			while (i < services.size())
			{
				services.get(i).print();
				i++;
			}
		}
	}
