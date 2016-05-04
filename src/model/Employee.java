package model;

public class Employee extends User{
	
	public Employee(String userID, String password, String firstName, String lastName, String phoneNumber, String address) {
		userType = "employee";
		this.userID = userID;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		loggedIn = false;
	}
}
