
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int greatest = 0;

        while (!input.isEmpty()) {
            String[] pieces = input.split(",");
            for (int i = 1; i < pieces.length; i = i + 2) {
                if (Integer.parseInt(pieces[i]) > greatest) {
                    greatest = Integer.parseInt(pieces[i]);
                }
            }
            input = scanner.nextLine();

        }
        System.out.println(greatest);
    }
}
