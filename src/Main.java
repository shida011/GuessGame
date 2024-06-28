import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int drawnNumber = random.nextInt(100) + 1;

        int attempt = 0;
        int userNumber = 0;

        System.out.println("Welcome to the Guess Game!");
        System.out.println("Try to guess a number from 1 to 100.");

        while (userNumber != drawnNumber) {
            System.out.print("Enter your guess: ");
            userNumber = input.nextInt();
            attempt++;

            if (userNumber < drawnNumber) {
                System.out.println("The drawn number is higher. Try again.");
            } else if (userNumber > drawnNumber) {
                System.out.println("The drawn number is smaller. Try again.!");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempt + " attempts.");
            }

        }

        input.close();
    }
}