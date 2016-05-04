package view;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Choice;
import javax.swing.JList;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;

public class View {

	public Image img = new ImageIcon(this.getClass().getResource("/logo.png")).getImage();
	public JFrame frame;
	public JPanel LoginView;
	public JPanel HomeView;
	public JPanel SearchBookView;
	public JPanel BookView;
	public JPanel BookModifyView;
	public JPanel CheckOutView;
	public JPanel UserView;
	public JPanel UserModifyView;
	public JPanel SearchUserView;
	public JPanel AddUserView;
	public JPanel AddBookView;
	public JPanel ReportView;
	
	public JTextField LVfdUserID;
	public JTextField LVfdPassword;
	public JTextField SBVfdSearch;
	public JTextField BMVfdTitle;
	public JTextField BMVfdAuthor;
	public JTextField BMVfdDescription;
	public JTextField BMVfdLocation;
	public JTextField COVfdBookID;
	public JTextField COVfdUserID;
	public JTextField UMVfdFirstName;
	public JTextField UMVfdLastName;
	public JTextField UMVfdPhone;
	public JTextField UMVfdAddress;
	public JTextField UMVfdPassword;
	public JTextField AUVfdFirstName;
	public JTextField AUVfdLastName;
	public JTextField AUVfdPhone;
	public JTextField AUVfdAddress;
	public JTextField AUVfdNewPassword;
	public JTextField ABVfdTitle;
	public JTextField ABVfdAuthor;
	public JTextField ABVfdDescription;
	public JTextField ABVfdLocation;
	
	public JButton LVbtnLogin;
	public JButton HVbtnFindBook;
	public JButton HVbntAccountInfo;
	public JButton HVbtnCheckOutBook;
	public JButton HVbtnFindUser;
	public JButton HVbtnAddAccount;
	public JButton HVbtnAddBook;
	public JButton HVbtnGenerateReport;
	public JButton SBVbtnSearch;
	public JButton BVbtnBack;
	public JButton BVbtnLogOut;
	public JButton BVbtnModify;
	public JButton BVbtnCheckOut;
	public JButton BVbtnCheckIn;
	public JButton BVbtnReserve;
	public JButton BVbtnUnReserve;
	public JButton BMVbtnBack;
	public JButton BMVbtnLogOut;
	public JButton BMVbtnUpdateInformation;
	public JButton BMVbtnRemoveBook;
	public JButton BMVbtnMarkAsLost;
	public JButton COVbtnBack;
	public JButton COVbtnCheckOut;
	public JButton COVbtnReserve;
	public JButton COVbtnLogOut;
	public JButton UVbtnBack;
	public JButton UVbtnModify;
	public JButton UVbtnLogOut;
	public JButton UMVbtnBack;
	public JButton UMVbtnUpdateInformation;
	public JButton UMVbtnRemoveUser;
	public JButton UMVbtnLogOut;
	public JButton SUVbtnBack;
	public JButton AUVbtnBack;
	public JButton AUVbtnAddUser;
	public JButton AUVbtnLogOut;
	public JButton ABVbtnBack;
	public JButton ABVbtnLogOut;
	public JButton ABVbtnAddBook;
	public JButton RVbtnBack;
	public JButton RVbtnLogOut;
	public JButton SUVbtnLogOut;
	public JButton SBVbtnLogOut;
	public JButton HVbtnLogOut;
	public JButton SBVbtnBack;
	public JButton SBVbtnViewBookDetails;
	public Choice SBVchoice;
	public Choice AUVchoice;

	public JList SBVlist;
	public JList UVlist;
	public JList UVlist2;
	public JList SUVlist;
	public DefaultListModel listModelSBV;
	public DefaultListModel listModelUV;
	public DefaultListModel listModelUV2;
	public DefaultListModel listModelSUV;
	
	public JLabel BMVlblError;
	public JLabel COVlblError;
	public JLabel UMVlblError;
	public JLabel AUVlblError;
	public JLabel ABVlblError;
	public JLabel BVlbltitleNameLable;
	public JLabel BVlblAuthorNameLabel;
	public JLabel BVlblDescriptionLabel;
	public JLabel BVlblBookIDLabel;
	public JLabel BVlblLocationLabel;
	public JLabel BVlblStatusLabel;
	public JLabel LVlblError;
	public JLabel UVlblUserIDLabel;
	public JLabel UVlblNameLabel;
	public JLabel UVlblUserIDLabel2;
	public JLabel UVlblPhoneLabel;
	public JLabel UVlblUserTypeLabel;
	public JLabel UVlblAddressLabel;
	public JLabel UMVlblUserIDLabel;
	
	public JScrollPane scrollPane;
	public JLabel label_1;
	public JLabel label_2;
	public JLabel label_3;
	public JLabel label_4;
	public JLabel label_6;
	public JLabel label_8;
	public JLabel label_10;
	public JLabel label_11;
	public JLabel label_12;
	public JLabel label_13;
	public JLabel label_14;
	public JLabel label_15;
	public JScrollPane scrollPane_1;
	public JScrollPane scrollPane_2;
	public JLabel lblReservedBooks;
	public JLabel lblCheckedOutBooks;
	public JLabel lblSearchResults;
	public JScrollPane scrollPane_3;
	public JLabel lblUsers;
	
