import java.util.Scanner;

public class CompoundInterestCalculator {

  // Initial user input variables
  public static String userName;
  public static int userInitialBalance;
  public static double userInterestPercentage;
  public static int numOfYears;

  // Variable for endBalanceAfterCalculation
  public static double endUserBalance;

  public static void main(String[] args) {
	// Initialize objects from library
    Scanner input = new Scanner(System.in);

    // User fills in details
    System.out.println("Please enter the following information:");

    System.out.print("Your name: ");
    userName = input.nextLine();

    System.out.print("Initial Balance: ");
    userInitialBalance = input.nextInt();

    System.out.print("Percentage: ");
    userInterestPercentage = input.nextDouble();

    System.out.print("Number of years: ");
    numOfYears = input.nextInt();

    // Initialize user's end balance   
    endUserBalance = userInitialBalance;

    // Calculate final amount of money after X years.
    for (int i = 0; i < numOfYears; i++) {
      calcBalanceAfterOneYear();
    }

    // Print end result
    System.out.println("====================");
    System.out.println("User name: " + userName);
    System.out.println("Initial Balance: " + userInitialBalance);
    System.out.println("Percentage: " + userInterestPercentage);
    System.out.println("Your balance (after " + numOfYears + " years): " + endUserBalance);
  }

  // Method: Calculate balance after one year of interest.
  public static void calcBalanceAfterOneYear() {
    endUserBalance += endUserBalance * (userInterestPercentage/100);
  }
}
