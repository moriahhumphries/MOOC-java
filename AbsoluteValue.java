
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNumber = Integer.valueOf(scanner.nextLine());
        
        if (userNumber < 0) {
            System.out.println(userNumber * -1);
        } else {
            System.out.println(userNumber);
        }

    }
}
