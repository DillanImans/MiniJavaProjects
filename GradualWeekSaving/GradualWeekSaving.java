import java.util.Scanner;

public class GradualWeekSaving {
	// Initialize variables
	public static int numOfDaysSaved;
	public static int moneySaved;
	
	public static void main(String[] args) {
		// Initialize object from library		
		Scanner input = new Scanner(System.in);
		
		// User inputs number of days
		System.out.printf("Enter the number of days: ");
		numOfDaysSaved = input.nextInt();
		
		// Call method to calculate money saved after X days		
		calculateMoneySaved();
		
		// Print money saved after X days	
		System.out.printf("Total of Frank's saving (after " + numOfDaysSaved + " days): " + moneySaved);
	}
	
	//	Method: Calculate amount of money saved after X days.
	public static void calculateMoneySaved() {
		int weekN = numOfDaysSaved/7;
		int remainderOfDaysOnWeekN = numOfDaysSaved % 7;
		int per7DaysMoney = 0;
		int remainderDaysOnLatestWeekMoney = 0;
	
		//	If it is the first week, money saved is just the amount of days (1 day $1).
		if(weekN == 0) {
			moneySaved = remainderOfDaysOnWeekN;
			
			// If it is not the first week, the money saved can be calculated with the following:
		} else if(weekN != 0) {
			
			// 1. The 7th day of the week(s) ($7 for first week, $14 for second week, so on)
			for (int i = weekN; i > 0; i--) {
				per7DaysMoney += i*7;
			}
			
			/* 2. The remainder of the last week, which is weekN+1 because, e.g weekN = 1 would 
			technically be the second week, hence the remainders need to be multiplied with weekN+1. */
			remainderDaysOnLatestWeekMoney = (weekN+1)*remainderOfDaysOnWeekN;
			
			// 3. Sum them up and get the amount of money saved after N weeks and Y remainder days.
			moneySaved = per7DaysMoney + remainderDaysOnLatestWeekMoney;
		}
	}
}
