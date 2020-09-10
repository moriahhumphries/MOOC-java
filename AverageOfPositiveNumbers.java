
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;

        while (scanner.hasNext()) {
            System.out.println("Give a number:");
            int userNum = Integer.valueOf(scanner.nextLine());

            if (userNum == 0) {
                break;
            } else if (userNum > 0) {
                count++;
                sum += userNum;
            }
        }
        if (count > 0) {
            System.out.println("The average is: " + sum / count);;
        } else {
            System.out.println("Cannot calculate the average.");
        }

//            if (userNum == 0) {
//                break;
//            }
//
//            if (userNum != 0 && userNum > 0) {
//                count = count + 1;
//                sum = userNum + sum;
//
//            }
//
//            if (userNum == 0 && count == 0) {
//                System.out.println("Cannot calculate the average");
//                break;
//            } 
//
//        }
//        System.out.println(sum / count);
    }
}
