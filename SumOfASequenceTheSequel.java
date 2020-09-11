
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("First number?");
        int userNum = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Second number?");
        int userNum2 = Integer.valueOf(scanner.nextLine());
        

        int result = 0;

        for (int i = userNum; i <= userNum2; i++) {
            result += i;
            System.out.println(result);
        }
    }
}
