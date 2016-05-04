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

public class UserCatalog {

	private ArrayList<User> userList = new ArrayList<User>();
	
	public UserCatalog() {
		retrieveUserObjects();
	}
	
	public ArrayList<User> getUserList() {
		return userList;
	}
	
	public void retrieveUserObjects() {
		//TODO: check for duplicates if we are calling this multiple times, not just at the beginning of the execution
				File f = new File("db/UserDatabase.txt");
				try {
					Scanner sc = new Scanner(f);
					while(sc.hasNextLine()){
						String line = sc.nextLine();
						String[] details = line.split(",");
						String userType = details[0];
						String userID = details[1];
						String password = details[2];
						String firstName = details[3];
						String lastName = details[4];
						String phoneNumber = details[5];
						String address = details[6];
						User newUser = null;
						
						if (userType.equals("employee")) {
							newUser = new Employee(userID, password, firstName, lastName, phoneNumber, address);
						} else {
							newUser = new Patron(userID, password, firstName, lastName, phoneNumber, address);
						}
						userList.add(newUser);
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	
	public String addUser(String userType, String password, String firstName, String lastName, String phoneNumber, String address) {
		String userID = generateUniqueUserID();
		
		User newUser = null;
		if (userType.equals("employee")) {
			newUser = new Employee(userID, password, firstName, lastName, phoneNumber, address);
		} else {
			newUser = new Patron(userID, password, firstName, lastName, phoneNumber, address);
		}
		
		String outputText = "\n" + userType + "," + userID + "," + password + "," + firstName + "," + lastName + "," + phoneNumber + "," + address;
		userList.add(newUser);
		try {
			Files.write(Paths.get("db/UserDatabase.txt"), outputText.getBytes(), StandardOpenOption.APPEND);
		} catch(IOException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return userID;
	}
	
	public void deleteUser(String userID) {
		if (getUserIndex(userID) != -1 && getUserIndex(userID) < userList.size()) {
			userList.remove(getUserIndex(userID));
			updateDatabase();
		}
	}
	
	public void updateDatabase() {
		String outputText = "";
		PrintWriter writer = null;
		
		for(int i = 0; i < userList.size(); i++) {
			outputText += userList.get(i).getUserType() + ",";
			outputText += userList.get(i).getUserID() + ",";
			outputText += userList.get(i).getPassword() + ",";
			outputText += userList.get(i).getFirstName() + ",";
			outputText += userList.get(i).getLastName() + ",";
			outputText += userList.get(i).getPhoneNumber() + ",";
			outputText += userList.get(i).getAddress();
			
			if (i != userList.size() - 1) {
				outputText += "\n";
			}
		}
		
		try {
			writer = new PrintWriter("db/UserDatabase.txt", "UTF-8");
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
	
	public User getUserInstance(String userID) {
		if (getUserIndex(userID) != -1 && getUserIndex(userID) < userList.size()) {
			return userList.get(getUserIndex(userID));
		} else {
			return null;
		}
	}
	
	private int getUserIndex(String userID) {
		for (int i = 0; i < userList.size(); i++) {
			if (userList.get(i).getUserID().equals(userID)) {
				return i;
			}
		}
		
		return -1; //return -1 if user not found with given userID
	}
	
	private String generateUniqueUserID() {
		int highestUserID = 0;
		
		for(User user: userList) {
			try {
				if(Integer.parseInt(user.getUserID()) > highestUserID) {
					highestUserID = Integer.parseInt(user.getUserID());
				}
			} catch (NumberFormatException e) {
				continue;
			}
		}
		
		return Integer.toString(highestUserID + 1);
	}
}