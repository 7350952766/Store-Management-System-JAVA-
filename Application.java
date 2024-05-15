import java.util.Scanner;

class StoreManagementSystem
{
	Scanner input;
	int choice;
	
	StoreManagementSystem()
	{
		input = new Scanner(System.in);
	}
	
	
	void createNewProduct()
	{
         	 System.out.print("\nEnter the brand name: ");
		 String brand_name = input.next();
		 
		 System.out.print("\nEnter the product name:");
		 String product_name= input.next();
		 
		 System.out.print("\nEnter the manufacturing date (dd-mm-yyyy): ");
		 String mfg_date= input.next();
		 
		 System.out.print("\nEnter the price per unit: ");
		 float price = Float.parseFloat(input.next());
		 
		 System.out.print("\nEnter the total quantity: ");
		 int quantity = Integer.parseInt(input.next());
		 
		Product product = new Product(brand_name, product_name, price, mfg_date);		
		System.out.println("\n\nNew product created successfully !");
	}
	
	void showMenu()
	{
		System.out.println("\n***** Store Management System *****\n");		
		System.out.println("1) Create a new product \n2) View all products");
		System.out.println("3) Delete a product \n4) View stocks \n5) Create a bill");
		System.out.println("6) Exit");
		
		choice = input.nextInt();
		
		switch(choice)
		{
			case 1:
				createNewProduct();
			break;
			
			case 2:
			break;
			
			case 3:
			break;
			
			case 4:
			break;
			
			case 5:
			break;
			
			case 6:
				System.exit(0);
			break;
			
			default:
			System.out.println("Invalid choice :(");
		}
	}
	
	
}

class Application
{
	public static void main(String args[])
	{
		StoreManagementSystem app = new StoreManagementSystem();
		
		while(true)
		{
			app.showMenu();
		}
	}
}
