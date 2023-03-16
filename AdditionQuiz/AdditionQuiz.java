import java.util.Random;
import java.util.Scanner;

public class AdditionQuiz {
	// Initialize score	
	public static int score;

	public static void main(String[] args) {
		// Initialize objects from libraries
		Random randomGenerator = new Random();
		Scanner input = new Scanner(System.in);
		
		//	The Quiz (5 questions)
		for(int i = 1; i <= 5; i++) {
			
			// Generate two random numbers from 0-50;			
			int randomIntOne = randomGenerator.nextInt(50);
			int randomIntTwo = randomGenerator.nextInt(50);
			
			// Get correct solution
			int solution = randomIntOne + randomIntTwo;
			
			// User inputs answer of question (intOne + intTwo)
			System.out.print("Question " + i + " Calculate the addition (" + randomIntOne + " + " +
			randomIntTwo + "): ");
			int answer = input.nextInt();
			
			// If correct, increase the score by 1
			if(answer == solution) {
				score++;
			}
		}
		
		// Print out score and feedback depending on user's score
		switch(score) {
		case(0):
			System.out.println("Number of correct answers: 0");
			System.out.println("Try again.");
			break;
		case(1):
			System.out.println("Number of correct answers: 1");
			System.out.println("Very bad.");
			break;
		case(2):
			System.out.println("Number of correct answers: 2");
			System.out.println("Not bad.");
			break;
		case(3):
			System.out.println("Number of correct answers: 3");
			System.out.println("Good");
			break;
		case(4):
			System.out.println("Number of correct answers: 4");
			System.out.println("Very good!");
			break;
		case(5):
			System.out.println("Number of correct answers: 5");
			System.out.println("Excellent!");
			break;
		}
	}
}
