// import the Scanner class from the java.util package
import java.util.Scanner;
public class SecondsConverter {
    public static void main(String[] args) {
        // variables
        Scanner scan = new Scanner(System.in);
        int seconds = 0;
        int mins = 0;
        int hour = 0;

        // ask user for input
        System.out.println("Please enter a value of seconds: ");
        seconds = scan.nextInt();

        // this is to copy the original seconds value to make sure that we can display the value after calculations
        int newSeconds = seconds;

        // Convert
       hour = newSeconds / 3600;
       mins = (newSeconds % 3600) / 60;
       newSeconds = newSeconds % 60;


        // display
        System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds",seconds,hour,mins, newSeconds);








    }




}
