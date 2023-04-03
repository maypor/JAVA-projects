
import java.util.Scanner;

public class Public extends Asset implements property_tax, insurance{
	protected String type ;

	public Public(String street, int number, int apt, int size, String type) {
		super(street, number, apt, size);
		this.type = type;
	}
	public Public(String street, int number, int apt, int size, String type, String ownerName, String ownerId, int ownerPhone) {
		super(street, number, apt, size, ownerName,  ownerId,  ownerPhone);
		this.type = type;
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
			Public c=(Public)o;
			if ((street== c.street) && (number==c.number) && (apt==c.apt))
				return true;
			else
				return false;
		}
		else
			return false;
	}
	//calculate public tax
	public double calcPropertyTax()
	{
		return (m+10)*size;
	}
	
	public double calcInsurance()
	{
		return size * (priceM + 14);
			
	}
	
	//return the damage cost
	public double insuranceClaim(int damage)
	{
		if((calcInsurance() * 0.6) > damage)
			return calcInsurance() * 0.6;
		else return damage;
	}
	// call father function

		public void ownershipTransfer(String name, String id, int Phone) {
			super.ownershipTransfer(name, id, Phone);
		}
		public void ownershipDetails() {
			super.ownershipDetails();
		}

}
