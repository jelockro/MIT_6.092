import java.util.*;
public class Library {
// Add the missing implementation to this class
	String address;
	//attempting arraylist, since array was throwing nullpointer exceptions
	List<Book> books = new ArrayList<Book>();
	List<Book> borrowed = new ArrayList<Book>();
	
	int borrowedCount = 0;
	static String openingHours = "Libraries ore open daily from 9am to 5pm";
	
	
	
	//adds books to library array shelf
	public void addBook(Book book){
		
		books.add(book);
	
	}
	
	//prints address of library
	public void printAddress(){
		
		System.out.println(this.address);
	}
	
	//prints out openingHours
	public static void printOpeningHours(){
		
		System.out.println(openingHours);
	}
	
	//prints available books
	public void printAvailableBooks(){
		
		if (books.size() == 0 ){
			System.out.println("no Book in catalog");
		}
		
		else{
			
			for (Book i : books){
				if (i.borrowed == false){
				System.out.println(i.getTitle());
				}
			}	
		}
	}
	
	
	//method to borrow a book
	public void borrowBook(String bookTitle){
		
		int i = 0;
		int j = 0;
		
		//check to see if the book has been borrowed
//		System.out.println("books.size() =" + books.size());
		
		while (books.size() > j){
//			System.out.println(j);
			String shelfTitle = books.get(j).getTitle();
//			System.out.println(shelfTitle + bookTitle);
			if (shelfTitle == bookTitle && books.get(j).borrowed){
				System.out.println("Sorry, this book is already borrowed");
			}	
//					
//			//check to see if the book is on shelf
			else if (shelfTitle == bookTitle){
					books.get(j).borrowed();
					System.out.println("You successfully borrowed " + bookTitle);
					
			}
//			
			else {
				i++;
			

			}
			
			j++;
//			System.out.println("j =" + j);
//			System.out.println("i =" + i);
		}
		
		if (i == books.size() || books.size() == 0 ){
				System.out.println("Sorry, this book is not in our catalog");
		}
	
		
	}	
		
		
	//method to return a book
	public void returnBook(String bookTitle){
		int j = 0;
		while (books.size() > j){
			String shelfTitle = books.get(j).getTitle();
			
			if (shelfTitle == bookTitle){
				books.get(j).setBorrowed(false);
				System.out.println(bookTitle +" returned");
			}
			
			j++;
		}
	}
	
	
	//constructs Library requires address
	public Library (String libAddress){
		
		this.address = libAddress;
		
		
	}
	
	public static void main(String[] args) {
		// Create two libraries
		Library firstLibrary = new Library("10 Main St.");
		Library secondLibrary = new Library("228 Liberty St.");

		// Add four books to the first library
		firstLibrary.addBook(new Book("The Da Vinci Code"));
		firstLibrary.addBook(new Book("Le Petit Prince"));
		firstLibrary.addBook(new Book("A Tale of Two Cities"));
		firstLibrary.addBook(new Book("The Lord of the Rings"));
		// Print opening hours and the addresses
		System.out.println("Library hours:");
		printOpeningHours();
		System.out.println();
		System.out.println("Library addresses:");
		firstLibrary.printAddress();
		secondLibrary.printAddress();
		System.out.println();

		// Try to borrow The Lords of the Rings from both libraries
		// this is stupid that they are using strings instead of book objects
		// changing it so it uses books
		System.out.println("Borrowing The Lord of the Rings:");
		firstLibrary.borrowBook("The Lord of the Rings");
		firstLibrary.borrowBook("The Lord of the Rings");
		secondLibrary.borrowBook("The Lord of the Rings");
		System.out.println();

		// Print the titles of all available books from both libraries
		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();
		System.out.println();
		System.out.println("Books available in the second library:");
		secondLibrary.printAvailableBooks();
		System.out.println();

		// Return The Lords of the Rings to the first library
		System.out.println("Returning The Lord of the Rings:");
		firstLibrary.returnBook("The Lord of the Rings");
		System.out.println();

		// Print the titles of available from the first library
		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();
}
}