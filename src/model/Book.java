package model;

public class Book {
	
	private static final int MILLISECONDS_IN_A_WEEK = 604800000;
	private String author;
	private String title;
	private String description;
	private String location;
	private String status;
	private String bookID;
	private String transactionUserID;
	private long dueTimeMilliseconds;
	
	public Book(String author, String title, String description, String location, String bookID) {
		this.author = author;
		this.title = title;
		this.description = description;
		this.location = location;
		status = "available";
	    this.bookID = bookID;
		transactionUserID = "";
		dueTimeMilliseconds = Long.MAX_VALUE;
	}
	
	public Book(String author, String title, String description, String location, String status, String bookID, String transactionUserID, long dueTimeMilliseconds) {
		this.author = author;
		this.title = title;
		this.description = description;
		this.location = location;
		this.status = status; 
		this.bookID = bookID;
		this.transactionUserID = transactionUserID;
		this.dueTimeMilliseconds = dueTimeMilliseconds;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getLocation() {
		return location;
	}
	
	public String getStatus() {
		return status;
	}
	
	public String getBookID() {
		return bookID;
	}
	
	public String getTransactionUserID() {
		return transactionUserID;
	}
	
	public long getDueTime() {
		return dueTimeMilliseconds;
	}
	
	public boolean isLate() {
		return System.currentTimeMillis() > getDueTime();
	}
	
	public void setAuthor(String author) {
		this.author = author;
		//TODO: update database
	}
	
	public void setTitle(String title) {
		this.title = title;
		//TODO: update database
	}
	
	public void setDescription(String description) {
		this.description = description;
		//TODO: update database
	}
	
	public void setLocation(String location) {
		this.location = location;
		//TODO: update database
	}
	
	private void setTransactionUserID(String transactionUserID) {
		this.transactionUserID = transactionUserID;
		//TODO: update database
	}
	
	private void setStatus(String status) {
		this.status = status;
		//TODO: update database
	}
	
	private void setDueTime(long dueTimeMilliseconds) {
		this.dueTimeMilliseconds = dueTimeMilliseconds;
		//TODO: update database
	}
	
	public void checkBookIn() {
		setTransactionUserID("");
		setStatus("available");
		setDueTime(Long.MAX_VALUE);
		//TODO: update database
	}
	
	public void checkBookOut(String userID) {
		setTransactionUserID(userID);
		setStatus("checked out");
		setDueTime(System.currentTimeMillis() + MILLISECONDS_IN_A_WEEK);
		//TODO: update database
	}
	
	public void unReserveBook() {
		setStatus("available");
		setTransactionUserID("");
		//TODO: update database
	}
	
	public void reserveBook(String userID) {
		setStatus("reserved");
		setTransactionUserID(userID);
		//TODO: update database
	}
	
	public void markAsLost() {
		setStatus("lost");
		setTransactionUserID("");
		setDueTime(Long.MAX_VALUE);
		//TODO: update database
	}
}
