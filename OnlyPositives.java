
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number");
            int userNum = Integer.valueOf(scanner.nextLine());

            if (userNum == 0) {
                break;
            }

            if (userNum > 0) {
                System.out.println(Math.pow(userNum, 2));
            }

            if (userNum < 0) {
                System.out.println("Unsuitable number");
            }

        }

    }
}
