
/* Service 
 * 
 * @param serviceName represent the name of the service
 * @param serviceMontlyCost represent the monthly cost
 * @param refundable represent if the customer can get a refund on the service

 */
public class Service {
	private String serviceName;
	private int serviceMonthlyCost;
	private boolean refundable;
	
	public Service (String serviceName, int serviceMontlyCost, boolean refundable)
	{
		this.serviceName = serviceName;
		setServiceMontlyCost(serviceMontlyCost);
		this.refundable = refundable;
	}
	
	public Service (String serviceName, int serviceMontlyCost)
	{
		this.serviceName = serviceName;
		setServiceMontlyCost(serviceMontlyCost);
		this.refundable = false;
	}
	
	public Service (String serviceName)
	{
		this.serviceName = serviceName;
		this.serviceMonthlyCost = 10;
		this.refundable = false;
	}
	
	public Service(Service other)
	{
		serviceName = other.serviceName;
		serviceMonthlyCost = other.serviceMonthlyCost;
		refundable = other.refundable;
	}

	public int getServiceMontlyCost() 
	{
		return serviceMonthlyCost;
	}

	public void setServiceMontlyCost(int serviceMontlyCost) 
	{
		if (serviceMontlyCost >= 10)
			this.serviceMonthlyCost = serviceMontlyCost;
		else 
		{
			System.out.println("not a valid number, please enter a num bigger than 10");
			this.serviceMonthlyCost = 10;
		}
	}

	public String getServiceName() 
	{
		return serviceName;
	}

	public void setServiceName(String serviceName) 
	{
		this.serviceName = serviceName;
	}

	public boolean isRefundable() 
	{
		return refundable;
	}

	public void setRefundable(boolean refundable) 
	{
		this.refundable = refundable;
	}
	
	public void print()
	{
		String bool;
		if(this.refundable)
			bool = "T";
		else
			bool = "F";
		System.out.println("serviceName:<"+ this.serviceName + ">,serviceMonthlyCost" + this.serviceMonthlyCost + ">,refundable:<"+bool+">");
	}
}
