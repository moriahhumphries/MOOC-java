
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String oldest = null;
        int greatest = 0;

        while (!input.isEmpty()) {
            String[] pieces = input.split(",");
            
            for (int i = 1; i < pieces.length; i = i + 2) {
                if (Integer.parseInt(pieces[i]) > greatest) {
                    greatest = Integer.parseInt(pieces[i]);
                    oldest = pieces [i - 1];
                }
            }
            input = scanner.nextLine();

        }
        System.out.println(oldest);
    }
}
