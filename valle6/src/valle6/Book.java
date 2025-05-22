package valle6;

import java.text.NumberFormat;
/* Author: Felo Malachi Valle
 * SPC ID#: 2394922
 * Purpose:  This file is used in the TestBook.java file.  It is home to the Book object.
 * Pseudo-Code:
 * - Have 4 instance variables, title, author, pages, price
 * - Have 1 static variable which holds the total number of books
 * - Implement methods as described. (See comments above methods)
 */
public class Book {
	private String title;
	private String author;
	private int pages;
	private double price;
	public static int numBooks = 0;
	
	//Args constructor
	public Book(String title, String author, int pages, double price) {
		numBooks++;
		this.title = title;
		this.author = author;
		this.pages = pages;
		this.price = price;
	}
	//No-args constructor
	public Book() {
		numBooks++;
	}
	//Convert this Book to string and return
	public String toString() {
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		return String.format("Book title=%s, author=%s, pages=%d, price = %s", this.title, this.author, this.pages, formatter.format(this.price));
	}
	
	//Setters and getters
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getTitle() {
		return this.title;
	}
	public String getAuthor() {
		return this.author;
	}
	public int getPages() {
		return this.pages;
	}
	public double getPrice() {
		return this.price;
	}
}