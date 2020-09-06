
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        int userInput = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a year:");
        
        if (userInput < 2015) {
            System.out.println("Ancient history!");
        }
        
        
        
    }
}
