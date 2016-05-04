package controller;
import java.util.ArrayList;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.*;
import model.*;

//TODO: Only populate certain options for patrons

public class Controller {
	
	Library lib = new Library();
	View window = new View();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Controller controller = new Controller();
					controller.startProgram();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void startProgram() {
		initializeActionListener();
		window.frame.setVisible(true);
		displayLoginView();
	}
	
	private void hideAllViews() {
		window.LoginView.setVisible(false);
		window.HomeView.setVisible(false);
		window.SearchBookView.setVisible(false);
		window.BookView.setVisible(false);
		window.BookModifyView.setVisible(false);
		window.CheckOutView.setVisible(false);
		window.UserView.setVisible(false);
		window.UserModifyView.setVisible(false);
		window.SearchUserView.setVisible(false);
		window.AddUserView.setVisible(false);
		window.AddBookView.setVisible(false);
		window.ReportView.setVisible(false);
	}
	
	private void displayLoginView() {
		hideAllViews();
		window.LoginView.setVisible(true);
	}
	
	private void displayHomeView() {
		hideAllViews();
		window.HomeView.setVisible(true);	
	}
	
	private void displaySearchBookView() {
		hideAllViews();
		window.SBVfdSearch.setText("");
		window.SBVchoice.select(0);
		window.listModelSBV.clear();
		window.SearchBookView.setVisible(true);
	}
	
	private void displayBookView(String bookID) {
		hideAllViews();
		if (lib.getBookList().getBookInstance(bookID) != null) {
			window.BVlbltitleNameLable.setText(lib.getBookList().getBookInstance(bookID).getTitle());
			window.BVlblAuthorNameLabel.setText(lib.getBookList().getBookInstance(bookID).getAuthor());
			window.BVlblDescriptionLabel.setText(lib.getBookList().getBookInstance(bookID).getDescription());
			window.BVlblBookIDLabel.setText(lib.getBookList().getBookInstance(bookID).getBookID());
			window.BVlblLocationLabel.setText(lib.getBookList().getBookInstance(bookID).getLocation());
			window.BVlblStatusLabel.setText(lib.getBookList().getBookInstance(bookID).getStatus());
		} else {
			window.BVlbltitleNameLable.setText("");
			window.BVlblAuthorNameLabel.setText("");
			window.BVlblDescriptionLabel.setText("");
			window.BVlblBookIDLabel.setText("");
			window.BVlblLocationLabel.setText("");
			window.BVlblStatusLabel.setText("");
		}
			
		window.BookView.setVisible(true);
	}
	
	private void displayBookModifyView(String bookID) {
		hideAllViews();
		if (lib.getBookList().getBookInstance(bookID) != null) {
			window.BMVfdTitle.setText(lib.getBookList().getBookInstance(bookID).getTitle());
			window.BMVfdAuthor.setText(lib.getBookList().getBookInstance(bookID).getAuthor());
			window.BMVfdDescription.setText(lib.getBookList().getBookInstance(bookID).getDescription());
			window.BMVfdLocation.setText(lib.getBookList().getBookInstance(bookID).getLocation());
			window.BMVlblError.setText("");
		} else {
			window.BMVfdTitle.setText("");
			window.BMVfdAuthor.setText("");
			window.BMVfdDescription.setText("");
			window.BMVfdLocation.setText("");
			window.BMVlblError.setText("Error: book not found");
		}
		
		window.BookModifyView.setVisible(true);
	}
	
	private void displayCheckOutView(String bookID) {
		hideAllViews();
		
		window.COVfdBookID.setText(bookID);
		window.COVfdUserID.setText("");
		
		window.CheckOutView.setVisible(true);
	}
	
