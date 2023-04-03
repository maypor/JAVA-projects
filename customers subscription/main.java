

/* This program gets a data on customers subscription and calculate the cost
 * 
 */
public class main {

	public static void main(String[] args) {
		
		Subscriber b1 = new Subscriber(200, 5);
		System.out.println("the manual cost for b1 is : " + b1.calcCost());
		System.out.println("the refound for b1 is : " + b1.calcRefund(2));
		b1.print();
		System.out.println();
		
		Service pool = new Service("pool", 50);
		Service locker = new Service("locker", 10, true);
		Service playroom = new Service("playroom", 25, true);

		Advanced ad1 = new Advanced(160,2);
		ad1.addService(pool);
		ad1.addService(locker);
		
		System.out.println("the manual cost for ad1 is : " + ad1.calcCost());
		ad1.print();
		System.out.println();

		Advanced ad2 = new Advanced(180,2);
		ad2.addService(pool);
		System.out.println("the manual cost for ad2 is : " + ad2.calcCost());
		if (ad2.serviceExist("spinning"))
			System.out.println("the spinning servise is exist");
		else
			System.out.println("the spinning servise does not exist");
		ad2.addService(pool);
		System.out.println();
		
		Family fam1 = new Family (3, 2, 190, 11);
		fam1.addService(pool);
		fam1.addService(playroom);
		System.out.println("the manual cost for fam1 is : " + fam1.calcCost());
		System.out.println("the refound cost for fam1 is: " + fam1.calcRefund(3));
		fam1.print();
		
	

	}

}
