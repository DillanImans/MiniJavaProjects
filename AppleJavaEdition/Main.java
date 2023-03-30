import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		// Initiate Scanner
		Scanner scanner = new Scanner(System.in);
		
		// Boolean used for the while loop below
		boolean isPurchasing = true;
		
		// If true, repeat the whole purchasing process. If false, quit.
		while(isPurchasing) {
			
			// Initiate base objects with their respective base prices
			Macbook Macbook = new Macbook(1000);
			Iphone Iphone = new Iphone(800);
			Airpods Airpods = new Airpods(120);
			
			System.out.println("==== Welcome to Apple Korea(Java Edition) ====");
			System.out.println("What do you want to buy?");
			System.out.println("Choose 1 for MacBook");
			System.out.println("Choose 2 for iPhone");
			System.out.println("Choose 3 for AirPods");
			System.out.println("Choose 0 for Exit");
			System.out.print("Please enter your choice: ");
			int initialChoice = scanner.nextInt();
			
			// To erase the weird "print-two-lines" bug
			scanner.nextLine();
			
			// If user enters 1, start pitching them the MacBook
			if(initialChoice == 1) {
				// Get user's MacBook preferences (model, size, color, memory, quantity)
				System.out.print("Model( Air | Pro ): ");
				String modelChoice = scanner.nextLine();
				System.out.print("Size ( 13inch | 14inch | 16inch ): ");
				String sizeChoice = scanner.nextLine();
				System.out.print("Color ( Base | Gold | Silver ): ");
				String colorChoice = scanner.nextLine();
				System.out.print("Memory ( 128 | 256 | 512 ): ");
				String memoryChoice = scanner.nextLine();
				System.out.print("How many do you want to buy: ");
				int quantity = scanner.nextInt();
				
				// To erase the weird "print-two-lines" 'bug'
				scanner.nextLine();
				
				// Set all user's selection into the MacBook object
				Macbook.getUserSelection(modelChoice, sizeChoice, colorChoice, memoryChoice, quantity);
				
				// Calculate costs based on user's selection
				Macbook.calculateCost();
				
				// Print all preferences with their additional costs
				System.out.println("==== check ====");
				Macbook.printAllAdditionalCosts();
				
				System.out.println("");
				
				// Print total costs for one and for all (if more than one)
				if(Macbook.getQuantity() > 1) {
					System.out.printf("Total cost for one Macbook: $%d\n",
					Macbook.getTotalCost());
					System.out.printf("Total cost (quantity x %d): $%d\n", 
					Macbook.getQuantity(), Macbook.getPriceForAll());
				} else if(Macbook.getQuantity() == 1) {
					System.out.printf("Total cost for one Macbook: $%d\n",
					Macbook.getTotalCost());
				}
				
				// Check if user wants to purchase more or not
				System.out.print("Do you want to purchase "
						+ "something else (Yes: 1, No: 0): ");
				int userSelectionForPurchaseMore = scanner.nextInt();

				if(userSelectionForPurchaseMore == 0) {
					System.out.println("Thanks for purchasing!");
					System.exit(0);
				} else if(userSelectionForPurchaseMore == 1) {
					System.out.println("");
				}

				
				
				
			// If user enters 2, start pitching them the iPhone
			}else if(initialChoice == 2) {
				// Get user's iPhone preferences (model, color, memory, quantity)
				System.out.print("Model ( iPhone12 | iPhone13 ): ");
				String modelChoice = scanner.nextLine();
				System.out.print("Color ( Base | Gold | Silver ): ");
				String colorSize = scanner.nextLine();
				System.out.print("Memory ( 64 | 128 | 256 | 512 ): ");
				String memoryChoice = scanner.nextLine();
				System.out.print("How many do you want to buy: ");
				int quantity = scanner.nextInt();
				
				// Set all user's selection into the iPhone object
				Iphone.getUserSelection(modelChoice, colorSize, memoryChoice, quantity);
				
				// Calculate costs based on user's selection
				Iphone.calculateCost();
				
				// Print all preferences with their additional costs
				System.out.println("==== check ====");
				Iphone.printAllAdditionalCosts();
				
				System.out.println("");
				
				// Print total costs for one and for all (if more than one)
				if(Iphone.getQuantity() > 1) {
					System.out.printf("Total cost for one iPhone: $%d\n",
					Iphone.getTotalCost());
					System.out.printf("Total cost (quantity x %d): $%d\n", 
					Iphone.getQuantity(), Iphone.getPriceForAll());
				} else if(Iphone.getQuantity() == 1) {
					System.out.printf("Total cost for one Iphone: $%d\n",
					Iphone.getTotalCost());
				}
				
				// Check if user wants to purchase more or not
				System.out.print("Do you want to purchase "
						+ "something else (Yes: 1, No: 0): ");
				int userSelectionForPurchaseMore = scanner.nextInt();

				if(userSelectionForPurchaseMore == 0) {
					System.out.println("Thanks for purchasing!");
					System.exit(0);
				} else if(userSelectionForPurchaseMore == 1) {
					System.out.println("");
				}

				
				
			// If user enters 3, start pitching them the AirPods
			}else if(initialChoice == 3) {
				// Get user's iPhone preferences (model, quantity)
				System.out.print("Model ( AirPods3 | AirPodsPro | AirPodsMax ): ");
				String modelChoice = scanner.nextLine();
				System.out.print("How many do you want to buy: ");
				int quantity = scanner.nextInt();
				
				// Set all user's selection into the AirPods object
				Airpods.getUserSelection(modelChoice, quantity);
				
				// Calculate costs based on user's selection
				Airpods.calculateCost();
				
				// Print all preferences with their additional costs
				System.out.println("==== check ====");
				Airpods.printAllAdditionalCosts();
				
				System.out.println("");
				
				// Print total costs for one and for all (if more than one)
				if(Airpods.getQuantity() > 1) {
					System.out.printf("Total cost for one Airpods: $%d\n",
					Airpods.getTotalCost());
					System.out.printf("Total cost (quantity x %d): $%d\n", 
					Airpods.getQuantity(), Airpods.getPriceForAll());
				} else if(Airpods.getQuantity() == 1) {
					System.out.printf("Total cost for one Airpods: $%d\n",
					Airpods.getTotalCost());
				}
				
				// Check if user wants to purchase more or not
				System.out.print("Do you want to purchase "
						+ "something else (Yes: 1, No: 0): ");
				int userSelectionForPurchaseMore = scanner.nextInt();

				if(userSelectionForPurchaseMore == 0) {
					System.out.println("Thanks for purchasing!");
					System.exit(0);
				} else if(userSelectionForPurchaseMore == 1) {
					System.out.println("");
					
				}
				
				
			// Exit program.
			}else if(initialChoice == 0) {
			System.out.println("Thanks for coming! See you Again!");
				isPurchasing = false;
				
			// If not in the range of valid inputs, throw error.
			}else {
				throw new IllegalArgumentException (
					"Invalid Input. Please try again."
					);
				  }
			}
		}
	}