	private void displayUserView(String userID) {
		hideAllViews();
		//TODO: clear the two listModels
		
		if (lib.getUserList().getUserInstance(userID) != null) {
			window.UVlblUserIDLabel.setText(lib.getUserList().getUserInstance(userID).getUserID());
			window.UVlblNameLabel.setText(lib.getUserList().getUserInstance(userID).getFirstName() + " " + lib.getUserList().getUserInstance(userID).getLastName());
			window.UVlblPhoneLabel.setText(lib.getUserList().getUserInstance(userID).getPhoneNumber());
			window.UVlblAddressLabel.setText(lib.getUserList().getUserInstance(userID).getAddress());
			window.UVlblUserIDLabel2.setText(lib.getUserList().getUserInstance(userID).getUserID());
			window.UVlblUserTypeLabel.setText(lib.getUserList().getUserInstance(userID).getUserType());
			
			//TODO: populate both jlists and make it so that users can view the book info using one of two buttons
		} else {
			window.UVlblUserIDLabel.setText("");
			window.UVlblNameLabel.setText("");
			window.UVlblPhoneLabel.setText("");
			window.UVlblAddressLabel.setText("");
			window.UVlblUserIDLabel2.setText("");
			window.UVlblUserTypeLabel.setText("");
		}
		
		window.UserView.setVisible(true);
	}
	
	private void displayUserModifyView(String userID) {
		hideAllViews();
		
		if (lib.getUserList().getUserInstance(userID) != null) {
			window.UMVlblUserIDLabel.setText(lib.getUserList().getUserInstance(userID).getUserID());
			window.UMVfdFirstName.setText(lib.getUserList().getUserInstance(userID).getFirstName());
			window.UMVfdLastName.setText(lib.getUserList().getUserInstance(userID).getLastName());
			window.UMVfdPhone.setText(lib.getUserList().getUserInstance(userID).getPhoneNumber());
			window.UMVfdAddress.setText(lib.getUserList().getUserInstance(userID).getAddress());
			window.UMVfdPassword.setText("");
			window.UMVlblError.setText("");
		} else {
			window.UMVlblUserIDLabel.setText("");
			window.UMVfdFirstName.setText("");
			window.UMVfdLastName.setText("");
			window.UMVfdPhone.setText("");
			window.UMVfdAddress.setText("");
			window.UMVfdPassword.setText("");
			window.UMVlblError.setText("Error: User not found");
		}
		
		window.UserModifyView.setVisible(true);
	}
	
	private void displaySearchUserView() {
		hideAllViews();
		
		//TODO: clear the listModel
		//TODO: populate the jlist and make it so that you can go the a user's information page using a button
		
		window.SearchUserView.setVisible(true);
	}
	
	private void displayAddUserView() {
		hideAllViews();
		
		window.AUVchoice.select(0);
		window.AUVfdFirstName.setText("");
		window.AUVfdLastName.setText("");
		window.AUVfdPhone.setText("");
		window.AUVfdAddress.setText("");
		window.AUVfdNewPassword.setText("");
		window.AUVlblError.setText("");
		
		window.AddUserView.setVisible(true);
	}
	
	private void displayAddBookView() {
		hideAllViews();
		
		window.ABVfdTitle.setText("");
		window.ABVfdAuthor.setText("");
		window.ABVfdDescription.setText("");
		window.ABVfdLocation.setText("");
		window.ABVlblError.setText("");
		
		window.AddBookView.setVisible(true);
	}
	
	private void displayReportView() {
		hideAllViews();
		
		//TODO: clear the content in the tabbed pane and open the first tab
		//TODO: display the lists of books in the tabbed pane
		//TODO: make book pages viewable by pressing a button
		
		window.ReportView.setVisible(true);
	}
	
