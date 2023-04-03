
	import java.util.Scanner;

	public abstract class Asset implements property_tax{
		protected String street, ownerName, ownerId;
		protected int number,apt, size, ownerPhone;
		
		// half constructor
		public Asset(String street, int number, int apt, int size) 
		{
			super();
			if (street != null)
				this.street = street;
			if (number > 0)
				this.number = number;
			if (apt >=0)	
				this.apt = apt;
			if (size > 0)
				this.size = size;

		}

		//constructor
		public Asset(String street,  int number, int apt, int size, String ownerName, String ownerId, int ownerPhone) {
			super();
			this.street = street;
			this.ownerName = ownerName;
			this.ownerId = ownerId;
			this.number = number;
			this.apt = apt;
			this.size = size;
			this.ownerPhone = ownerPhone;
		}
		// update the asset owner details
		public void ownershipTransfer(String name, String id, int Phone) {
			Scanner input = new Scanner (System.in);
			
			System.out.println("please enter the owner name: ");
			ownerName= input.nextLine();
			
			System.out.println("please enter the owner ID: ");
			ownerId= input.nextLine();
			
			System.out.println("please enter the owner phone number: ");
			ownerPhone =input.nextInt();
		}
		
		// print the asset owner details
		public void ownershipDetails() {
			System.out.println("Owner name: "+ ownerName + ", Owner ID: "+ ownerId + ", Owner phone: "+ ownerPhone);
		}
		


	}

