import java.util.Scanner;

public class Residential extends Asset implements property_tax {
	protected int householdSize;

	
	public Residential(String street, int number, int apt, int size, int householdSize) {
		super(street, number, apt, size);
		this.householdSize = householdSize;
	}
	public Residential(String street, int number, int apt, int size, int householdSize, String ownerName, String ownerId, int ownerPhone) {
		super(street, number, apt, size, ownerName, ownerId, ownerPhone);
		this.householdSize = householdSize;
		
		
	}

	public int getHouseholdSize() {
		return householdSize;
	}

	public void setHouseholdSize(int householdSize) {
		if (householdSize > 0)
			this.householdSize = householdSize;
	}
	
	//print asset details
	public String toString()
	{
		return "Asset: "+ getClass() +", street: "+street +", number: "+ number + ", apt: "+ apt +" size: "+size;
	
	}
	
	// run down 2 asset who have the same address
	public boolean equal(Object o)
	{
		if (getClass()==o.getClass()) 
		{
			Residential c=(Residential)o;
			if ((street== c.street) && (number==c.number) && (apt==c.apt))
				return true;
			else
				return false;
		}
		else
			return false;
	}
	
	//calculate property tax
	public double calcPropertyTax()
	{
		double total = size * m;
		if (householdSize >= 6)
			return total * 0.85;
		else 
			return total;
	}
	// call father function
	public void ownershipTransfer(String name, String id, int Phone) {
		super.ownershipTransfer(name, id, Phone);
	}
	public void ownershipDetails() {
		super.ownershipDetails();
	}
}
