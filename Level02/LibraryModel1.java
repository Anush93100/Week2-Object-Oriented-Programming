
import java.util.List;
import java.util.ArrayList;

class Book{
	private String bookTitle;
	
	Book(String bookTitle){
		this.bookTitle=bookTitle;
	}
	
	public String getBookTitle(){
		return bookTitle;
	}
}

class Library{
	private String libraryName;
	private List<Book> books;
	
	Library(String libraryName){
		this.libraryName=libraryName;
		books=new ArrayList<>();
	}
	
	public void addBook(Book book){
		if(!books.contains(book)){
			books.add(book);
		}
	}
	
	public List<Book> getBooks(){
		return books;
	}
	
	public String getLibraryName(){
		return libraryName;
	}
}

public class LibraryModel1{
	public static void main(String[] args){
		Book book1=new Book("Java Second edition");
		Book book2=new Book("Game of Thrones vol.1");
		Book book3=new Book("Three mistake of my Life");
		Book book4=new Book("Atomic Habits");
		
		Library library=new Library("TIT centra library");
		
		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);
		library.addBook(book4);
		
		System.out.println("\nLibrary Name: " + library.getLibraryName());
		System.out.println("Books: ");
		for(Book b: library.getBooks()){
			System.out.println(b.getBookTitle());
		}
	}
}