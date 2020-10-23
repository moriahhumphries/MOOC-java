
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String greatestLengthStr = null;
        int greatestLength = 0;
        int sum = 0;
        int count = 0;
        double average = 0;

        while (true) {
            String input = scanner.nextLine();
            String[] pieces = input.split(",");
            
            if(input.equals("")) {
                break;
            }

            if (pieces[0].toCharArray().length > greatestLength) {
                greatestLength = pieces[0].toCharArray().length;
                greatestLengthStr = pieces[0];
            }
            count++;
            sum += Integer.parseInt(pieces[1]);

        }
        average = (double) sum / count;
        System.out.println("Longest name: " + greatestLengthStr);
        System.out.println("Average of the birth years: " + average);
               
    }
}
