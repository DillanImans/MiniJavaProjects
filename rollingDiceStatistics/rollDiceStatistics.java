import java.util.*;

public class rollDiceStatistics {
  public static void main(String[] args) {

    // Getting Dice Rolls
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number of dices: ");
    int numOfDices = input.nextInt();
    System.out.println("Enter number of rolls: ");
    int numOfRolls = input.nextInt();

    Random diceGenerator = new Random();

    int[] arrayOfSums = new int[numOfRolls];

    for (int i = 0; i < numOfRolls; i++) {
      int sum = 0;
      for (int j = 0; j < numOfDices; j++) {
        int rollResult = 1 + diceGenerator.nextInt(6);
        sum += rollResult;
      }
      arrayOfSums[i] = sum;
    }

    Arrays.sort(arrayOfSums);

    // Getting frequency of elements in an array
    int[] arrayOfFreq = new int[arrayOfSums.length];
    int visited = -1;

    for (int i = 0; i < arrayOfSums.length; i++) {
      int count = 1;

      for (int j = i + 1; j < arrayOfSums.length; j++) {
        if (arrayOfSums[i] == arrayOfSums[j]) {
          count++;
          arrayOfFreq[j] = visited;
        }
      }

      if (arrayOfFreq[i] != visited) {
        arrayOfFreq[i] = count;
      }
    }

    // Getting percentage of elements in an array
    double[] arrayOfPercentages = new double[arrayOfFreq.length];
    for (int i = 0; i < arrayOfFreq.length; i++) {
      if (arrayOfFreq[i] != visited) {
        float calculatedPercentage = arrayOfFreq[i] * 100f / numOfRolls;
        arrayOfPercentages[i] = calculatedPercentage;
      }
    }

    /*
     * Getting pretty graphics beside percentage (but not pretty lmao.
     * need to be "relative" to make it pretty).
     */
    String[] arrayOfGraphicSymbols = new String[arrayOfFreq.length];
    for (int i = 0; i < arrayOfFreq.length; i++) {
      if (arrayOfFreq[i] != visited) {
        if (arrayOfPercentages[i] >= 0 && arrayOfPercentages[i] <= 11) {
          arrayOfGraphicSymbols[i] = "O";
        }
        if (arrayOfPercentages[i] > 11 && arrayOfPercentages[i] <= 21) {
          arrayOfGraphicSymbols[i] = "OO";
        }
        if (arrayOfPercentages[i] > 21 && arrayOfPercentages[i] <= 31) {
          arrayOfGraphicSymbols[i] = "OOO";
        }
        if (arrayOfPercentages[i] > 31 && arrayOfPercentages[i] <= 41) {
          arrayOfGraphicSymbols[i] = "OOOO";
        }
        if (arrayOfPercentages[i] > 41 && arrayOfPercentages[i] <= 51) {
          arrayOfGraphicSymbols[i] = "OOOOO";
        }
        if (arrayOfPercentages[i] > 51 && arrayOfPercentages[i] <= 61) {
          arrayOfGraphicSymbols[i] = "OOOOOO";
        }
        if (arrayOfPercentages[i] > 61 && arrayOfPercentages[i] <= 71) {
          arrayOfGraphicSymbols[i] = "OOOOOOO";
        }
        if (arrayOfPercentages[i] > 71 && arrayOfPercentages[i] <= 81) {
          arrayOfGraphicSymbols[i] = "OOOOOOOO";
        }
        if (arrayOfPercentages[i] > 81 && arrayOfPercentages[i] <= 91) {
          arrayOfGraphicSymbols[i] = "OOOOOOOOOO";
        }
        if (arrayOfPercentages[i] > 91 && arrayOfPercentages[i] <= 100) {
          arrayOfGraphicSymbols[i] = "OOOOOOOOOOO";
        }
      }
    }

    // Formatting
    Formatter tableOfRolls = new Formatter();
    tableOfRolls.format("%15s %15s %15s\n", "Sum", "Frequency", "Percentage");
    for (int i = 0; i < arrayOfSums.length; i++) {
      if (arrayOfFreq[i] != visited) {
        tableOfRolls.format("%15d %15d %15.2f %2s\n",
            arrayOfSums[i], arrayOfFreq[i], arrayOfPercentages[i], arrayOfGraphicSymbols[i]);
      }
    }

    // Printing
    if (arrayOfSums.length == 0) {
      System.out.println("You either have 0 dices and/or 0 rolls. How you gon' get a result chief.");
    } else {
      System.out.println(tableOfRolls);
    }
  }
}
