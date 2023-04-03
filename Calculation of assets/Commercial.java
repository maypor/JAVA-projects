
import java.util.Scanner;

public class Commercial extends Asset implements property_tax, insurance{
	protected char smb;

	//half constructor
	public Commercial(String street, int number, int apt, int size, char smb) {
		super(street, number, apt, size);
		setSmb(smb);
	}
	
	//constructor
	public Commercial(String street, int number, int apt, int size, char smb, String ownerName, String ownerId, int ownerPhone) {
		super(street, number, apt, size, ownerName,  ownerId,  ownerPhone);
		setSmb(smb);
	}
	
	public char getSmb() {
		return smb;
	}

	public void setSmb(char smb) {
		if(smb == 'S' || smb == 'M'|| smb == 'L')
			this.smb = smb;
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
			Commercial c = (Commercial)o;
			if ((street== c.street) && (number==c.number) && (apt==c.apt))
				return true;
			else
				return false;
		}
		else
			return false;
	}
	
	//calculate commercial tax
	public double calcPropertyTax()
	{
		if (smb == 'S')
			return size * m * 1.6;
		else if (smb == 'M')
			return size * m * 2;
		else
			return size * m * 2.4;
	}
	
	//calculate commercial insurance
	public double calcInsurance()
	{
		if (smb == 'S')
			return size* (priceM+10);
		else if (smb == 'M')
			return size* (priceM+15);
		else 
			return size* (priceM+20);

	}
	
	//return the damage cost
	public double insuranceClaim(int damage)
	{
		double differance = calcInsurance() - damage;
		if (damage <= calcInsurance())
			return 0;
		else return differance;
	}
	// call father function
	public void ownershipTransfer(String name, String id, int Phone) {
		super.ownershipTransfer(name, id, Phone);
		
	}
	public void ownershipDetails() {
		super.ownershipDetails();
	}
}

