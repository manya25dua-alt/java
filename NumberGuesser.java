import java.util.Random;
import java.util.Scanner;

public class NumberGuesser{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("================================");
        System.out.println("     NUMBER GUESSER");
        System.out.println("================================");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Try to guess it!");

        do {
            System.out.print("\nEnter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > number) {
                System.out.println("Too HIGH! Try again.");
            } 
            else if (guess < number) {
                System.out.println("Too LOW! Try again.");
            } 
            else {
                System.out.println("\n🎉 Congratulations!");
                System.out.println("You guessed the number in " + attempts + " attempts.");
            }

        } while (guess != number);

        sc.close();
    }
}