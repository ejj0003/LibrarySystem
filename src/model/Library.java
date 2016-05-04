package model;
import java.util.ArrayList;

public class Library {
	
	private BookCatalog listOfBooks;
	private UserCatalog listOfUsers;
	private String userLoggedIn;
	
	public Library() {
		listOfBooks = new BookCatalog();
		listOfUsers = new UserCatalog();
		userLoggedIn = "";
	}
	
	public String getUserLoggedIn() {
		return userLoggedIn;
	}
	
	public void setUserLoggedIn(String userLoggedIn) {
		this.userLoggedIn = userLoggedIn;
	}
	
	public ArrayList<Book> search(String category, String searchInput) {
		ArrayList<Book> bookList = new ArrayList<Book>();
		
		for (Book book: listOfBooks.getBookList()) {
			if (category.equals("title")) {
				if (book.getTitle().toLowerCase().contains(searchInput.toLowerCase())) {
					bookList.add(book);
				}
			} else if (category.equals("author")) {
				if (book.getAuthor().toLowerCase().contains(searchInput.toLowerCase())) {
					bookList.add(book);
				}
			} else if (category.equals("bookID")) {
				if (book.getBookID().equals(searchInput)) {
					bookList.add(book);
				}
			}
		}
		
		return bookList;
	}
	
	public UserCatalog getUserList() {
		return listOfUsers;
	}
	
	public BookCatalog getBookList() {
		return listOfBooks;
	}
	
	public ArrayList<Book> getAvailableBooks() {
		ArrayList<Book> bookList = new ArrayList<Book>();
		
		for (Book book: listOfBooks.getBookList()) {
			if (book.getStatus().equals("available")) {
				bookList.add(book);
			}
		}
		
		return bookList;
	}
	
	public ArrayList<Book> getCheckedOutBooks() {
		ArrayList<Book> bookList = new ArrayList<Book>();
		
		for (Book book: listOfBooks.getBookList()) {
			if (book.getStatus().equals("checked out")) {
				bookList.add(book);
			}
		}
		
		return bookList;
	}
	
	public ArrayList<Book> getReservedBooks() {
		ArrayList<Book> bookList = new ArrayList<Book>();
		
		for (Book book: listOfBooks.getBookList()) {
			if (book.getStatus().equals("reserved")) {
				bookList.add(book);
			}
		}
		
		return bookList;
	}
	
	public ArrayList<Book> getLateBooks() {
		ArrayList<Book> bookList = new ArrayList<Book>();
		
		for (Book book: listOfBooks.getBookList()) {
			if (book.getStatus().equals("checked out") && book.isLate()) {
				bookList.add(book);
			}
		}
		
		return bookList;
	}
	
	public ArrayList<Book> getLostBooks() {
		ArrayList<Book> bookList = new ArrayList<Book>();
		
		for (Book book: listOfBooks.getBookList()) {
			if (book.getStatus().equals("lost")) {
				bookList.add(book);
			}
		}
		
		return bookList;
	}
	
	public ArrayList<Book> getCheckedOutBooks(String userID) {
		ArrayList<Book> bookList = new ArrayList<Book>();
		
		for (Book book: listOfBooks.getBookList()) {
			if (book.getTransactionUserID().equals(userID) && book.getStatus().equals("checked out")) {
				bookList.add(book);
			}
		}
		
		return bookList;
	}
	
	public ArrayList<Book> getReservedOutBooks(String userID) {
		ArrayList<Book> bookList = new ArrayList<Book>();
		
		for (Book book: listOfBooks.getBookList()) {
			if (book.getTransactionUserID().equals(userID) && book.getStatus().equals("reserved")) {
				bookList.add(book);
			}
		}
		
		return bookList;
	}
}
