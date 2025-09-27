package Assignmnet9;
import java.util.*;

public class Book implements Comparable {
     private String isbn;
     private double price;
     private String authorName;
     private int quantity;
     
     public Book() {
    	 
     }

	public Book(String isbn, double price, String authorName, int quantity) {
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Library [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ "]";
	}

	@Override
	public int compareTo(Object o) {
		Book book = (Book) o; 
		int diff= (int)(this.getIsbn().compareTo(book.getIsbn()));
		return diff;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj==null) {
			return false;
			
		}
		if(this==obj) {
			return true;
		}
		if(!(obj instanceof Book)){
			return false;
		}
		Book b1=(Book)obj;
		if(this.isbn.compareTo(b1.getIsbn())==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
    
	
}
