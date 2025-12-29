// import the Scanner class from the java.util package
import java.util.Scanner;
public class CelsiusConverter {
    public static void main(String[] args) {

        // variables
        Scanner scan = new Scanner(System.in);
        double celsius = 0.0;
        double fahrenheit = 0.0;

        // get user input
        System.out.print("Enter a temperature in Celsius: ");
        celsius = scan.nextDouble();

        // convert
        fahrenheit = celsius * 9/5.0 + 32;

        // return the value (as a formatted string)
        System.out.printf("%.1f C = %.1f F",celsius,fahrenheit);




        // Bugs That I Had
        // 1. I forgot to set the value that the user entered for Celsius equal to the variable



    }
}
