
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        while (!input.isEmpty()) {
            String[] arr = input.split(" ");
            for (String string : arr) {
                if (input.contains("av")) {
                    System.out.println(string);
                }
            }
            input = scanner.nextLine();
        }


    }
}
