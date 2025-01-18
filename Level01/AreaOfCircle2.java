
import java.util.Scanner;

//creating Circle class
class Circle{
	//creating radius attributes
	private double radius;
	private double area;
	private double circumference;
	
	//creating constructor 
	Circle(double radius){
		this.radius=radius;
		
	}
	
	//method to calculate area
	public double calculateArea(){
		area = 3.14 * radius *radius;
		return area;
	}
	
	//method to calculate circumference
	public double calculateCircumference(){
		circumference = 2 * 3.14 * radius;
		return circumference;
	}
	
	//method to displaying details of circle
	public void displayDetails(){
		 calculateArea();
		 calculateCircumference();
	     System.out.println("-----Circle Details-----");
		 System.out.println("Radius         :" + radius);
		 System.out.println("Area           :" + area);
		 System.out.println("Circumference  :" + circumference); 
		 System.out.println("------------------------");
	}
}

public class AreaOfCircle2{
	public static void main(String args[]){
		Scanner input =new Scanner(System.in);
		
		//taking input from the user
		System.out.println("Enter the radius of a Circle :");
		double radius=input.nextDouble();
		
		//creating object of circle class
		Circle circle1=new Circle(radius);
		
		//displaying the result
		circle1.displayDetails();
		
		input.close();
	}
}