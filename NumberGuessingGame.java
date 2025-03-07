import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        // initiate random
        Random random = new Random();
        // the numbers to guess
        int numberToGuess = random.nextInt(100) + 1;
        // intitate scanner
        Scanner scanner = new Scanner(System.in);
        // current attempts counts
        int attempts = 0;
        // wining state
        boolean hasWon = false;

        while (attempts < 5) {
            System.out.println("Guess the number (1 - 100): ");

        }
    }

}
