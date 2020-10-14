
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");
        int sum = 0;
        // toteuta listan lukujen summan laskeminen tänne
        for (Integer input : list) {
            sum += input;
        }
         System.out.println("Sum: " + sum);
    }
}
