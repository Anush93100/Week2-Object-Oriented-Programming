

import java.util.Scanner;

//crating mobilePhone class
class MobilePhone{
   //creating brand, model and price attributes
   private String brand;
   private String model;
   private double price;
   
   //constructor
   MobilePhone(String brand, String model, double price){
	   this.brand=brand;
	   this.model=model;
	   this.price=price;
   }
   
    //method to displaying details of mobile phone
	public void displayDetails(){
	     System.out.println("\n-----Mobile Phone Details-----");
		 System.out.println("Brand     :" + brand);
		 System.out.println("Model     :" + model);
		 System.out.println("Price     :" + price + "$"); 
		 System.out.println("-------------------------------");
	}
}

//creating mobilePhone Details class
public class MobilePhoneDetails5{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		
		//taking input from the user
		System.out.println("Enter Brand of mobile phone:");
		String brand=input.nextLine();
		
		//taking input from the user
		System.out.println("Enter model of mobile phone :");
		String model=input.nextLine();
	
	    //taking input from the user
		System.out.println("Enter price of mobile phone :");
		double price=input.nextDouble();
		
		//creating object of mobile phone class
		MobilePhone mobile = new MobilePhone(brand, model, price);
		
		//displaying the result
		mobile.displayDetails();
		
		input.close();
	}
}