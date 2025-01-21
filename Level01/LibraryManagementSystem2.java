
//craeting Book class
class Book{
	static String libraryName;
	String title;
	String author;
	final String isbn;
	
	//constructor
	Book(String title, String author, String isbn){
		libraryName="TIT Library";
		this.title=title;
		this.author=author;
		this.isbn=Integer.toString(100)+isbn;
	}
	
	//method to get Library Name
	public static String getLibraryName(){
		return libraryName;
	}
	
	//method to display Details
	public static void displayDetails(Book book){
		if(book instanceof Book){
		    System.out.println("-----Book Details-----");
			System.out.println("Title         :" + book.title);
			System.out.println("Author        :" + book.author);
			System.out.println("ISBN no.      :" + book.isbn);
			System.out.println("Library Name  :" + book.getLibraryName());
	    }else{
			System.out.println("Given Object is not an instance of Book class");
		}
	}	
}

//creating Library management System class
public class LibraryManagementSystem2{
	public static void main(String[] args){
		Book book1=new Book("Game of Thrones vol.1","R.R. Martin","542");
		Book.displayDetails(book1);
		Book book2=new Book("Harry Potter","J.K. Rowling","543");
		Book.displayDetails(book2);
	}
}