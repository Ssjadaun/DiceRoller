import java.util.Random;

public class DiceRoller {

public static void main(String[] args) {
    // Create a Random object to generate random numbers
    Random random = new Random();

    // Simulate rolling the dice
    int die1 = random.nextInt(6) + 1; // Generate a random number between 1 and 6
    int die2 = random.nextInt(6) + 1;

    // Calculate the total roll
    int total = die1 + die2;

    // Display the results
    System.out.println("You rolled a " + die1 + " and a " + die2 + " for a total of " + total);
}
}

