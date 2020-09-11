
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNum = Integer.valueOf(scanner.nextLine());
        
        int result = 0;
        
        for (int i = 0; i <= userNum; i++){
            result += i;
            System.out.println(result);
        }
        
     

    }
}
