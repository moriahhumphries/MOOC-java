
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number?");
        int userNum = Integer.valueOf(scanner.nextLine());

        int result = 1;

        for (int i = result; i <= userNum; i++) {
            result = result * i;

        }
        System.out.println("Factorial: " + result);

    }
}
