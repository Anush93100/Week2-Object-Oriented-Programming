
import java.util.Scanner;

//creating Items class
class Items{
   //creating itemCode, itemName, price attributes
    private String itemCode;
    private String itemName;
    private double price;

    //creating constructor
    Items(String itemCode, String itemName, double price){
		this.itemCode=itemCode;
		this.itemName=itemName;
		this.price=price;
	}	
	
	//method to find total cost 
	public double calculateTotalCost(int quantity){
		return quantity*price;
	}
	
    //method to displaying details of items
	public void displayDetails(){
	     System.out.println("\n-----Item Details-----");
		 System.out.println("Item code     :" + itemCode);
		 System.out.println("Item name     :" + itemName);
		 System.out.println("Price         :" + price + "$"); 
		 System.out.println("----------------------");
	} 
}

public class ItemDetails4{
	public static void main(String args[]){
		Scanner input =new Scanner(System.in);
		
		//taking input from the user
		System.out.println("Enter Item code of the item :");
		String itemCode=input.nextLine();
		
		//taking input from the user
		System.out.println("Enter Item name of the item :");
		String itemName=input.nextLine();
	
	    //taking input from the user
		System.out.println("Enter price of the item :");
		double price=input.nextDouble();
		
		//creating object of class item
		Items item1=new Items(itemCode, itemName, price);
		
		//displaying the result
		item1.displayDetails();
		
		//taking input from the user
		System.out.println("\nEnter quantity of the item :");
		int quantity=input.nextInt();
		
		//displaying total cost of items
		System.out.println("Total cost of " + quantity + " items is : " + item1.calculateTotalCost(quantity) + "$");
		
		input.close();
		
	}
}