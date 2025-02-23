package dto;

import java.io.Serializable;

public class Book implements Serializable {
	
	private static final long serialVersionUID = -4274700572038677000L;
	
	private String bookId;
	private String name;
	private int unitPrice;
	private String author;
	
	public Book() {
		super();
}
	public Book(String bookId, String name, Integer unitPrice) {
		this.bookId = bookId;
		this.name = name;
		this.unitPrice = unitPrice;
	}
	
	public String getBookId() {
		return bookId;
	}
	
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getUnitPrice() {
		return unitPrice;
	}
	
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public String getAuthor( ) {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	

}
