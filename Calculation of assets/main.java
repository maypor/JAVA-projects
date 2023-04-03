/*
The program creates a municipal payment system that handles different properties
 (residential property/commercial property/public property).
The system calculates property tax and insurance based on existing data
*/
import java.util.ArrayList;

public class main {

	public static void main(String[] args) 
	{
		ArrayList <Asset> cityList = new ArrayList <Asset>();
		ArrayList <Asset> propertyTaxList = new ArrayList <Asset>();
		ArrayList <Asset> insuranceList = new ArrayList <Asset>();

		//make new objects and adding to array list
		Commercial p1 = new Commercial("dave", 17, 9, 90, 'S', "may", "1234", 56984);
		Commercial p2 = new Commercial("cohen", 16, 2, 70, 'M', "sivan", "2345", 7894);
		Public p3 = new Public("levi", 10, 1, 80,"community center", "shahar", "3456", 6542 );
		Residential p4 = new Residential("dan", 12, 6, 60, 4, "sason", "4567", 4578);

		cityList.add(p1);
		cityList.add(p2);
		cityList.add(p3);
		cityList.add(p4);

		propertyTaxList.add(p1);
		propertyTaxList.add(p3);
		propertyTaxList.add(p4);
		
		insuranceList.add(p1);
		insuranceList.add(p2);
		insuranceList.add(p3);
		
		//print valus
		for (int i = 0; i < cityList.size(); i++)
		{
			System.out.println(cityList.get(i).toString());
			cityList.get(i).ownershipDetails();
			System.out.println();
		}
		
	}

}
