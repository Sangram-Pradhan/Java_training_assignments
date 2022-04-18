package assignments;

import java.io.*;

import java.lang.*;
import java.util.*;

class Book{
	String bookname;
	long isbn;
	int price;
	
	
	public Book(String bookname, long isbn, int price) {
		super();
		this.bookname = bookname;
		this.isbn = isbn;
		this.price = price;
}
	
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookname=" + bookname + ", isbn=" + isbn + ", price=" + price + "]";
	}
}
	
	
	class Sortbyprice implements Comparator<Book>{
		
		public int compare(Book a, Book b) {
			
			return a.price - b.price;
		}
	}

public class BookSort {

	 public static void main(String[] args)
	    {
	    	
	    	List<Book> bookobj = new ArrayList<Book>();
	    	
	    	bookobj.add(new Book("Habits", 105, 500));
	    	bookobj.add(new Book("Voice", 108, 300));
	    	bookobj.add(new Book("Speed", 102, 150));
	    	bookobj.add(new Book("Nature", 107, 100));
	    	bookobj.add(new Book("Alone", 101, 400));
	    	
	    	System.out.println("\nBefore Sorting the Products: " + bookobj);
	    	
	    	Collections.sort(bookobj, new Sortbyprice());
	    	System.out.println("\nProducts Sorted by price :" + bookobj);
}

}
