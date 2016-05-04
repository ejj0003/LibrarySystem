package model;

public class Patron extends User{

	public Patron(String userID, String password, String firstName, String lastName, String phoneNumber, String address) {
		userType = "patron";
		this.userID = userID;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		loggedIn = false;
	}
}
