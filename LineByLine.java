
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
       
        while (!input.isEmpty()) {
            String[] arr = input.split(" ");
            for (String string : arr) {
                System.out.println(string);
            }
            input = scanner.nextLine();
        }

    }
}