	public JTabbedPane tabbedPane;
	public JScrollPane RVpaneAvailable;
	public JScrollPane RVpaneCheckedOut;
	public JScrollPane RVpaneReserved;
	public JScrollPane RVpaneLate;
	public JScrollPane RVpaneLost;
	

	/**
	 * Create the application.
	 */
	public View() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		//-----------------------------------------------------------------------------------------------------
		//LoginView
		
		LoginView = new JPanel();
		frame.getContentPane().add(LoginView, "name_841082715775240");
		LoginView.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(img));
		label.setBounds(220, 0, 320, 60);
		LoginView.add(label);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 525, 784, 2);
		LoginView.add(separator);
		
		JLabel LVlblUserID = new JLabel("UserID: ");
		LVlblUserID.setBounds(237, 115, 89, 14);
		LoginView.add(LVlblUserID);
		
		JLabel LVlblPassword = new JLabel("Password: ");
		LVlblPassword.setBounds(237, 140, 89, 14);
		LoginView.add(LVlblPassword);
		
		LVfdUserID = new JTextField();
		LVfdUserID.setColumns(10);
		LVfdUserID.setBounds(326, 112, 189, 20);
		LoginView.add(LVfdUserID);
		
		LVfdPassword = new JTextField();
		LVfdPassword.setColumns(10);
		LVfdPassword.setBounds(326, 137, 189, 20);
		LoginView.add(LVfdPassword);
		
		LVbtnLogin = new JButton("Login");
		LVbtnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		LVbtnLogin.setBounds(326, 165, 89, 23);
		LoginView.add(LVbtnLogin);
		
		LVlblError = new JLabel("");
		LVlblError.setBounds(150, 500, 500, 14);
		LoginView.add(LVlblError);
		
		label_1 = new JLabel("Hours: 9am-11pm M-F          Phone: (123) 456-7890          Address: 123 S College St, Auburn AL, 36830");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(0, 530, 784, 20);
		LoginView.add(label_1);
		
		//-----------------------------------------------------------------------------------------------------
		//HomeView
		
		HomeView = new JPanel();
		frame.getContentPane().add(HomeView, "name_841085381043318");
		HomeView.setLayout(null);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(img));
		label_5.setBounds(220, 0, 320, 60);
		HomeView.add(label_5);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 525, 784, 2);
		HomeView.add(separator_1);
		
		HVbtnFindBook = new JButton("Find Book");
		HVbtnFindBook.setBounds(313, 204, 151, 23);
		HomeView.add(HVbtnFindBook);
		
		HVbntAccountInfo = new JButton("Account info");
		HVbntAccountInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		HVbntAccountInfo.setBounds(313, 170, 151, 23);
		HomeView.add(HVbntAccountInfo);
		
		HVbtnCheckOutBook = new JButton("Check Out Book");
		HVbtnCheckOutBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		HVbtnCheckOutBook.setBounds(313, 238, 151, 23);
		HomeView.add(HVbtnCheckOutBook);
		
		HVbtnFindUser = new JButton("Find User");
		HVbtnFindUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		HVbtnFindUser.setBounds(313, 272, 151, 23);
		HomeView.add(HVbtnFindUser);
		
		HVbtnAddAccount = new JButton("Add Account");
		HVbtnAddAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		HVbtnAddAccount.setBounds(313, 306, 151, 23);
		HomeView.add(HVbtnAddAccount);
		
		HVbtnAddBook = new JButton("Add Book");
		HVbtnAddBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		HVbtnAddBook.setBounds(313, 340, 151, 23);
		HomeView.add(HVbtnAddBook);
		
		HVbtnGenerateReport = new JButton("Generate Report");
		HVbtnGenerateReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		HVbtnGenerateReport.setBounds(313, 374, 151, 23);
		HomeView.add(HVbtnGenerateReport);
		
		HVbtnLogOut = new JButton("Log Out");
		HVbtnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		HVbtnLogOut.setBounds(685, 11, 89, 23);
		HomeView.add(HVbtnLogOut);
		
		label_2 = new JLabel("Hours: 9am-11pm M-F          Phone: (123) 456-7890          Address: 123 S College St, Auburn AL, 36830");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(0, 530, 784, 20);
		HomeView.add(label_2);
		
		//-----------------------------------------------------------------------------------------------------
		//SearchBookView
		
		SearchBookView = new JPanel();
		frame.getContentPane().add(SearchBookView, "name_842042487756605");
		SearchBookView.setLayout(null);
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon(img));
		label_7.setBounds(220, 0, 320, 60);
		SearchBookView.add(label_7);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 525, 784, 2);
		SearchBookView.add(separator_2);
		
		SBVchoice = new Choice();
		SBVchoice.add("Title");
		SBVchoice.add("Author");
		SBVchoice.add("BookID");
		SBVchoice.setBounds(81, 124, 103, 20);
		SearchBookView.add(SBVchoice);
		
		SBVfdSearch = new JTextField();
		SBVfdSearch.setColumns(10);
		SBVfdSearch.setBounds(190, 124, 414, 20);
		SearchBookView.add(SBVfdSearch);
		
		SBVbtnSearch = new JButton("Search");
		SBVbtnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		SBVbtnSearch.setBounds(614, 124, 89, 23);
		SearchBookView.add(SBVbtnSearch);
		
		listModelSBV = new DefaultListModel();
		
		SBVbtnLogOut = new JButton("Log Out");
		SBVbtnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		SBVbtnLogOut.setBounds(685, 11, 89, 23);
		SearchBookView.add(SBVbtnLogOut);
		
		SBVbtnBack = new JButton("<- Back");
		SBVbtnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		SBVbtnBack.setBounds(10, 11, 89, 23);
		SearchBookView.add(SBVbtnBack);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(94, 179, 626, 249);
		SearchBookView.add(scrollPane);
		SBVlist = new JList(listModelSBV);
		scrollPane.setViewportView(SBVlist);
		
		lblSearchResults = new JLabel("Search results");
		scrollPane.setColumnHeaderView(lblSearchResults);
		
		SBVbtnViewBookDetails = new JButton("View Book Details");
		SBVbtnViewBookDetails.setBounds(94, 439, 161, 23);
		SearchBookView.add(SBVbtnViewBookDetails);
		
		label_3 = new JLabel("Hours: 9am-11pm M-F          Phone: (123) 456-7890          Address: 123 S College St, Auburn AL, 36830");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(0, 530, 784, 20);
		SearchBookView.add(label_3);
		
		//-----------------------------------------------------------------------------------------------------
		//BookView
		
		BookView = new JPanel();
		frame.getContentPane().add(BookView, "name_842044821785070");
		BookView.setLayout(null);
		
		JLabel label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon(img));
		label_9.setBounds(220, 0, 320, 60);
		BookView.add(label_9);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(0, 525, 784, 2);
		BookView.add(separator_3);
		
		BVbtnBack = new JButton("<- Back");
		BVbtnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BVbtnBack.setBounds(10, 11, 89, 23);
		BookView.add(BVbtnBack);
		
		BVbtnLogOut = new JButton("Log Out");
		BVbtnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BVbtnLogOut.setBounds(685, 11, 89, 23);
		BookView.add(BVbtnLogOut);
		
		JLabel BVlblTitle = new JLabel("Title :");
		BVlblTitle.setBounds(92, 161, 63, 14);
		BookView.add(BVlblTitle);
		
		JLabel BVlblAuthor = new JLabel("Author :");
		BVlblAuthor.setBounds(79, 186, 76, 14);
		BookView.add(BVlblAuthor);
		
		JLabel BVlblDescription = new JLabel("Description :");
		BVlblDescription.setBounds(57, 211, 98, 14);
		BookView.add(BVlblDescription);
		
		JLabel BVlblBookID = new JLabel("BookID :");
		BVlblBookID.setBounds(76, 236, 79, 14);
		BookView.add(BVlblBookID);
		
		JLabel BVlblLocation = new JLabel("Location : ");
		BVlblLocation.setBounds(69, 261, 85, 14);
		BookView.add(BVlblLocation);
		
		JLabel BVlblStatus = new JLabel("Status :");
		BVlblStatus.setBounds(78, 288, 77, 14);
		BookView.add(BVlblStatus);
		
		BVlbltitleNameLable = new JLabel("");
		BVlbltitleNameLable.setBounds(165, 161, 364, 14);
		BookView.add(BVlbltitleNameLable);
		
		BVlblAuthorNameLabel = new JLabel("");
		BVlblAuthorNameLabel.setBounds(165, 185, 364, 14);
		BookView.add(BVlblAuthorNameLabel);
		
		BVlblDescriptionLabel = new JLabel("");
		BVlblDescriptionLabel.setBounds(165, 210, 364, 14);
		BookView.add(BVlblDescriptionLabel);
		
		BVlblBookIDLabel = new JLabel("");
		BVlblBookIDLabel.setBounds(165, 235, 364, 14);
		BookView.add(BVlblBookIDLabel);
		
		BVlblLocationLabel = new JLabel("");
		BVlblLocationLabel.setBounds(164, 260, 365, 14);
		BookView.add(BVlblLocationLabel);
		
		BVlblStatusLabel = new JLabel("");
		BVlblStatusLabel.setBounds(165, 287, 364, 14);
		BookView.add(BVlblStatusLabel);
		
		BVbtnModify = new JButton("Modify");
		BVbtnModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BVbtnModify.setBounds(539, 157, 111, 23);
		BookView.add(BVbtnModify);
		
		BVbtnCheckOut = new JButton("Check Out");
		BVbtnCheckOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BVbtnCheckOut.setBounds(539, 191, 111, 23);
		BookView.add(BVbtnCheckOut);
		
		BVbtnCheckIn = new JButton("Check In");
		BVbtnCheckIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BVbtnCheckIn.setBounds(539, 225, 111, 23);
		BookView.add(BVbtnCheckIn);
		
		BVbtnReserve = new JButton("Reserve");
		BVbtnReserve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BVbtnReserve.setBounds(539, 257, 111, 23);
		BookView.add(BVbtnReserve);
		
		BVbtnUnReserve = new JButton("Un-Reserve");
		BVbtnUnReserve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BVbtnUnReserve.setBounds(539, 291, 111, 23);
		BookView.add(BVbtnUnReserve);
		
		label_4 = new JLabel("Hours: 9am-11pm M-F          Phone: (123) 456-7890          Address: 123 S College St, Auburn AL, 36830");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(0, 530, 784, 20);
		BookView.add(label_4);
		
		//-----------------------------------------------------------------------------------------------------
		//BookModifyView
		
		BookModifyView = new JPanel();
		frame.getContentPane().add(BookModifyView, "name_842046237961504");
		BookModifyView.setLayout(null);
		
		JLabel label_23 = new JLabel("");
		label_23.setIcon(new ImageIcon(img));
		label_23.setBounds(220, 0, 320, 60);
		BookModifyView.add(label_23);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(0, 525, 784, 2);
		BookModifyView.add(separator_4);
		
		BMVbtnBack = new JButton("<- Back ");
		BMVbtnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BMVbtnBack.setBounds(10, 11, 89, 23);
		BookModifyView.add(BMVbtnBack);
		
		JLabel BMVlblTitle = new JLabel("Title :");
		BMVlblTitle.setBounds(48, 155, 46, 14);
		BookModifyView.add(BMVlblTitle);
		
		JLabel BMVlblAuthor = new JLabel("Author : ");
		BMVlblAuthor.setBounds(48, 195, 63, 14);
		BookModifyView.add(BMVlblAuthor);
		
		JLabel BMVlblDescription = new JLabel("Description : ");
		BMVlblDescription.setBounds(48, 236, 75, 14);
		BookModifyView.add(BMVlblDescription);
		
		JLabel BMVlblLocation = new JLabel("Location : ");
		BMVlblLocation.setBounds(48, 278, 63, 14);
		BookModifyView.add(BMVlblLocation);
		
		BMVfdTitle = new JTextField();
		BMVfdTitle.setColumns(10);
		BMVfdTitle.setBounds(83, 152, 200, 20);
		BookModifyView.add(BMVfdTitle);
		
		BMVfdAuthor = new JTextField();
		BMVfdAuthor.setColumns(10);
		BMVfdAuthor.setBounds(99, 192, 187, 20);
		BookModifyView.add(BMVfdAuthor);
		
		BMVfdDescription = new JTextField();
		BMVfdDescription.setColumns(10);
		BMVfdDescription.setBounds(128, 233, 157, 20);
		BookModifyView.add(BMVfdDescription);
		
		BMVfdLocation = new JTextField();
		BMVfdLocation.setColumns(10);
		BMVfdLocation.setBounds(114, 275, 170, 20);
		BookModifyView.add(BMVfdLocation);
		
		BMVbtnLogOut = new JButton("Log Out");
		BMVbtnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BMVbtnLogOut.setBounds(685, 11, 89, 23);
		BookModifyView.add(BMVbtnLogOut);
		
		BMVbtnUpdateInformation = new JButton("Update Information");
		BMVbtnUpdateInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BMVbtnUpdateInformation.setBounds(511, 151, 151, 23);
		BookModifyView.add(BMVbtnUpdateInformation);
		
		BMVbtnRemoveBook = new JButton("Remove Book");
		BMVbtnRemoveBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BMVbtnRemoveBook.setBounds(511, 191, 151, 23);
		BookModifyView.add(BMVbtnRemoveBook);
		
		BMVbtnMarkAsLost = new JButton("Mark as Lost");
		BMVbtnMarkAsLost.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BMVbtnMarkAsLost.setBounds(511, 236, 151, 23);
		BookModifyView.add(BMVbtnMarkAsLost);
		
		BMVlblError = new JLabel("");
		BMVlblError.setBounds(150, 500, 500, 14);
		BookModifyView.add(BMVlblError);
		
		label_6 = new JLabel("Hours: 9am-11pm M-F          Phone: (123) 456-7890          Address: 123 S College St, Auburn AL, 36830");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBounds(0, 530, 784, 20);
		BookModifyView.add(label_6);
		
		//-----------------------------------------------------------------------------------------------------
		//CheckOutView
		
		CheckOutView = new JPanel();
		frame.getContentPane().add(CheckOutView, "name_842052109919761");
		CheckOutView.setLayout(null);
		
		JLabel label_29 = new JLabel("");
		label_29.setIcon(new ImageIcon(img));
		label_29.setBounds(220, 0, 320, 60);
		CheckOutView.add(label_29);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(0, 525, 784, 2);
		CheckOutView.add(separator_5);
		
		COVbtnBack = new JButton("<- Back ");
		COVbtnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		COVbtnBack.setBounds(10, 11, 89, 23);
		CheckOutView.add(COVbtnBack);
		
		JLabel COVlblBookID = new JLabel("BookID :");
		COVlblBookID.setBounds(48, 170, 46, 14);
		CheckOutView.add(COVlblBookID);
		
		JLabel COVlblUserID = new JLabel("UserID :");
		COVlblUserID.setBounds(48, 216, 46, 14);
		CheckOutView.add(COVlblUserID);
		
		COVfdBookID = new JTextField();
		COVfdBookID.setColumns(10);
		COVfdBookID.setBounds(100, 167, 126, 20);
		CheckOutView.add(COVfdBookID);
		
		COVfdUserID = new JTextField();
		COVfdUserID.setColumns(10);
		COVfdUserID.setBounds(98, 213, 128, 20);
		CheckOutView.add(COVfdUserID);
		
		COVbtnCheckOut = new JButton("Check Out");
		COVbtnCheckOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		COVbtnCheckOut.setBounds(354, 166, 102, 23);
		CheckOutView.add(COVbtnCheckOut);
		
		COVbtnReserve = new JButton("Reserve");
		COVbtnReserve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		COVbtnReserve.setBounds(354, 212, 102, 23);
		CheckOutView.add(COVbtnReserve);
		
		COVbtnLogOut = new JButton("Log Out");
		COVbtnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		COVbtnLogOut.setBounds(685, 11, 89, 23);
		CheckOutView.add(COVbtnLogOut);
		
		COVlblError = new JLabel("");
		COVlblError.setBounds(150, 500, 500, 14);
		CheckOutView.add(COVlblError);
		
		label_8 = new JLabel("Hours: 9am-11pm M-F          Phone: (123) 456-7890          Address: 123 S College St, Auburn AL, 36830");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setBounds(0, 530, 784, 20);
		CheckOutView.add(label_8);
		
		//-----------------------------------------------------------------------------------------------------
		//UserView
		
		UserView = new JPanel();
		frame.getContentPane().add(UserView, "name_842056431551684");
		UserView.setLayout(null);
		
		JLabel label_33 = new JLabel("");
		label_33.setIcon(new ImageIcon(img));
		label_33.setBounds(220, 0, 320, 60);
		UserView.add(label_33);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(0, 525, 784, 2);
		UserView.add(separator_6);
		
		UVbtnBack = new JButton("<- Back");
		UVbtnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		UVbtnBack.setBounds(10, 11, 89, 23);
		UserView.add(UVbtnBack);
		
		JLabel UVlblAccountInfo = new JLabel("Account Info for :");
		UVlblAccountInfo.setBounds(244, 104, 135, 14);
		UserView.add(UVlblAccountInfo);
		
		UVlblUserIDLabel = new JLabel("");
		UVlblUserIDLabel.setBounds(366, 104, 89, 14);
		UserView.add(UVlblUserIDLabel);
		
		JLabel UVlblName = new JLabel("Name :");
		UVlblName.setBounds(48, 151, 46, 14);
		UserView.add(UVlblName);
		
		JLabel UVlblPhone = new JLabel("Phone# :");
		UVlblPhone.setBounds(48, 176, 56, 14);
		UserView.add(UVlblPhone);
		
		JLabel UVlblAddress = new JLabel("Address :");
		UVlblAddress.setBounds(48, 201, 56, 14);
		UserView.add(UVlblAddress);
		
		JLabel UVlblUserID = new JLabel("UserID :");
		UVlblUserID.setBounds(313, 151, 56, 14);
		UserView.add(UVlblUserID);
		
		JLabel UVlblUserType = new JLabel("User Typer :");
		UVlblUserType.setBounds(313, 176, 74, 14);
		UserView.add(UVlblUserType);
		
		UVlblNameLabel = new JLabel("");
		UVlblNameLabel.setBounds(91, 151, 212, 14);
		UserView.add(UVlblNameLabel);
		
		UVlblPhoneLabel = new JLabel("");
		UVlblPhoneLabel.setBounds(100, 176, 203, 14);
		UserView.add(UVlblPhoneLabel);
		
		UVlblAddressLabel = new JLabel("");
		UVlblAddressLabel.setBounds(110, 201, 193, 14);
		UserView.add(UVlblAddressLabel);
		
		UVlblUserIDLabel2 = new JLabel("");
		UVlblUserIDLabel2.setBounds(366, 151, 185, 14);
		UserView.add(UVlblUserIDLabel2);
		
		UVlblUserTypeLabel = new JLabel("");
		UVlblUserTypeLabel.setBounds(390, 176, 161, 14);
		UserView.add(UVlblUserTypeLabel);
		
		UVbtnModify = new JButton("Modify");
		UVbtnModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		UVbtnModify.setBounds(561, 147, 89, 23);
		UserView.add(UVbtnModify);
		
		UVbtnLogOut = new JButton("Log Out");
		UVbtnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		UVbtnLogOut.setBounds(685, 11, 89, 23);
		UserView.add(UVbtnLogOut);
		
		label_10 = new JLabel("Hours: 9am-11pm M-F          Phone: (123) 456-7890          Address: 123 S College St, Auburn AL, 36830");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setBounds(0, 530, 784, 20);
		UserView.add(label_10);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(60, 244, 661, 109);
		UserView.add(scrollPane_1);
		
		UVlist = new JList();
		scrollPane_1.setViewportView(UVlist);
		
		lblReservedBooks = new JLabel("Reserved Books");
		scrollPane_1.setColumnHeaderView(lblReservedBooks);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(60, 385, 661, 109);
		UserView.add(scrollPane_2);
		
		UVlist2 = new JList();
		scrollPane_2.setViewportView(UVlist2);
		
		lblCheckedOutBooks = new JLabel("Checked out books");
		scrollPane_2.setColumnHeaderView(lblCheckedOutBooks);
		
		//-----------------------------------------------------------------------------------------------------
		//UserModifyView
		
		UserModifyView = new JPanel();
		frame.getContentPane().add(UserModifyView, "name_842068557405731");
		UserModifyView.setLayout(null);
		
		JLabel label_47 = new JLabel("");
		label_47.setIcon(new ImageIcon(img));
		label_47.setBounds(220, 0, 320, 60);
		UserModifyView.add(label_47);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setBounds(0, 525, 784, 2);
		UserModifyView.add(separator_7);
		
		UMVbtnBack = new JButton("<- Back ");
		UMVbtnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		UMVbtnBack.setBounds(10, 11, 89, 23);
		UserModifyView.add(UMVbtnBack);
		
		JLabel UMVlblModifyAccount = new JLabel("Modify Account Info for : ");
		UMVlblModifyAccount.setBounds(220, 146, 161, 14);
		UserModifyView.add(UMVlblModifyAccount);
		
		UMVlblUserIDLabel = new JLabel("");
		UMVlblUserIDLabel.setBounds(391, 146, 78, 14);
		UserModifyView.add(UMVlblUserIDLabel);
		
		JLabel UMVlblFirstName = new JLabel("First Name : ");
		UMVlblFirstName.setBounds(48, 191, 86, 14);
		UserModifyView.add(UMVlblFirstName);
		
		JLabel UMVlblPhone = new JLabel("Phone# : ");
		UMVlblPhone.setBounds(48, 264, 66, 14);
		UserModifyView.add(UMVlblPhone);
		
		JLabel UMVlblLastName = new JLabel("Last Name :");
		UMVlblLastName.setBounds(48, 227, 89, 14);
		UserModifyView.add(UMVlblLastName);
		
		JLabel UMVlblAddress = new JLabel("Address : ");
		UMVlblAddress.setBounds(48, 298, 66, 14);
		UserModifyView.add(UMVlblAddress);
		
		JLabel UMVlblPassword = new JLabel("New Password : ");
		UMVlblPassword.setBounds(48, 336, 114, 14);
		UserModifyView.add(UMVlblPassword);
		
		UMVfdFirstName = new JTextField();
		UMVfdFirstName.setColumns(10);
		UMVfdFirstName.setBounds(124, 188, 178, 20);
		UserModifyView.add(UMVfdFirstName);
		
		UMVfdLastName = new JTextField();
		UMVfdLastName.setColumns(10);
		UMVfdLastName.setBounds(124, 224, 178, 20);
		UserModifyView.add(UMVfdLastName);
		
		UMVfdPhone = new JTextField();
		UMVfdPhone.setColumns(10);
		UMVfdPhone.setBounds(100, 261, 202, 20);
		UserModifyView.add(UMVfdPhone);
		
		UMVfdAddress = new JTextField();
		UMVfdAddress.setColumns(10);
		UMVfdAddress.setBounds(106, 295, 197, 20);
		UserModifyView.add(UMVfdAddress);
		
		UMVfdPassword = new JTextField();
		UMVfdPassword.setColumns(10);
		UMVfdPassword.setBounds(145, 334, 163, 20);
		UserModifyView.add(UMVfdPassword);
		
		UMVbtnUpdateInformation = new JButton("Update Information");
		UMVbtnUpdateInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		UMVbtnUpdateInformation.setBounds(451, 187, 151, 23);
		UserModifyView.add(UMVbtnUpdateInformation);
		
		UMVbtnRemoveUser = new JButton("Remove User");
		UMVbtnRemoveUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		UMVbtnRemoveUser.setBounds(451, 237, 151, 23);
		UserModifyView.add(UMVbtnRemoveUser);
		
		UMVbtnLogOut = new JButton("Log Out");
		UMVbtnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		UMVbtnLogOut.setBounds(685, 11, 89, 23);
		UserModifyView.add(UMVbtnLogOut);
		
		UMVlblError = new JLabel("");
		UMVlblError.setBounds(150, 500, 500, 14);
		UserModifyView.add(UMVlblError);
		
		label_11 = new JLabel("Hours: 9am-11pm M-F          Phone: (123) 456-7890          Address: 123 S College St, Auburn AL, 36830");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setBounds(0, 530, 784, 20);
		UserModifyView.add(label_11);
		
		//-----------------------------------------------------------------------------------------------------
		//SearchUserView
		
		SearchUserView = new JPanel();
		frame.getContentPane().add(SearchUserView, "name_842081108976202");
		SearchUserView.setLayout(null);
		
		JLabel label_56 = new JLabel("");
		label_56.setIcon(new ImageIcon(img));
		label_56.setBounds(220, 0, 320, 60);
		SearchUserView.add(label_56);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setBounds(0, 525, 784, 2);
		SearchUserView.add(separator_8);
		
		SUVbtnBack = new JButton("<- Back ");
		SUVbtnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		SUVbtnBack.setBounds(10, 11, 89, 23);
		SearchUserView.add(SUVbtnBack);
		
		SUVbtnLogOut = new JButton("Log Out");
		SUVbtnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		SUVbtnLogOut.setBounds(685, 11, 89, 23);
		SearchUserView.add(SUVbtnLogOut);
		
		label_12 = new JLabel("Hours: 9am-11pm M-F          Phone: (123) 456-7890          Address: 123 S College St, Auburn AL, 36830");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setBounds(0, 530, 784, 20);
		SearchUserView.add(label_12);
		
		scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(65, 112, 649, 353);
		SearchUserView.add(scrollPane_3);
		
		SUVlist = new JList();
		scrollPane_3.setViewportView(SUVlist);
		
		lblUsers = new JLabel("Users");
		scrollPane_3.setColumnHeaderView(lblUsers);
		
		//-----------------------------------------------------------------------------------------------------
		//AddUserView
		
		AddUserView = new JPanel();
		frame.getContentPane().add(AddUserView, "name_842083160938118");
		AddUserView.setLayout(null);
		
		JLabel label_58 = new JLabel("");
		label_58.setIcon(new ImageIcon(img));
		label_58.setBounds(220, 0, 320, 60);
		AddUserView.add(label_58);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setBounds(0, 525, 784, 2);
		AddUserView.add(separator_9);
		
		AUVbtnBack = new JButton("<- Back ");
		AUVbtnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		AUVbtnBack.setBounds(10, 11, 89, 23);
		AddUserView.add(AUVbtnBack);
		
		JLabel AUVlblFirstName = new JLabel("First Name : ");
		AUVlblFirstName.setBounds(48, 191, 86, 14);
		AddUserView.add(AUVlblFirstName);
		
		JLabel AUVlblPhone = new JLabel("Phone# : ");
		AUVlblPhone.setBounds(48, 264, 66, 14);
		AddUserView.add(AUVlblPhone);
		
		JLabel AUVlblLastName = new JLabel("Last Name :");
		AUVlblLastName.setBounds(48, 227, 89, 14);
		AddUserView.add(AUVlblLastName);
		
		JLabel AUVlblAddress = new JLabel("Address : ");
		AUVlblAddress.setBounds(48, 298, 66, 14);
		AddUserView.add(AUVlblAddress);
		
		JLabel AUVlblNewPassword = new JLabel("Password : ");
		AUVlblNewPassword.setBounds(48, 336, 114, 14);
		AddUserView.add(AUVlblNewPassword);
		
		AUVfdFirstName = new JTextField();
		AUVfdFirstName.setColumns(10);
		AUVfdFirstName.setBounds(124, 188, 178, 20);
		AddUserView.add(AUVfdFirstName);
		
		AUVfdLastName = new JTextField();
		AUVfdLastName.setColumns(10);
		AUVfdLastName.setBounds(124, 224, 178, 20);
		AddUserView.add(AUVfdLastName);
		
		AUVfdPhone = new JTextField();
		AUVfdPhone.setColumns(10);
		AUVfdPhone.setBounds(100, 261, 202, 20);
		AddUserView.add(AUVfdPhone);
		
		AUVfdAddress = new JTextField();
		AUVfdAddress.setColumns(10);
		AUVfdAddress.setBounds(106, 295, 197, 20);
		AddUserView.add(AUVfdAddress);
		
		AUVfdNewPassword = new JTextField();
		AUVfdNewPassword.setColumns(10);
		AUVfdNewPassword.setBounds(145, 334, 163, 20);
		AddUserView.add(AUVfdNewPassword);
		
		AUVbtnAddUser = new JButton("Add User");
		AUVbtnAddUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		AUVbtnAddUser.setBounds(459, 163, 151, 23);
		AddUserView.add(AUVbtnAddUser);
		
		AUVbtnLogOut = new JButton("Log Out");
		AUVbtnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		AUVbtnLogOut.setBounds(685, 11, 89, 23);
		AddUserView.add(AUVbtnLogOut);
		
		JLabel AUVlblUserType = new JLabel("User Type  :");
		AUVlblUserType.setBounds(48, 152, 73, 14);
		AddUserView.add(AUVlblUserType);
		
		AUVchoice = new Choice();
		AUVchoice.add("Patron");
		AUVchoice.add("Employee");
		AUVchoice.setBounds(134, 152, 94, 20);
		AddUserView.add(AUVchoice);
		
		AUVlblError = new JLabel("");
		AUVlblError.setBounds(150, 500, 500, 14);
		AddUserView.add(AUVlblError);
		
		label_13 = new JLabel("Hours: 9am-11pm M-F          Phone: (123) 456-7890          Address: 123 S College St, Auburn AL, 36830");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setBounds(0, 530, 784, 20);
		AddUserView.add(label_13);
		
		//-----------------------------------------------------------------------------------------------------
		//AddBookView
		
		AddBookView = new JPanel();
		frame.getContentPane().add(AddBookView, "name_842085236683367");
		AddBookView.setLayout(null);
		
		JLabel label_66 = new JLabel("");
		label_66.setIcon(new ImageIcon(img));
		label_66.setBounds(220, 0, 320, 60);
		AddBookView.add(label_66);
		
		JSeparator separator_10 = new JSeparator();
		separator_10.setBounds(0, 525, 784, 2);
		AddBookView.add(separator_10);
		
		ABVbtnBack = new JButton("<- Back ");
		ABVbtnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ABVbtnBack.setBounds(10, 11, 89, 23);
		AddBookView.add(ABVbtnBack);
		
		JLabel ABVlblTitle = new JLabel("Title :");
		ABVlblTitle.setBounds(48, 155, 46, 14);
		AddBookView.add(ABVlblTitle);
		
		JLabel ABVlblAuthor = new JLabel("Author : ");
		ABVlblAuthor.setBounds(48, 195, 63, 14);
		AddBookView.add(ABVlblAuthor);
		
		JLabel ABVlblDescription = new JLabel("Description : ");
		ABVlblDescription.setBounds(48, 236, 75, 14);
		AddBookView.add(ABVlblDescription);
		
		JLabel ABVlblLocation = new JLabel("Location : ");
		ABVlblLocation.setBounds(48, 278, 63, 14);
		AddBookView.add(ABVlblLocation);
		
		ABVfdTitle = new JTextField();
		ABVfdTitle.setColumns(10);
		ABVfdTitle.setBounds(83, 152, 200, 20);
		AddBookView.add(ABVfdTitle);
		
		ABVfdAuthor = new JTextField();
		ABVfdAuthor.setColumns(10);
		ABVfdAuthor.setBounds(99, 192, 187, 20);
		AddBookView.add(ABVfdAuthor);
		
		ABVfdDescription = new JTextField();
		ABVfdDescription.setColumns(10);
		ABVfdDescription.setBounds(128, 233, 157, 20);
		AddBookView.add(ABVfdDescription);
		
		ABVfdLocation = new JTextField();
		ABVfdLocation.setColumns(10);
		ABVfdLocation.setBounds(114, 275, 170, 20);
		AddBookView.add(ABVfdLocation);
		
		ABVbtnLogOut = new JButton("Log Out");
		ABVbtnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ABVbtnLogOut.setBounds(685, 11, 89, 23);
		AddBookView.add(ABVbtnLogOut);
		
		ABVbtnAddBook = new JButton("Add Book");
		ABVbtnAddBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ABVbtnAddBook.setBounds(511, 151, 151, 23);
		AddBookView.add(ABVbtnAddBook);
		
		ABVlblError = new JLabel("");
		ABVlblError.setBounds(150, 500, 500, 14);
		AddBookView.add(ABVlblError);
		
		label_14 = new JLabel("Hours: 9am-11pm M-F          Phone: (123) 456-7890          Address: 123 S College St, Auburn AL, 36830");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setBounds(0, 530, 784, 20);
		AddBookView.add(label_14);
		
		//-----------------------------------------------------------------------------------------------------
		//ReportView
		
		ReportView = new JPanel();
		frame.getContentPane().add(ReportView, "name_842087120682527");
		ReportView.setLayout(null);
		
		JLabel label_72 = new JLabel("");
		label_72.setIcon(new ImageIcon(img));
		label_72.setBounds(220, 0, 320, 60);
		ReportView.add(label_72);
		
		JSeparator separator_11 = new JSeparator();
		separator_11.setBounds(0, 525, 784, 2);
		ReportView.add(separator_11);
		
		RVbtnBack = new JButton("<- Back ");
		RVbtnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		RVbtnBack.setBounds(10, 11, 89, 23);
		ReportView.add(RVbtnBack);
		
		RVbtnLogOut = new JButton("Log Out");
		RVbtnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		RVbtnLogOut.setBounds(685, 11, 89, 23);
		ReportView.add(RVbtnLogOut);
		
		label_15 = new JLabel("Hours: 9am-11pm M-F          Phone: (123) 456-7890          Address: 123 S College St, Auburn AL, 36830");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setBounds(0, 530, 784, 20);
		ReportView.add(label_15);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(60, 100, 665, 400);
		ReportView.add(tabbedPane);
		
		RVpaneAvailable = new JScrollPane();
		tabbedPane.addTab("Available", null, RVpaneAvailable, null);
		
		RVpaneCheckedOut = new JScrollPane();
		tabbedPane.addTab("Checked out (but not late)", null, RVpaneCheckedOut, null);
		
		RVpaneReserved = new JScrollPane();
		tabbedPane.addTab("Reserved", null, RVpaneReserved, null);
		
		RVpaneLate = new JScrollPane();
		tabbedPane.addTab("Late", null, RVpaneLate, null);
		
		RVpaneLost = new JScrollPane();
		tabbedPane.addTab("Lost", null, RVpaneLost, null);
	}
}