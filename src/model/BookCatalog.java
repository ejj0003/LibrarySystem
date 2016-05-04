package model;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class BookCatalog {
	
	private ArrayList<Book> bookList = new ArrayList<Book>();
	
	public BookCatalog() {
		retrieveBookObjects();
	}
	
	public ArrayList<Book> getBookList() {
		return bookList;
	}
	
	public void retrieveBookObjects() {
		//TODO: check for duplicates if we are calling this multiple times, not just at the beginning of the execution
		File f = new File("db/BookDatabase.txt");
		try {
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine()){
				String line = sc.nextLine();
				String[] details = line.split(",");
				String author = details[0];
				String title = details[1];
				String description = details[2];
				String location = details[3];
				String status = details[4];
				String bookID = details[5];
				String transactionUserID = details[6];
				long dueTimeMilliseconds = Long.parseLong(details[7]);
				Book newBook = new Book(author, title, description, location, status, bookID, transactionUserID, dueTimeMilliseconds);
				bookList.add(newBook);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String addBook(String author, String title, String description, String location) {
		String bookID = generateUniqueBookID();
		Book newBook = new Book(author, title, description, location, bookID);
		String outputText = "\n" + author + "," + title + "," + description + "," + location + "," + newBook.getStatus() + "," + newBook.getBookID() + "," + newBook.getTransactionUserID() + "," + Long.toString(newBook.getDueTime());
		bookList.add(newBook);
		try {
			Files.write(Paths.get("db/BookDatabase.txt"), outputText.getBytes(), StandardOpenOption.APPEND);
		} catch(IOException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return bookID;
	}
	
	public void deleteBook(String bookID) {
		if (getBookIndex(bookID) != -1 && getBookIndex(bookID) < bookList.size()) {
			bookList.remove(getBookIndex(bookID));
			updateDatabase();
		}
	}
	
	public void updateDatabase() {
		String outputText = "";
		PrintWriter writer = null;
		
		for(int i = 0; i < bookList.size(); i++) {
			outputText += bookList.get(i).getAuthor() + ",";
			outputText += bookList.get(i).getTitle() + ",";
			outputText += bookList.get(i).getDescription() + ",";
			outputText += bookList.get(i).getLocation() + ",";
			outputText += bookList.get(i).getStatus() + ",";
			outputText += bookList.get(i).getBookID() + ",";
			outputText += bookList.get(i).getTransactionUserID() + ",";
			outputText += Long.toString(bookList.get(i).getDueTime());
			
			if (i != bookList.size() - 1) {
				outputText += "\n";
			}
		}
		
		try {
			writer = new PrintWriter("db/BookDatabase.txt", "UTF-8");
			writer.print(outputText);
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Book getBookInstance(String bookID) {
		if (getBookIndex(bookID) != -1 && getBookIndex(bookID) < bookList.size()) {
			return bookList.get(getBookIndex(bookID));
		} else {
			return null;
		}
	}
	
	private int getBookIndex(String bookID) {
		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).getBookID().equals(bookID)) {
				return i;
			}
		}
		
		return -1; //return -1 if book not found with given bookID
	}
	
	private String generateUniqueBookID() {
		int highestBookID = 0;
		
		for(Book book: bookList) {
			try {
				if(Integer.parseInt(book.getBookID()) > highestBookID) {
					highestBookID = Integer.parseInt(book.getBookID());
				}
			} catch (NumberFormatException e) {
				continue;
			}
		}
		
		return Integer.toString(highestBookID + 1);
	}
}
