package valle6;

public class TestBook {
	/* Author: Felo Malachi Valle
	 * SPC ID#: 2394922
	 * Purpose:  This program utilizes the Book class in Book.java to manipulate and display information about a library of books.
	 * Pseudo-Code:
	 * - Create Book array to hold 6 books
	 * - Display array
	 * - Call finishArray() to add last 2 books using setter methods
	 * - Get mostExpensive book using reduceBooks(). In reduceBooks, reduce the cost of all books by 40%
	 * - Display array after discount
	 * - Display the most expensive book, and the size of the library
	 */
	public static void main(String[] args) {
		//Create Book array with 6 books
		Book[] bookArray= new Book[6];
		bookArray[0] = new Book("Java Programming", "Liang", 1320, 145.00);
		bookArray[1] = new Book("Horton Hears a Who!", "Dr.Seuss", 72, 19.99);
		bookArray[2] = new Book("The Hobbit", "Tolkien", 320, 9.25);
		bookArray[3] = new Book("Born a Crime", "Noah", 304, 17.33);
		bookArray[4] = new Book();
		bookArray[5] = new Book();
		
		//Display bookArray
		for(Book element : bookArray) {
			System.out.println(element.toString());
		}
		
		//Call finishArray() and reduceBooks()
		finishArray(bookArray);
		Book mostExpensive = reduceBooks(bookArray);
		
		//Display bookArray after discount
		System.out.printf("\n");
		for(Book element : bookArray) {
			System.out.println(element.toString());
		}
		
		//Display most expensive book, and size of library
		System.out.printf("\nHere is the most expensive book after the discounts\n%s\nSize of library: %d books", mostExpensive.toString(), Book.numBooks);
	}
	
	//Adds 2 books to the end of the array of Book objects using setters
	public static void finishArray(Book[] bookArray) {
		bookArray[4].setTitle("Dark Territory");
		bookArray[4].setAuthor("Kaplan");
		bookArray[4].setPages(352);
		bookArray[4].setPrice(18.74);
		bookArray[5].setTitle("Born to Run");
		bookArray[5].setAuthor("Springsteen");
		bookArray[5].setPages(508);
		bookArray[5].setPrice(20.29);
	}
	
	//Reduces all books cost by 40% and returns the most expensive book
	public static Book reduceBooks(Book[] bookArray) {
		int indexOfMostExpensive = 0;
		for(int i = 0; i < bookArray.length; i++) {
			//Apply the 40% discount
			bookArray[i].setPrice(bookArray[i].getPrice() * 0.6);
			//Used to find the most expensive book
			if(bookArray[i].getPrice()>bookArray[indexOfMostExpensive].getPrice()) {
				indexOfMostExpensive = i;
			}
		}
		return bookArray[indexOfMostExpensive];
	}

}