	private void initializeActionListener() {
		//LoginView
		
		window.LVbtnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userID = window.LVfdUserID.getText();
				String password = window.LVfdPassword.getText();
				
				if (lib.getUserList().getUserInstance(userID) != null) {
					if (lib.getUserList().getUserInstance(userID).logIn(password)) {
						lib.setUserLoggedIn(userID);
						window.LVfdUserID.setText("");
						window.LVfdPassword.setText("");
						displayHomeView();
					} else {
						window.LVlblError.setText("Error: invalid password");
					}
				} else {
					window.LVlblError.setText("Error: user not found");
				}
			}
		});
		
		//HomeView
		
		window.HVbntAccountInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayUserView(lib.getUserLoggedIn());
			}
		});
		
		window.HVbtnFindBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displaySearchBookView();
			}
		});
		
		window.HVbtnCheckOutBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayCheckOutView("");
			}
		});

		window.HVbtnFindUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displaySearchUserView();
			}
		});

		window.HVbtnAddAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayAddUserView();
			}
		});

		window.HVbtnAddBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayAddBookView();
			}
		});
		
		window.HVbtnGenerateReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayReportView();
			}
		});

		window.HVbtnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lib.getUserList().getUserInstance(lib.getUserLoggedIn()).logOut();
				lib.setUserLoggedIn("");
				displayLoginView();
			}
		});
		
		//SearchBookView
		
		window.SBVbtnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				window.listModelSBV.clear();
				String searchText = window.SBVfdSearch.getText();
				String searchType = window.SBVchoice.getSelectedItem();
				String result;
				
				if (!searchText.equals("")) {
					if (searchType.equals("Title")) {
						ArrayList<Book> bookList = lib.search("title", searchText);
						for(int i = 0; i < bookList.size(); i++){
							result =  "Title: " + bookList.get(i).getTitle() + "        Author: " + bookList.get(i).getAuthor() + "        BookID: " + bookList.get(i).getBookID() +  "        Status: " + bookList.get(i).getStatus();
							window.listModelSBV.addElement(result);
						}
					} else if (searchType.equals("Author")) {
						ArrayList<Book> bookList = lib.search("author", searchText);
						for(int i = 0; i < bookList.size(); i++){
							result =  "Title: " + bookList.get(i).getTitle() + "        Author: " + bookList.get(i).getAuthor() + "        BookID: " + bookList.get(i).getBookID() +  "        Status: " + bookList.get(i).getStatus();
							window.listModelSBV.addElement(result);
						}
					} else {
						ArrayList<Book> bookList = lib.search("bookID", searchText);
						for(int i = 0; i < bookList.size(); i++){
							result =  "Title: " + bookList.get(i).getTitle() + "        Author: " + bookList.get(i).getAuthor() + "        BookID: " + bookList.get(i).getBookID() +  "        Status: " + bookList.get(i).getStatus();
							window.listModelSBV.addElement(result);
						}
					}
				}
			}
		});

		window.SBVbtnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lib.getUserList().getUserInstance(lib.getUserLoggedIn()).logOut();
				lib.setUserLoggedIn("");
				displayLoginView();
			}
		});
		
		window.SBVbtnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayHomeView();
			}
		});
		
		window.SBVbtnViewBookDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (window.SBVlist.getSelectedIndex()!= -1) {
					String selection = (String) window.SBVlist.getSelectedValue();
					int bookIDSubstringBeginIndex = selection.lastIndexOf("BookID: ") + "BookID: ".length();
					int bookIDSubstringEndIndex = selection.lastIndexOf("        Status: ");
					
					displayBookView(selection.substring(bookIDSubstringBeginIndex, bookIDSubstringEndIndex));
				}
			}
		});
		
		//BookView
		
		window.BVbtnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayHomeView();
			}
		});

		window.BVbtnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lib.getUserList().getUserInstance(lib.getUserLoggedIn()).logOut();
				lib.setUserLoggedIn("");
				displayLoginView();
			}
		});

		window.BVbtnModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayBookModifyView(window.BVlblBookIDLabel.getText());
			}
		});
		
		window.BVbtnCheckOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayCheckOutView(window.BVlblBookIDLabel.getText());
			}
		});
		
		window.BVbtnCheckIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lib.getBookList().getBookInstance(window.BVlblBookIDLabel.getText()).checkBookIn();
				window.BVlblStatusLabel.setText("available");
			}
		});
		
		window.BVbtnReserve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayCheckOutView(window.BVlblBookIDLabel.getText());
			}
		});
		
		window.BVbtnUnReserve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lib.getBookList().getBookInstance(window.BVlblBookIDLabel.getText()).unReserveBook();
				window.BVlblStatusLabel.setText("available");
			}
		});
		
		//BookModifyView
		
		window.BMVbtnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayHomeView();
			}
		});

		window.BMVbtnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lib.getUserList().getUserInstance(lib.getUserLoggedIn()).logOut();
				lib.setUserLoggedIn("");
				displayLoginView();
			}
		});
		
		window.BMVbtnUpdateInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bookID = window.BVlblBookIDLabel.getText();
				
				if (!bookID.equals("")) {
					lib.getBookList().getBookInstance(bookID).setTitle(window.BMVfdTitle.getText());
					lib.getBookList().getBookInstance(bookID).setAuthor(window.BMVfdAuthor.getText());
					lib.getBookList().getBookInstance(bookID).setDescription(window.BMVfdDescription.getText());
					lib.getBookList().getBookInstance(bookID).setLocation(window.BMVfdLocation.getText());
					lib.getBookList().updateDatabase();
					window.BMVlblError.setText("Success: Book information updated");
				} else {
					window.BMVlblError.setText("Error: Could not update information - book not found");
				}
			}
		});
		
		window.BMVbtnRemoveBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bookID = window.BVlblBookIDLabel.getText();
				
				if (!bookID.equals("")) {
					lib.getBookList().deleteBook(bookID);
					lib.getBookList().updateDatabase();
					window.BMVlblError.setText("Success: Book removed");
				} else {
					window.BMVlblError.setText("Error: Could not remove book - book not found");
				}
			}
		});
		
		window.BMVbtnMarkAsLost.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bookID = window.BVlblBookIDLabel.getText();
				
				if (!bookID.equals("")) {
					lib.getBookList().getBookInstance(bookID).markAsLost();
					lib.getBookList().updateDatabase();
					window.BMVlblError.setText("Success: Book marked as lost");
				} else {
					window.BMVlblError.setText("Error: Could not mark as lost - book not found");
				}
			}
		});
		
		//CheckOutView
		
		window.COVbtnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayHomeView();
			}
		});
		
		window.COVbtnCheckOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bookID = window.COVfdBookID.getText();
				String userID = window.COVfdUserID.getText();
				
				if (lib.getBookList().getBookInstance(bookID) != null) {
					if (lib.getUserList().getUserInstance(bookID) != null) {
						if (lib.getBookList().getBookInstance(bookID).getStatus().equals("available")) {
							lib.getBookList().getBookInstance(bookID).checkBookOut(userID);
							window.COVlblError.setText("Success: book checked out");
							lib.getBookList().updateDatabase();
						} else if (lib.getBookList().getBookInstance(bookID).getStatus().equals("reserved")){
							if (lib.getBookList().getBookInstance(bookID).getTransactionUserID().equals(userID)) {
								lib.getBookList().getBookInstance(bookID).checkBookOut(userID);
								window.COVlblError.setText("Success: book checked out");
								lib.getBookList().updateDatabase();
							} else {
								window.COVlblError.setText("Error: book is reserved to a different user");
							}
						} else {
							window.COVlblError.setText("Error: book was not available or reserved to the specified user");
						}
					} else {
						window.COVlblError.setText("Error: user not found");
					}
				} else {
					window.COVlblError.setText("Error: book not found");
				}
			}
		});
		
		window.COVbtnReserve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bookID = window.COVfdBookID.getText();
				String userID = window.COVfdUserID.getText();
				
				if (lib.getBookList().getBookInstance(bookID) != null) {
					if (lib.getUserList().getUserInstance(bookID) != null) {
						if (lib.getBookList().getBookInstance(bookID).getStatus().equals("available")) {
							lib.getBookList().getBookInstance(bookID).reserveBook(userID);
							window.COVlblError.setText("Success: book reserved");
							lib.getBookList().updateDatabase();
						} else {
							window.COVlblError.setText("Error: book is not available to be reserved");
						}
					} else {
						window.COVlblError.setText("Error: user not found");
					}
				} else {
					window.COVlblError.setText("Error: book not found");
				}
			}
		});

		window.COVbtnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lib.getUserList().getUserInstance(lib.getUserLoggedIn()).logOut();
				lib.setUserLoggedIn("");
				displayLoginView();
			}
		});
		
		//UserView
		
		window.UVbtnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayHomeView();
			}
		});
		
		window.UVbtnModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayUserModifyView(window.UVlblUserIDLabel.getText());
			}
		});

		window.UVbtnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lib.getUserList().getUserInstance(lib.getUserLoggedIn()).logOut();
				lib.setUserLoggedIn("");
				displayLoginView();
			}
		});
		
		//UserModifyView
		
		window.UMVbtnUpdateInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userID = window.UMVlblUserIDLabel.getText();
				
				if (!userID.equals("")) {
					lib.getUserList().getUserInstance(userID).setFirstName(window.UMVfdFirstName.getText());
					lib.getUserList().getUserInstance(userID).setLastName(window.UMVfdLastName.getText());
					lib.getUserList().getUserInstance(userID).setPhoneNumber(window.UMVfdPhone.getText());
					lib.getUserList().getUserInstance(userID).setAddress(window.UMVfdAddress.getText());
					lib.getUserList().getUserInstance(userID).setPassword(window.UMVfdPassword.getText());
					lib.getUserList().updateDatabase();
					window.UMVlblError.setText("Success: User information updated");
				} else {
					window.UMVlblError.setText("Error: Could not update information - user not found");
				}
			}
		});
		
		window.UMVbtnRemoveUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userID = window.UMVlblUserIDLabel.getText();
				
				if (!userID.equals("")) {
					for (Book book : lib.getCheckedOutBooks(userID)) {
						book.checkBookIn();
					}
					for (Book book : lib.getReservedOutBooks(userID)) {
						book.unReserveBook();
					}
					
					if (userID.equals(lib.getUserLoggedIn())) {
						lib.getUserList().getUserInstance(userID).logOut();
						lib.setUserLoggedIn("");
						displayLoginView();
					} else {
						displayHomeView();
					}
					
					lib.getUserList().deleteUser(userID);
					lib.getUserList().updateDatabase();
					lib.getBookList().updateDatabase();
					
				} else {
					window.UMVlblError.setText("Error: Could not delete user - user not found");
				}
			}
		});

		window.UMVbtnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lib.getUserList().getUserInstance(lib.getUserLoggedIn()).logOut();
				lib.setUserLoggedIn("");
				displayLoginView();
			}
		});
		
		window.UMVbtnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayHomeView();
			}
		});
		
		//SearchUserView
		
		window.SUVbtnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayHomeView();
			}
		});

		window.SUVbtnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lib.getUserList().getUserInstance(lib.getUserLoggedIn()).logOut();
				lib.setUserLoggedIn("");
				displayLoginView();
			}
		});
		
		//AddUserView
		
		window.AUVbtnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayHomeView();
			}
		});
		
		window.AUVbtnAddUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userType = window.AUVchoice.getSelectedItem().toString().toLowerCase();
				String password = window.AUVfdNewPassword.getText();
				String firstName = window.AUVfdFirstName.getText();
				String lastName = window.AUVfdLastName.getText();
				String phoneNumber = window.AUVfdPhone.getText();
				String address = window.AUVfdAddress.getText();
				String userID = lib.getUserList().addUser(userType, password, firstName, lastName, phoneNumber, address);
				
				window.AUVlblError.setText("Success: user created with userID: " + userID);
				lib.getUserList().updateDatabase();
			}
		});

		window.AUVbtnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lib.getUserList().getUserInstance(lib.getUserLoggedIn()).logOut();
				lib.setUserLoggedIn("");
				displayLoginView();
			}
		});
		
		//AddBookView
		
		window.ABVbtnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayHomeView();
			}
		});

		window.ABVbtnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lib.getUserList().getUserInstance(lib.getUserLoggedIn()).logOut();
				lib.setUserLoggedIn("");
				displayLoginView();
			}
		});
		
		window.ABVbtnAddBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String author = window.ABVfdAuthor.getText();
				String title = window.ABVfdTitle.getText();
				String description = window.ABVfdDescription.getText();
				String location = window.ABVfdLocation.getText();
				String bookID = lib.getBookList().addBook(author, title, description, location);
				
				window.ABVlblError.setText("Success: book created with bookID: " + bookID);
				lib.getBookList().updateDatabase();
			}
		});
		
		//ReportView

		window.RVbtnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayHomeView();
			}
		});

		window.RVbtnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lib.getUserList().getUserInstance(lib.getUserLoggedIn()).logOut();
				lib.setUserLoggedIn("");
				displayLoginView();
			}
		});	
	}
}