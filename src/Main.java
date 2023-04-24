import java.awt.EventQueue;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;



public class Main {
	// State variable used everywhere in order for buttons to do the correct operation
	// depending on the state
	public static int state;
	
	// Used in transfer functionality. 0 is Firuz. 1 is John. 2 is Eldor.
	public static int accountToTrf;

	public static void main(String[] args) {
		
		// Initiate Array list of Bank Accounts
		ArrayList<BankAccount> bankAccounts = new ArrayList<>();
		
		// Initiate 3 users
		User user1 = new User("Firuz");
		User user2 = new User("John");
		User user3 = new User("Eldor");
		
		// Initiate 3 bank accounts of each user
		bankAccounts.add(new BankAccount("200100237898", 1234, 500000, user1));
		bankAccounts.add(new BankAccount("110000022033", 4321, 700000, user2));
		bankAccounts.add(new BankAccount("111111111111", 2222, 900000, user3));
		
		
		
		// GUI
		JFrame frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBackground(new Color(0, 0, 0));
		frame.setBounds(0, 0, 700, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel wooriIcon = new JLabel("");
		wooriIcon.setIcon(new ImageIcon(Main.class.getResource("/icons/woori.png")));
		wooriIcon.setBounds(10, 11, 217, 53);
		frame.getContentPane().add(wooriIcon);
		
		JPanel upperContainer = new JPanel();
		upperContainer.setBackground(new Color(0, 0, 0));
		upperContainer.setBounds(10, 75, 666, 146);
		frame.getContentPane().add(upperContainer);
		upperContainer.setLayout(null);
		
		//Option btns
		JButton option1Btn = new JButton("Option 1");
		option1Btn.setIcon(new ImageIcon(Main.class.getResource("/icons/arr.png")));
		option1Btn.setFocusPainted(false);
		option1Btn.setFont(new Font("Times New Roman", Font.BOLD, 16));
		option1Btn.setBackground(new Color(64, 128, 128));
		option1Btn.setForeground(new Color(0, 0, 0));
		option1Btn.setBounds(0, 0, 172, 32);
		option1Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		upperContainer.add(option1Btn);
		
		JButton option2Btn = new JButton("Option 2");
		option2Btn.setIcon(new ImageIcon(Main.class.getResource("/icons/arr.png")));
		option2Btn.setForeground(Color.BLACK);
		option2Btn.setFont(new Font("Times New Roman", Font.BOLD, 16));
		option2Btn.setFocusPainted(false);
		option2Btn.setBackground(new Color(64, 128, 128));
		option2Btn.setBounds(0, 32, 172, 32);
		upperContainer.add(option2Btn);
		
		JButton option3Btn = new JButton("Option 3");
		option3Btn.setIcon(new ImageIcon(Main.class.getResource("/icons/arr.png")));
		option3Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		option3Btn.setForeground(Color.BLACK);
		option3Btn.setFont(new Font("Times New Roman", Font.BOLD, 16));
		option3Btn.setFocusPainted(false);
		option3Btn.setBackground(new Color(64, 128, 128));
		option3Btn.setBounds(0, 64, 172, 32);
		upperContainer.add(option3Btn);
		
		JButton option4Btn = new JButton("Option 4");
		option4Btn.setIcon(new ImageIcon(Main.class.getResource("/icons/arr.png")));
		option4Btn.setForeground(Color.BLACK);
		option4Btn.setFont(new Font("Times New Roman", Font.BOLD, 16));
		option4Btn.setFocusPainted(false);
		option4Btn.setBackground(new Color(64, 128, 128));
		option4Btn.setBounds(0, 96, 172, 32);
		upperContainer.add(option4Btn);
		
		JButton optionEngBtn = new JButton("English");
		optionEngBtn.setIcon(new ImageIcon(Main.class.getResource("/icons/eng.png")));
		optionEngBtn.setForeground(Color.BLACK);
		optionEngBtn.setFont(new Font("Times New Roman", Font.BOLD, 16));
		optionEngBtn.setFocusPainted(false);
		optionEngBtn.setBackground(new Color(64, 128, 128));
		optionEngBtn.setBounds(494, 0, 172, 32);
		upperContainer.add(optionEngBtn);
		
		JButton optionKorBtn = new JButton("Korean");
		optionKorBtn.setIcon(new ImageIcon(Main.class.getResource("/icons/kor.png")));
		optionKorBtn.setForeground(Color.BLACK);
		optionKorBtn.setFont(new Font("Times New Roman", Font.BOLD, 16));
		optionKorBtn.setFocusPainted(false);
		optionKorBtn.setBackground(new Color(64, 128, 128));
		optionKorBtn.setBounds(494, 32, 172, 32);
		upperContainer.add(optionKorBtn);
		
		// Text Containers
		JPanel atmTextPanel = new JPanel();
		atmTextPanel.setForeground(new Color(64, 128, 128));
		atmTextPanel.setBackground(new Color(255, 255, 255));
		atmTextPanel.setBounds(174, 0, 318, 127);
		upperContainer.add(atmTextPanel);
		atmTextPanel.setLayout(null);
		
		JLabel atmTextInnerCon = new JLabel("");
		atmTextInnerCon.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		atmTextInnerCon.setBackground(new Color(64, 128, 128));
		atmTextInnerCon.setForeground(new Color(0, 0, 0));
		atmTextInnerCon.setVerticalAlignment(SwingConstants.TOP);
		atmTextInnerCon.setBounds(6, 6, 306, 115);
		atmTextPanel.add(atmTextInnerCon);
		
		// Number buttons
		JButton btn1 = new JButton("1");
		btn1.setBackground(new Color(64, 128, 128));
		btn1.setForeground(new Color(0, 0, 0));
		btn1.setFocusPainted(false);
		btn1.setFont(new Font("Segoe UI", Font.PLAIN, 30));
		btn1.setBounds(187, 233, 104, 66);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBackground(new Color(64, 128, 128));
		btn2.setForeground(new Color(0, 0, 0));
		btn2.setFocusPainted(false);
		btn2.setFont(new Font("Segoe UI", Font.PLAIN, 30));
		btn2.setBounds(291, 233, 104, 66);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setForeground(new Color(0, 0, 0));
		btn3.setBackground(new Color(64, 128, 128));
		btn3.setFocusPainted(false);
		btn3.setFont(new Font("Segoe UI", Font.PLAIN, 30));
		btn3.setBounds(395, 233, 104, 66);
		frame.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setForeground(new Color(0, 0, 0));
		btn4.setBackground(new Color(64, 128, 128));
		btn4.setFocusPainted(false);
		btn4.setFont(new Font("Segoe UI", Font.PLAIN, 30));
		btn4.setBounds(187, 299, 104, 66);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setForeground(new Color(0, 0, 0));
		btn5.setBackground(new Color(64, 128, 128));
		btn5.setFocusPainted(false);
		btn5.setFont(new Font("Segoe UI", Font.PLAIN, 30));
		btn5.setBounds(291, 299, 104, 66);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setForeground(new Color(0, 0, 0));
		btn6.setBackground(new Color(64, 128, 128));
		btn6.setFocusPainted(false);
		btn6.setFont(new Font("Segoe UI", Font.PLAIN, 30));
		btn6.setBounds(395, 299, 104, 66);
		frame.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setForeground(new Color(0, 0, 0));
		btn7.setBackground(new Color(64, 128, 128));
		btn7.setFocusPainted(false);
		btn7.setFont(new Font("Segoe UI", Font.PLAIN, 30));
		btn7.setBounds(187, 365, 104, 66);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setForeground(new Color(0, 0, 0));
		btn8.setBackground(new Color(64, 128, 128));
		btn8.setFocusPainted(false);
		btn8.setFont(new Font("Segoe UI", Font.PLAIN, 30));
		btn8.setBounds(291, 365, 104, 66);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setForeground(new Color(0, 0, 0));
		btn9.setBackground(new Color(64, 128, 128));
		btn9.setFocusPainted(false);
		btn9.setFont(new Font("Segoe UI", Font.PLAIN, 30));
		btn9.setBounds(395, 365, 104, 66);
		frame.getContentPane().add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.setForeground(new Color(0, 0, 0));
		btn0.setBackground(new Color(64, 128, 128));
		btn0.setFocusPainted(false);
		btn0.setFont(new Font("Segoe UI", Font.PLAIN, 30));
		btn0.setBounds(291, 431, 104, 66);
		frame.getContentPane().add(btn0);
		
		// Three buttons on the right (Cancel, Clear, Enter)
		JButton cancelBtn = new JButton("Cancel");
		cancelBtn.setIcon(new ImageIcon(Main.class.getResource("/icons/cancel.png")));
		cancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		cancelBtn.setForeground(Color.BLACK);
		cancelBtn.setFont(new Font("Times New Roman", Font.BOLD, 18));
		cancelBtn.setFocusPainted(false);
		cancelBtn.setBackground(new Color(64, 128, 128));
		cancelBtn.setBounds(504, 233, 172, 66);
		frame.getContentPane().add(cancelBtn);
		
		JButton clearBtn = new JButton("Clear");
		clearBtn.setIcon(new ImageIcon(Main.class.getResource("/icons/clear.png")));
		clearBtn.setForeground(Color.BLACK);
		clearBtn.setFont(new Font("Times New Roman", Font.BOLD, 18));
		clearBtn.setFocusPainted(false);
		clearBtn.setBackground(new Color(64, 128, 128));
		clearBtn.setBounds(504, 299, 172, 66);
		frame.getContentPane().add(clearBtn);
		
		JButton enterBtn = new JButton("Enter");
		enterBtn.setIcon(new ImageIcon(Main.class.getResource("/icons/enter.png")));
		enterBtn.setForeground(Color.BLACK);
		enterBtn.setFont(new Font("Times New Roman", Font.BOLD, 18));
		enterBtn.setFocusPainted(false);
		enterBtn.setBackground(new Color(64, 128, 128));
		enterBtn.setBounds(504, 365, 172, 66);
		frame.getContentPane().add(enterBtn);
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		
		
		// All functionality starts from here. Most functionality depends on button presses.
		
		// Initial state of text container
		atmTextInnerCon.setText("Please insert your card and press ENTER");
		
		
		// Enter button. Most functionality lives here because traversing through the program
		// is dependent mostly on pressing enter
		enterBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Go to enter pin state
		    	if(state == 0) {
					state = 1;
					atmTextInnerCon.setText("Pin: ");
					
					
				// In enter pin state (1), check if pin is valid or not
		    	} else if(state == 1) {
		    		int correctEntry = 0;
	    			String pinEntry = atmTextInnerCon.getText();
	    			int pinOnly = Integer.parseInt(pinEntry.replaceAll("[^0-9]", ""));
		    		for(int i = 0; i < 3; i++) {
		    			BankAccount accountFromDatabase = bankAccounts.get(i);
		    			if(accountFromDatabase.getPinCode() == pinOnly) {
		    				correctEntry = 1;	    	
		    				// Firuz State 2
		    				/*
		    				 * State 21 Balance Checking
		    				 * State 22 Withdrawing Money
		    				 * State 23 Deposit
		    				 * State 24 Transfer
		    				 */
		    				if(i == 0) {
		    					state = 2;
		    					atmTextInnerCon.setText("<html>Welcome Firuz<br/>"
		    							+ "Please choose options:<br/>"
		    							+ "OPTION 1: Balance Checking<br/>"
		    							+ "OPTION 2: Withdrawing money<br/>"
		    							+ "OPTION 3: Deposit<br/>"
		    							+ "OPTION 4: Transfer</html>");
		    				// John State 3
			    			/*
			    			* State 31 Balance Checking
			    			* State 32 Withdrawing Money
			    			* State 33 Deposit
			    			* State 34 Transfer
			    			*/
		    				}else if(i == 1) {
		    					state = 3;
		    					atmTextInnerCon.setText("<html>Welcome John<br/>"
		    							+ "Please choose options:<br/>"
		    							+ "OPTION 1: Balance Checking<br/>"
		    							+ "OPTION 2: Withdrawing money<br/>"
		    							+ "OPTION 3: Deposit<br/>"
		    							+ "OPTION 4: Transfer</html>");			    				
		    				// Eldor State 4
		    				/*
			    			* State 41 Balance Checking
			    			* State 42 Withdrawing Money
			    			* State 43 Deposit
			    			* State 44 Transfer
			    			*/
		    				}else if(i == 2) {
		    					state = 4;
		    					atmTextInnerCon.setText("<html>Welcome Eldor<br/>"
		    							+ "Please choose options:<br/>"
		    							+ "OPTION 1: Balance Checking<br/>"
		    							+ "OPTION 2: Withdrawing money<br/>"
		    							+ "OPTION 3: Deposit<br/>"
		    							+ "OPTION 4: Transfer</html>");
		    				}
		    				break;
		    			}
		    		}
		    		if(correctEntry == 0) {
		    			state = 100;
		    			atmTextInnerCon.setText("Incorrect Pin. Press enter and try again.");
		    		}
		    		
		    		
		    	// Withdrawing Logic in enter button
		    	}else if(state == 22 || state == 32 || state == 42) {
	    			String innerText = atmTextInnerCon.getText();
	    			int inputtedWithdraw = Integer.parseInt(innerText.replaceAll("[^0-9]", ""));
	    			
	    			// Withdrawing from Firuz's account
	    			if(state == 22) {
	    				
		    			// Check if amount that needs to be withdraw is more or less the current balance.
	    				// If less, then withdraw. If more, then cancel. All three states below do the same.
		    			if(inputtedWithdraw > bankAccounts.get(0).getBalance()) {
		    				state = 100;
		    				atmTextInnerCon.setText("<html>Not enough money!<br/>Press ENTER...<html/>");
		    			} else {
		    				state = 100;
		    				bankAccounts.get(0).setBalance(bankAccounts.get(0).getBalance() - inputtedWithdraw);
		    				atmTextInnerCon.setText("<html>Success<br/>"
		    						+ "User: " + bankAccounts.get(0).getBankUser() + "<br/>Withdrawal Amount: " + inputtedWithdraw + "<br/>"
		    						+ "Current Balance: " + bankAccounts.get(0).getBalance() + "<br/>"
		    						+ "Press ENTER...<html/>");
		    			}
		    			
		    		// Withdrawing from John's account
	    			}else if(state == 32) {
	    				
		    			if(inputtedWithdraw > bankAccounts.get(1).getBalance()) {
		    				state = 100;
		    				atmTextInnerCon.setText("<html>Not enough money!<br/>Press ENTER...<html/>");
		    			} else {
		    				state = 100;
		    				bankAccounts.get(1).setBalance(bankAccounts.get(1).getBalance() - inputtedWithdraw);
		    				atmTextInnerCon.setText("<html>Success<br/>"
		    						+ "User: " + bankAccounts.get(1).getBankUser() + "<br/>Withdrawal Amount: " + inputtedWithdraw + "<br/>"
		    						+ "Current Balance: " + bankAccounts.get(1).getBalance() + "<br/>"
		    						+ "Press ENTER...<html/>");
		    			}
		    		// Withdrawing from Eldor's account
	    			}else if(state == 42) {
	    				
		    			if(inputtedWithdraw > bankAccounts.get(2).getBalance()) {
		    				state = 100;
		    				atmTextInnerCon.setText("<html>Not enough money!<br/>Press ENTER...<html/>");
		    			} else {
		    				state = 100;
		    				bankAccounts.get(2).setBalance(bankAccounts.get(2).getBalance() - inputtedWithdraw);
		    				atmTextInnerCon.setText("<html>Success<br/>"
		    						+ "User: " + bankAccounts.get(2).getBankUser() + "<br/>Withdrawal Amount: " + inputtedWithdraw + "<br/>"
		    						+ "Current Balance: " + bankAccounts.get(2).getBalance() + "<br/>"
		    						+ "Press ENTER...<html/>");
		    			}
	    			}

	    			
	    		// Depositing Logic in Enter button
		    	} else if(state == 23 || state == 33 || state == 43) {
	    			String innerText = atmTextInnerCon.getText();
	    			int inputtedDeposit = Integer.parseInt(innerText.replaceAll("[^0-9]", ""));
	    			
	    			// Deposit in Firuz's account
	    			if(state == 23) {
	    				state = 100;
	    				bankAccounts.get(0).setBalance(bankAccounts.get(0).getBalance() + inputtedDeposit);
	    				atmTextInnerCon.setText("<html>Success<br/>"
	    						+ "User: " + bankAccounts.get(2).getBankUser() + "<br/>Deposit Amount: " + inputtedDeposit + "<br/>"
	    						+ "Current Balance: " + bankAccounts.get(0).getBalance() + "<br/>"
	    						+ "Press ENTER...<html/>");
	    				
	    			// Deposit in John's account
	    			}else if(state == 33) {
	    				state = 100;
	    				bankAccounts.get(1).setBalance(bankAccounts.get(1).getBalance() + inputtedDeposit);
	    				atmTextInnerCon.setText("<html>Success<br/>"
	    						+ "User: " + bankAccounts.get(1).getBankUser() + "<br/>Deposit Amount: " + inputtedDeposit + "<br/>"
	    						+ "Current Balance: " + bankAccounts.get(1).getBalance() + "<br/>"
	    						+ "Press ENTER...<html/>");
	    				
	    			// Deposit in Eldor's account
	    			}else if(state == 43) {
	    				state = 100;
	    				bankAccounts.get(2).setBalance(bankAccounts.get(2).getBalance() + inputtedDeposit);
	    				atmTextInnerCon.setText("<html>Success<br/>"
	    						+ "User: " + bankAccounts.get(2).getBankUser() + "<br/>Deposit Amount: " + inputtedDeposit + "<br/>"
	    						+ "Current Balance: " + bankAccounts.get(2).getBalance() + "<br/>"
	    						+ "Press ENTER...<html/>");
	    			}
	    			
	    		// Transfer Logic in enter button
		    	} else if(state == 24 || state == 34 || state == 44) {
		    		
		    		// Take account that you want to transfer to. If it's the same as your own, then cancel.
	    			String innerText = atmTextInnerCon.getText();
	    			String receiverNum = innerText.replaceAll("[^0-9]", "");
	    			
	    			int accountExists = 0;
	    			for(int i = 0; i < 3; i++) {
		    			if(receiverNum.equals(bankAccounts.get(i).getBankNumber())) {
			    			// Transfer from Firuz
			    			if(state == 24) {
			    				state = 82;
			    				// AccountToTrf is stored here
			    				accountToTrf = i;
			    				if(accountToTrf == 0) {
			    					state = 100;
			    					atmTextInnerCon.setText("You can't transfer to yourself. Press enter and try again.");
			    				}else {
			    					atmTextInnerCon.setText("Trf to: " + bankAccounts.get(i).getBankUser() +
			    							" || Trf Amount: ");
			    				}
			    			// Transfer from John
			    			}else if(state == 34) {
			    				state = 83;
			    				accountToTrf = i;
			    				if(accountToTrf == 1) {
			    					state = 100;
			    					atmTextInnerCon.setText("You can't transfer to yourself. Press enter and try again.");
			    				}else {
			    					atmTextInnerCon.setText("Trf to: " + bankAccounts.get(i).getBankUser() +
			    							" || Trf Amount: ");
			    				}
			    			// Transfer from Eldor
			    			}else if(state == 44) {
			    				state = 84;
			    				accountToTrf = i;
			    				if(accountToTrf == 2) {
			    					state = 100;
			    					atmTextInnerCon.setText("You can't transfer to yourself. Press enter and try again.");
			    				}else {
			    					atmTextInnerCon.setText("Trf to: " + bankAccounts.get(i).getBankUser() +
			    							" || Trf Amount: ");	
			    				}
			    			}
			    			accountExists = 1;
			    			break;
		    			
		    			}
	    			}
	    			
	    			// If account doesnt exist, cancel.
	    			if(accountExists == 0) {
		    			state = 100;
		    			atmTextInnerCon.setText("Account Number doesn't exist. Press enter and try again.");
	    			}
	    			
	    		// After entering the account to transfer to (the process above), choose how much
	    		// you want to transfer. accountToTrf variable indicates who to transfer to
	    		// as it is a global variable managed from the previous process.
		    	}else if(state == 82 || state == 83 || state == 84) {
	    			String innerText = atmTextInnerCon.getText();
	    			int inputtedTransfer = Integer.parseInt(innerText.replaceAll("[^0-9]", ""));
	    				// Transfer from Firuz
	    				if(state == 82) {
	    	    			if(inputtedTransfer > bankAccounts.get(0).getBalance()) {
	    	    				state = 100;
	    	    				atmTextInnerCon.setText("Transfer Amount is too much. Please enter and try again.");
	    	    			}else {
	    	    				state = 100;
	    	    				bankAccounts.get(accountToTrf).setBalance(bankAccounts.get(accountToTrf).getBalance() + inputtedTransfer);
	    	    				bankAccounts.get(0).setBalance(bankAccounts.get(0).getBalance() - inputtedTransfer);
	    	    				atmTextInnerCon.setText("<html>Transfer Success<br/>Transfer Amount: " + inputtedTransfer +
	    	    				"<br/>Current Balance: " + bankAccounts.get(0).getBalance() + 
	    	    				"<br/>Press Enter..." + "</html>");
	    	    			}
	    	    	// Transfer from John
	    			}else if(state == 83) {
    	    			if(inputtedTransfer > bankAccounts.get(1).getBalance()) {
    	    				state = 100;
    	    				atmTextInnerCon.setText("Transfer Amount is too much. Please enter and try again.");
    	    			}else {
    	    				state = 100;
    	    				bankAccounts.get(accountToTrf).setBalance(bankAccounts.get(accountToTrf).getBalance() + inputtedTransfer);
    	    				bankAccounts.get(1).setBalance(bankAccounts.get(1).getBalance() - inputtedTransfer);
    	    				atmTextInnerCon.setText("<html>Transfer Success<br/>Transfer Amount: " + inputtedTransfer +
    	    				"<br/>Current Balance: " + bankAccounts.get(1).getBalance() + 
    	    				"<br/>Press Enter..." + "</html>");
    	    			}
    	    		//Transfer from Eldor
    				}else if(state == 84) {
    	    			if(inputtedTransfer > bankAccounts.get(2).getBalance()) {
    	    				state = 100;
    	    				atmTextInnerCon.setText("Transfer Amount is too much. Please enter and try again.");
    	    			} else {
    	    				state = 100;
    	    				bankAccounts.get(accountToTrf).setBalance(bankAccounts.get(accountToTrf).getBalance() + inputtedTransfer);
    	    				bankAccounts.get(2).setBalance(bankAccounts.get(2).getBalance() - inputtedTransfer);
    	    				atmTextInnerCon.setText("<html>Transfer Success<br/>Transfer Amount: " + inputtedTransfer +
    	    				"<br/>Current Balance: " + bankAccounts.get(2).getBalance() + 
    	    				"<br/>Press Enter..." + "</html>");
    	    			}
    				}
	    			
	    		// The state where if something doesn't work/doesn't exist, it goes to the initial state 0
		    	}else if(state == 100) {
		    		state = 0;
		    		atmTextInnerCon.setText("Please insert your card and press ENTER");
		    	}
		    }
		});
		
		
		// Option buttons
		
		// Check Balance button. Depends on which account is logged in, check their balance.
		option1Btn.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	// Firuz
		    	if(state == 2) {
		    		state = 100;
		    		int firBal = bankAccounts.get(0).getBalance();
		    		atmTextInnerCon.setText("<html>User: Firuz <br/>Balance: " + firBal
		    				+ "<br/>Thanks for banking with us<br/>Press ENTER to quit...</html>");
		    	// John
		    	}else if(state == 3) {
		    		state = 100;
		    		int johBal = bankAccounts.get(1).getBalance();
		    		atmTextInnerCon.setText("<html>User: John <br/>Balance: " + johBal
		    				+ "<br/>Thanks for banking with us<br/>Press ENTER to quit..</html>");
		    	// Eldor
		    	}else if(state == 4) {
		    		state = 100;
		    		int eldBal = bankAccounts.get(2).getBalance();
		    		atmTextInnerCon.setText("<html>User: Eldor <br/>Balance: " + eldBal
		    				+ "<br/>Thanks for banking with us<br/>Press ENTER to quit..</html>");
		    	}else {
		    		
		    	}
		    }
		});
		
		// Withdraw Money
		option2Btn.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	// Firuz
		    	if(state == 2) {
		    		state = 22;
		    		atmTextInnerCon.setText("Enter Withdrawal Amount: ");
		    	// John
		    	}else if(state == 3) {
		    		state = 32;
		    		atmTextInnerCon.setText("Enter Withdrawal Amount: ");
		    	// Eldor
		    	}else if(state == 4) {
		    		state = 42;
		    		atmTextInnerCon.setText("Enter Withdrawal Amount: ");
		    		
		    	}else {
		    		
		    	}
		    }
		});
		
		// Deposit
		option3Btn.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	// Firuz
		    	if(state == 2) {
		    		state = 23;
		    		atmTextInnerCon.setText("Enter Deposit Amount: ");
		    		
		    	// John
		    	}else if(state == 3) {
		    		state = 33;
		    		atmTextInnerCon.setText("Enter Deposit Amount: ");

		    	// Eldor
		    	}else if(state == 4) {
		    		state = 43;
		    		atmTextInnerCon.setText("Enter Deposit Amount: ");

		    	}else {
		    		
		    	}
		    }
		});
		
		// Transfer
		option4Btn.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	// Firuz
		    	if(state == 2) {
		    	state = 24;
	    		atmTextInnerCon.setText("Enter Account Number (Receiver): ");

		    	// John
		    	}else if(state == 3) {
		    	state = 34;
	    		atmTextInnerCon.setText("Enter Account Number (Receiver): ");

		    	// Eldor
		    	}else if(state == 4) {
		    	state = 44;
	    		atmTextInnerCon.setText("Enter Account Number (Receiver): ");

		    	}else {
		    		
		    	}
		    }
		});
		
		
		
		// Number buttons
		// The process of number button is to take the inner text and append it with the corresponding number.
		btn0.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	if(state == 1 || state == 22 || state == 32 || state == 42 || 
		    	  state == 23 || state == 33 || state == 43 ||
		    	  state == 24 || state == 34 || state == 44 ||
		    	  state == 82 || state == 83 || state == 84) {
			    	String Num = atmTextInnerCon.getText() + "0";
			    	atmTextInnerCon.setText(Num);
		    	}
		    }
		});
		
		btn1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	if(state == 1 || state == 22 || state == 32 || state == 42 ||
		    	state == 23 || state == 33 || state == 43 ||
		    	  state == 24 || state == 34 || state == 44||
		    	  state == 82 || state == 83 || state == 84) {
			    	String Num = atmTextInnerCon.getText() + "1";
			    	atmTextInnerCon.setText(Num);
		    	}
		    }
		});
		
		btn2.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	if(state == 1 || state == 22 || state == 32 || state == 42 || 
		    	state == 23 || state == 33 || state == 43 ||
		    	  state == 24 || state == 34 || state == 44||
		    	  state == 82 || state == 83 || state == 84) {
			    	String Num = atmTextInnerCon.getText() + "2";
			    	atmTextInnerCon.setText(Num);
		    	}
		    }
		});
		
		btn3.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	if(state == 1 || state == 22 || state == 32 || state == 42 || 
		    		state == 23 || state == 33 || state == 43 ||
			    	  state == 24 || state == 34 || state == 44||
			    	  state == 82 || state == 83 || state == 84) {
			    	String Num = atmTextInnerCon.getText() + "3";
			    	atmTextInnerCon.setText(Num);
		    	}
		    }
		});
		
		btn4.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	if(state == 1 || state == 22 || state == 32 || state == 42 ||
		    		state == 23 || state == 33 || state == 43 ||
			    	  state == 24 || state == 34 || state == 44||
			    	  state == 82 || state ==  83 || state == 84) {
			    	String Num = atmTextInnerCon.getText() + "4";
			    	atmTextInnerCon.setText(Num);
		    	}
		    }
		});
		
		btn5.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	if(state == 1 || state == 22 || state == 32 || state == 42 ||
		    		state == 23 || state == 33 || state == 43 ||
			    	  state == 24 || state == 34 || state == 44||
			    	  state == 82 || state ==  83 || state == 84) {
			    	String Num = atmTextInnerCon.getText() + "5";
			    	atmTextInnerCon.setText(Num);
		    	}
		    }
		});
		
		btn6.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	if(state == 1 || state == 22 || state == 32 || state == 42 ||
		    		state == 23 || state == 33 || state == 43 ||
			    	  state == 24 || state == 34 || state == 44||
			    	  state == 82 || state ==  83 || state == 84) {
			    	String Num = atmTextInnerCon.getText() + "6";
			    	atmTextInnerCon.setText(Num);
		    	}
		    }
		});
		
		btn7.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	if(state == 1 || state == 22 || state == 32 || state == 42 ||
		    		state == 23 || state == 33 || state == 43 ||
			    	  state == 24 || state == 34 || state == 44||
			    	  state == 82 || state ==  83 || state == 84) {
			    	String Num = atmTextInnerCon.getText() + "7";
			    	atmTextInnerCon.setText(Num);
		    	}
		    }
		});
		
		btn8.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	if(state == 1 || state == 22 || state == 32 || state == 42 ||
		    		state == 23 || state == 33 || state == 43 ||
			    	  state == 24 || state == 34 || state == 44||
			    	  state == 82 || state ==  83 || state == 84) {
			    	String Num = atmTextInnerCon.getText() + "8";
			    	atmTextInnerCon.setText(Num);
		    	}
		    }
		});
		
		btn9.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	if(state == 1 || state == 22 || state == 32 || state == 42 ||
		    		state == 23 || state == 33 || state == 43 ||
			    	  state == 24 || state == 34 || state == 44||
			    	  state == 82 || state ==  83 || state == 84) {
			    	String Num = atmTextInnerCon.getText() + "9";
			    	atmTextInnerCon.setText(Num);
		    	}
		    }
		});
		
		// Cancel Btn
		cancelBtn.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	state = 0;
		    	atmTextInnerCon.setText("Please insert your card and press ENTER");
		    }
		});
		
		// Clear Btn
		clearBtn.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	if(state != 100) {
	    			String allText = atmTextInnerCon.getText();
	    			String alphaSymOnly = allText.replaceAll("\\d","");
			    	atmTextInnerCon.setText(alphaSymOnly);
		    	}
		    }
		});
  }
}











