
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int userNum = Integer.valueOf(scanner.nextLine());

            if (userNum == 0) {
                break;
            }

            if (userNum != 0) {
                start = start + 1;
                sum = userNum + sum;
            }
        }
        System.out.println("Number of numbers: " + start);
        System.out.println("Sum of the numbers: " + sum);

    }
}
