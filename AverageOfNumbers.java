
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;

        while (true) {
            System.out.println("Give a number:");
            int userNum = Integer.valueOf(scanner.nextLine());

            if (userNum == 0) {
                break;
            }

            if (userNum != 0) {
                count = count + 1;
                sum = userNum + sum;
                
            }
        }
        System.out.println("Average of the numbers: " + (sum / count));
       

    }
}
