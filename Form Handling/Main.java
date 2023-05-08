// Imports mostly for GUI

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollBar;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class Main extends JFrame {
	
	private JPanel contentPane;
	private JLabel skkuLeftImage;
	private JPanel outerFormPanel;
	private JPanel innerUpFormPanel;
	private JPanel innerDownFormPanel;
	private JButton submitBtn;
	private JPanel prevGpaPanel;
	private JLabel prevGpaLabel;
	private JTextField prevGpaTF;
	private JPanel applicantNamePanel;
	private JLabel applicantNameLabel;
	private JTextField applicantNameTF;
	private JPanel birthDatePanel;
	private JLabel birthDateLabel;
	private JTextField birthDateTF;
	private JPanel emailPanel;
	private JLabel emailLabel;
	private JTextField emailTF;
	private JPanel phoneNumPanel;
	private JLabel phoneNumLabel;
	private JTextField phoneNumTF;
	private JPanel achievementPanel;
	private JLabel achievementLabel;
	private JTextField achievementTF;
	private JPanel workExpPanel;
	private JLabel workExpLabel;
	private JTextField workExpTF;
	private JPanel degreePanel;
	private JLabel degreeLabel;
	private JPanel gradePanel;
	private JLabel gradeLabel;
	private JPanel prevUniPanel;
	private JLabel prevUniLabel;
	private JTextField prevUniTF;
	private JComboBox gradeComboBox;
	private JComboBox degreeComboBox;
	private JLabel iconLabel;
	private JLabel title1Label;
	private JLabel title2Label;
	private JLabel personalStatementLabel;
	private JScrollPane scrollPaneForTA;
	private JTextArea personalStatementTF;
	
	// Global variable to store all error messages,
	// And to check certain states (ex. If format incorrect,
	// No need to check for other types of errors)
	StringBuilder errors = new StringBuilder(100);
	int birthDateFormatState = 0;
	int emptyFieldState = 0;
	int prevGpaExistState = 0;
	int degreeChoice = 0;
	int bachelorUniExistState = 0;
	int bachelorGpaExistState = 0;
	int prevGpaIsNum = 0;

	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		
		// Set Look and Feel to make it pretty
		try {
		    UIManager.setLookAndFeel( 
		    UIManager.getSystemLookAndFeelClassName() );
		} catch( Exception ex ) {
		    System.err.println( "Failed to initialize LaF" );
		}
		
		
		// Run Frame
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/*
	 * GUI CODE STARTS HERE
	 */

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		skkuLeftImage = new JLabel("");
		skkuLeftImage.setIcon(new ImageIcon(Main.class.getResource("/images/skku_wallpaper.png")));
		skkuLeftImage.setBounds(10, 103, 224, 549);
		contentPane.add(skkuLeftImage);
		
		outerFormPanel = new JPanel();
		outerFormPanel.setBounds(244, 11, 532, 641);
		contentPane.add(outerFormPanel);
		outerFormPanel.setLayout(null);
		
		innerUpFormPanel = new JPanel();
		innerUpFormPanel.setBounds(10, 11, 512, 366);
		outerFormPanel.add(innerUpFormPanel);
		innerUpFormPanel.setLayout(new GridLayout(10, 2, 0, 0));
		
		applicantNamePanel = new JPanel();
		applicantNamePanel.setLayout(null);
		innerUpFormPanel.add(applicantNamePanel);
		
		applicantNameLabel = new JLabel("Applicant Name");
		applicantNameLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		applicantNameLabel.setBounds(0, 0, 152, 28);
		applicantNamePanel.add(applicantNameLabel);
		
		applicantNameTF = new JTextField();
		applicantNameTF.setColumns(10);
		applicantNameTF.setBounds(162, 4, 340, 24);
		applicantNamePanel.add(applicantNameTF);
		
		birthDatePanel = new JPanel();
		birthDatePanel.setLayout(null);
		innerUpFormPanel.add(birthDatePanel);
		
		birthDateLabel = new JLabel("Birth Date (MMDDYYYY)");
		birthDateLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		birthDateLabel.setBounds(0, 0, 152, 28);
		birthDatePanel.add(birthDateLabel);
		
		birthDateTF = new JTextField();
		birthDateTF.setColumns(10);
		birthDateTF.setBounds(162, 4, 340, 24);
		birthDatePanel.add(birthDateTF);
		
		emailPanel = new JPanel();
		emailPanel.setLayout(null);
		innerUpFormPanel.add(emailPanel);
		
		emailLabel = new JLabel("Email");
		emailLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		emailLabel.setBounds(0, 0, 152, 28);
		emailPanel.add(emailLabel);
		
		emailTF = new JTextField();
		emailTF.setColumns(10);
		emailTF.setBounds(162, 4, 340, 24);
		emailPanel.add(emailTF);
		
		phoneNumPanel = new JPanel();
		phoneNumPanel.setLayout(null);
		innerUpFormPanel.add(phoneNumPanel);
		
		phoneNumLabel = new JLabel("Phone Number (num only)");
		phoneNumLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		phoneNumLabel.setBounds(0, 0, 152, 28);
		phoneNumPanel.add(phoneNumLabel);
		
		phoneNumTF = new JTextField();
		phoneNumTF.setColumns(10);
		phoneNumTF.setBounds(162, 4, 340, 24);
		phoneNumPanel.add(phoneNumTF);
		
		achievementPanel = new JPanel();
		achievementPanel.setLayout(null);
		innerUpFormPanel.add(achievementPanel);
		
		achievementLabel = new JLabel("Achievements (if any)");
		achievementLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		achievementLabel.setBounds(0, 0, 152, 28);
		achievementPanel.add(achievementLabel);
		
		achievementTF = new JTextField();
		achievementTF.setColumns(10);
		achievementTF.setBounds(162, 4, 340, 24);
		achievementPanel.add(achievementTF);
		
		workExpPanel = new JPanel();
		workExpPanel.setLayout(null);
		innerUpFormPanel.add(workExpPanel);
		
		workExpLabel = new JLabel("Work Experience (if any)");
		workExpLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		workExpLabel.setBounds(0, 0, 152, 28);
		workExpPanel.add(workExpLabel);
		
		workExpTF = new JTextField();
		workExpTF.setColumns(10);
		workExpTF.setBounds(162, 4, 340, 24);
		workExpPanel.add(workExpTF);
		
		degreePanel = new JPanel();
		degreePanel.setLayout(null);
		innerUpFormPanel.add(degreePanel);
		
		degreeLabel = new JLabel("Degree");
		degreeLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		degreeLabel.setBounds(0, 0, 152, 28);
		degreePanel.add(degreeLabel);
		
		degreeComboBox = new JComboBox();
		degreeComboBox.setModel(new DefaultComboBoxModel(new String[] {" Accounting and Finance", " Aeronautical and Manufacturing Engineering", " Agriculture and Forestry", " Anatomy and Physiology", " Anthropology", " Archaeology", " Architecture", " Art and Design", " Biological Sciences", " Building", " Business and Management Studies", " Chemical Engineering", " Chemistry", " Civil Engineering", " Classics and Ancient History", " Communication and Media Studies", " Complementary Medicine", " Computer Science", " Counselling", " Creative Writing", " Criminology", " Dentistry", " Drama Dance and Cinematics", " Economics", " Education", " Electrical and Electronic Engineering", " English", " Fashion", " Film Making", " Food Science", " Forensic Science", " General Engineering", " Geography and Environmental Sciences", " Geology", " Health And Social Care", " History", " History of Art Architecture and Design", " Hospitality Leisure Recreation and Tourism", " Information Technology", " Land and Property Management", " Law", " Linguistics", " Marketing", " Materials Technology", " Mathematics", " Mechanical Engineering", " Medical Technology", " Medicine", " Music", " Nursing", " Occupational Therapy", " Pharmacology and Pharmacy", " Philosophy", " Physics and Astronomy", " Physiotherapy", " Politics", " Psychology", " Robotics", " Social Policy", " Social Work", " Sociology", " Sports Science", " Veterinary Medicine", " Youth Work"}));
		degreeComboBox.setBounds(162, 4, 340, 24);
		degreePanel.add(degreeComboBox);
		
		gradePanel = new JPanel();
		gradePanel.setLayout(null);
		innerUpFormPanel.add(gradePanel);
		
		gradeLabel = new JLabel("Grade");
		gradeLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		gradeLabel.setBounds(0, 0, 152, 28);
		gradePanel.add(gradeLabel);
		
		gradeComboBox = new JComboBox();
		gradeComboBox.setModel(new DefaultComboBoxModel(new String[] {" Bachelor (B)", " Masters/Graduate (M)", " Doctorate (PhD)"}));
		gradeComboBox.setBounds(162, 4, 340, 24);
		gradePanel.add(gradeComboBox);
		
		prevUniPanel = new JPanel();
		prevUniPanel.setLayout(null);
		innerUpFormPanel.add(prevUniPanel);
		
		prevUniLabel = new JLabel("Prev. University (for M/PhD)");
		prevUniLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		prevUniLabel.setBounds(0, 0, 152, 28);
		prevUniPanel.add(prevUniLabel);
		
		prevUniTF = new JTextField();
		prevUniTF.setColumns(10);
		prevUniTF.setBounds(162, 4, 340, 24);
		prevUniPanel.add(prevUniTF);
		
		prevGpaPanel = new JPanel();
		innerUpFormPanel.add(prevGpaPanel);
		prevGpaPanel.setLayout(null);
		
		prevGpaLabel = new JLabel("Prev. GPA (for M/PhD)");
		prevGpaLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		prevGpaLabel.setBounds(0, 0, 152, 28);
		prevGpaPanel.add(prevGpaLabel);
		
		prevGpaTF = new JTextField();
		prevGpaTF.setBounds(162, 4, 340, 24);
		prevGpaPanel.add(prevGpaTF);
		prevGpaTF.setColumns(10);
		
		innerDownFormPanel = new JPanel();
		innerDownFormPanel.setBounds(10, 388, 512, 194);
		outerFormPanel.add(innerDownFormPanel);
		innerDownFormPanel.setLayout(null);
		
		personalStatementLabel = new JLabel("Personal Statement (atleast 100 words)");
		personalStatementLabel.setBounds(129, 5, 244, 29);
		innerDownFormPanel.add(personalStatementLabel);
		personalStatementLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		scrollPaneForTA = new JScrollPane();
		scrollPaneForTA.setBounds(0, 38, 512, 156);
		innerDownFormPanel.add(scrollPaneForTA);
		
		personalStatementTF = new JTextArea();
		personalStatementTF.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		personalStatementTF.setLineWrap(true);
		personalStatementTF.setWrapStyleWord(true);
		scrollPaneForTA.setViewportView(personalStatementTF);
		
		submitBtn = new JButton("Submit Application");
		submitBtn.setBounds(174, 593, 184, 37);
		outerFormPanel.add(submitBtn);
		
		iconLabel = new JLabel("");
		iconLabel.setIcon(new ImageIcon(Main.class.getResource("/images/title_label.png")));
		iconLabel.setBounds(10, 18, 75, 74);
		contentPane.add(iconLabel);
		
		title1Label = new JLabel("Application");
		title1Label.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		title1Label.setBounds(95, 36, 139, 29);
		contentPane.add(title1Label);
		
		title2Label = new JLabel("Form");
		title2Label.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		title2Label.setBounds(95, 62, 139, 29);
		contentPane.add(title2Label);
		
		
		/*
		 * GUI CODE ENDS HERE
		 */
		
		///
		
		/*
		 * FUNCTIONALITY CODE STARTS HERE
		 */
		
		submitBtn.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	// Default all font colours to black if it is turned red
		    	// Also default all states
		    	birthDateFormatState = 0;
		    	emptyFieldState = 0;
		    	errors.setLength(0);
		    	prevGpaExistState = 0;
		    	bachelorUniExistState = 0;
		    	bachelorGpaExistState = 0;
		    	prevGpaIsNum = 0;
		    	
		    	
		    	// Empty Forms

	    		// Check all fields if they are empty or not (except for graduate fields)
		    	try {
		    		if(applicantNameTF.getText().equals("") ||
		    			birthDateTF.getText().equals("") ||
		    			emailTF.getText().equals("") ||
		    			phoneNumTF.getText().equals("") ||
		    			personalStatementTF.getText().equals("")) {
		    			throw new emptyFieldException();
		    		}
		    	}
		    	catch(emptyFieldException emptyFieldException) {
		    		errors.append("There are empty field(s) needed to be filled.");
		    		errors.append("\n");
		    		emptyFieldState = 1;
		    	}
		    	
		    	
		    	// Try catch for Applicant Name (empty, nothing to check)
		    	// Some people only have one name (such as my mom, legally), so I'll keep it empty

		    	
		    	// Try catch for Birth Date Format (force the MMDDYYYY format)
		    	if(emptyFieldState != 1) {
		    		try {
		    			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMdduuuu");
		    			formatter.parse(birthDateTF.getText());
		    		}
		    		catch(Exception birthDateException) {
		    			birthDateFormatState = 1;
		    			errors.append("The Birth Date format is wrong.");
		    			errors.append("\n");
		    		}   		
		    	}
		    	

		    	// Try catch for Birth Date Future (Your birth date cannot be today or more than today).
		    	if(birthDateFormatState != 1 && emptyFieldState != 1) {
			    	try {
			    		// We get today and the birth date entered,
			    		// Then we format it into one format, turn it into a String
			    		// and parse it back into a Date for it to be compared.
			    		// It's all just Java Date Validation
			    		String pattern = "MMddyyyy";
			    		SimpleDateFormat dateForm = new SimpleDateFormat(pattern);
			    		String todayString = dateForm.format(new Date());
			    		String birthDayOfUserString = birthDateTF.getText();
			    		Date todayDate = dateForm.parse(todayString);
			    		Date birthDayOfUserDate = dateForm.parse(birthDayOfUserString);
			    		
			    		if(birthDayOfUserDate.after(todayDate) || birthDayOfUserDate.equals(todayDate)) {
			    			throw new birthDateFutureException();
			    		}
			    	}
			    	catch(birthDateFutureException birthDateFutureException) {
			    		errors.append("You cannot be born today or in the future for university.");
			    		errors.append("\n");
			    	}
			    	catch (ParseException e1) {
			    		// This shouldn't get caught, but eclipse was whining
			    		// so I had to add it
			    		errors.append("The Birth Date format is wrong.");
			    		errors.append("\n");
					}
		    	}

		    	
		    	// Try catch for Email
		    	if(emptyFieldState != 1) {
			    	try {
			    		/*
			    		 * We use Regex to see if the email is in a valid
			    		 * email format or not. Pattern & Matcher are
			    		 * Java stuff for Regex.
			    		 */
			    		
			    		String emailFormatRegex = "^(.+)@(.+)$";
			    		Pattern emailPattern = Pattern.compile(emailFormatRegex);
			    		Matcher emailMatcher = emailPattern.matcher(emailTF.getText());
			    		
			    		if(!emailMatcher.matches()) {
			    			throw new emailFormatException();
			    		}
			    	}
			    	catch(emailFormatException emailFormatException) {
			    		errors.append("The Email Format is wrong.");
			    		errors.append("\n");
			    	}
		    	}
		    	
		    	// Try catch for Phone Number (check if number or not)
		    	if(emptyFieldState != 1) {
		    		try {
		    			Double.parseDouble(phoneNumTF.getText());
		    		}
		    		catch(NumberFormatException nfe) {
		    			errors.append("Please only input numbers in your phone number.");
		    			errors.append("\n");
		    		}	
		    	}
		    	
		    	// First, check if you're going to do masters / phd or not.
		    	String choice = gradeComboBox.getSelectedItem().toString();
		    	if(choice == " Masters/Graduate (M)" || choice == " Doctorate (PhD)"){
		    		// If 1, then we initiate the try catch for prevGpa and prevUni below
					degreeChoice = 1;
				} else {
					degreeChoice = 0;
				}
		    	
		    	// Check if there is anything in the prevGpa & prevUni input or not
		    	if(prevGpaTF.getText().equals("")) {
		    		bachelorGpaExistState = 0;
		    	}else {
		    		bachelorGpaExistState = 1;
		    	}
		    	
		    	if(prevUniTF.getText().equals("")) {
		    		bachelorUniExistState = 0;
		    	} else {
		    		bachelorUniExistState = 1;
		    	}
		    	
		    	// Try catch for PrevUniv cannot exist (bachelor)
		    	if(emptyFieldState != 1 && degreeChoice == 0) {
		    		try {
		    			if (bachelorUniExistState == 1) {
		    				throw new prevUnivCannotExistException();
		    			}
		    		}
		    		catch (prevUnivCannotExistException prevUnivCannotExistException){
		    			errors.append("As a Bachelor, you cannot add a previous University.");
		    			errors.append("\n");
		    		}
		    	}
		    	
		    	// Try catch for PrevGpa cannot exist (bachelor)
		    	if(emptyFieldState != 1 && degreeChoice == 0) {
		    		try {
		    			if (bachelorGpaExistState == 1) {
		    				throw new prevGpaCannotExistException();
		    			}
		    		}
		    		catch (prevGpaCannotExistException prevGpaCannotExistException){
		    			errors.append("As a Bachelor, you cannot add a previous GPA.");
		    			errors.append("\n");
		    		}
		    	}
		    	
		    	// Try catch for Prev University (masters & phd only)
		    	// If masters or phd, then you need to add a university
		    	if(emptyFieldState != 1 && degreeChoice == 1) {
		    		try {
		    			if(prevUniTF.getText().equals("")){
		    				throw new prevUniException();
		    			}
		    		}
		    		catch(prevUniException prevUniException) {
		    			errors.append("Please add your previous university.");
		    			errors.append("\n");
		    		}
		    	}
		    	
		    	// Try catch for GPA exists or not (masters & phd only)
		    	if(emptyFieldState != 1 && degreeChoice == 1) {
		    		try {
		    			if(prevGpaTF.getText().equals("")) {
		    				throw new prevGpaExistException();
		    			}
		    			prevGpaExistState = 1;
		    		}
		    		catch(prevGpaExistException prevGpaExistException) {
		    			errors.append("Please add your previous Gpa score.");
		    			errors.append("\n");
		    		}
		    	}
		    	
		    	// Try catch for prevGpa (check if number or not)
		    	if(emptyFieldState != 1 && prevGpaExistState == 1 && degreeChoice == 1) {
		    		try {
		    			Double.parseDouble(prevGpaTF.getText());
		    			prevGpaIsNum = 1;
		    		}
		    		catch(NumberFormatException nfe) {
		    			errors.append("Please only input numbers in your GPA.");
		    			errors.append("\n");
		    		}	
		    	}
		    	
		    	// Try catch for GPA 0 - 4.5 or not (masters & phd only)
		    	if(emptyFieldState != 1 && prevGpaExistState == 1 && degreeChoice == 1 && prevGpaIsNum == 1) {
		    		try {
		    			String prevGpaStr = prevGpaTF.getText();
		    			double prevGpa = Double.parseDouble(prevGpaStr);
		    			
		    			if(prevGpa >= 0 && prevGpa >= 4.5) {
		    				throw new prevGpaRangeException();
		    			}
		    			
		    		}
		    		catch(prevGpaRangeException prevGpaRangeException) {
		    			errors.append("Your Gpa can only be in the range of 0 - 4.5.");
		    			errors.append("\n");
		    		}
		    	}
		    	
		    	// Try catch for Personal Statement
		    	if(emptyFieldState != 1) {
		    		try {
		    			String personalStatementText = personalStatementTF.getText();  
		    			String words[] = personalStatementText.split("\\s");  
		    			int lengthOfWords = words.length;
		    			
		    			if(lengthOfWords < 100) {
		    				throw new personalStatementException();
		    			}
		    		}
		    		catch(personalStatementException personalStatementException) {
		    			errors.append("Your personal statement needs to be more than 100 words.");
		    			errors.append("\n");
		    		}
		    	}
		    	
		    	// After all cases have been checked, show a message dialog saying all the error messages
		    	// If none, then show that the form has been successfully completed
		    	
				/* We will use the JOptionPane to show the errors, and we will use the variable "errors" 
				 * and append it with strings to add the errors
				 */
		    	
		    	if(errors.length() == 0) {
		    		JOptionPane.showMessageDialog(null, "You have successfully submitted the form!",
		    				"INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
		    	}else {
					JOptionPane.showMessageDialog(null, errors.toString()
							, "Error Message", JOptionPane.ERROR_MESSAGE);
		    	}
		}});
		
		
		
		
		
	}
}

class prevGpaCannotExistException extends Exception {
	prevGpaCannotExistException(){
		
	}
}

class prevUnivCannotExistException extends Exception {
	prevUnivCannotExistException(){
		
	}
}

class emptyFieldException extends Exception {
	emptyFieldException(){
		
	}
}

class nameException extends Exception {
	nameException() {
		
	}
}


class birthDateFutureException extends Exception {
	birthDateFutureException(){
		
	}
}

class emailFormatException extends Exception {
	emailFormatException(){
		
	}
}

class prevUniException extends Exception {
	prevUniException(){
		
	}
}

class prevGpaExistException extends Exception {
	prevGpaExistException(){
		
	}
}

class prevGpaRangeException extends Exception {
	prevGpaRangeException(){
		
	}
}

class personalStatementException extends Exception {
	personalStatementException(){
		
	}
}




