import java.util.Random;
import java.util.Scanner;

public class RandomGenerator {
    public static void main(String[] args) {
        // variables
        Scanner scan = new Scanner(System.in);
        int randNum = (int)(Math.random() * 100) + 1; // generates a random number between 1 and 100
        int guess;

        // user input
        System.out.println("Welcome to guess the number!");
        System.out.println("--------------------------------");
        System.out.print("Please enter a number between 1 & 100: ");
        guess = scan.nextInt();






    }
}
