
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        double first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        double second = Integer.valueOf(scanner.nextLine());
        System.out.println("The average is " + (1 * first + second) / 2);

    }
}
