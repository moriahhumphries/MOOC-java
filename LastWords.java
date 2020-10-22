
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] pieces = input.split(" ");
            int index = 0;
            while (index < pieces.length - 1) {
                String words = pieces[index];
                index++;

            }

            System.out.println(pieces[index]);
        }
    }
}
