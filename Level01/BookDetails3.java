
import java.util.Scanner;

//creating Book class
class Book{
	//creating title, author, price
	private String title;
	private String author;
	private double price;
	
	//creating constructor
	Book(String title, String author, double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
	//method to displaying details of Book
	public void displayDetails(){
	     System.out.println("-----Book Details-----");
		 System.out.println("Title         :" + title);
		 System.out.println("Author        :" + author);
		 System.out.println("Price         :" + price + "$"); 
		 System.out.println("----------------------");
	}
}

//creating bookDeatils class
public class BookDetails3{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		
		//taking input from the user
		System.out.println("Enter title of the book :");
		String title=input.nextLine();
		
		//taking input from the user
		System.out.println("Enter author of the book :");
		String author=input.nextLine();
	
	    //taking input from the user
		System.out.println("Enter price of the book :");
		double price=input.nextDouble();
		
		//creating object of book class
		Book book = new Book(title,author,price);

        //displaying the result
        book.displayDetails();
		
		input.close();

	}
}