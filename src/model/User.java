package model;

public abstract class User {
	
	protected String userType;
	protected String userID;
	protected String password;
	protected String firstName;
	protected String lastName;
	protected String phoneNumber;
	protected String address;
	protected boolean loggedIn;
	
	public String getUserID() {
		return userID;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getUserType() {
		return userType;
	}
	
	public void setPassword(String password) {
		this.password = password;
		//TODO: update database
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		//TODO: update database
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
		//TODO: update database
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		//TODO: update database
	}
	
	public void setAddress(String address) {
		this.address = address;
		//TODO: update database
	}
	
	public boolean logIn(String password) {
		if (getPassword().equals(password)){
			loggedIn = true;
			return true;
		} else {
			loggedIn = false;
			return false;
		}
	}
	
	public void logOut() {
		loggedIn = false;
	}
	
	public boolean isLoggedIn() {
		return loggedIn;
	}
}
