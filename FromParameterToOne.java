
public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);
    }

    public static void printFromNumberToOne(int number) {
        int count = 1;
        while (count <= number) {
            System.out.println(number);
            number--;
        }
    }
}
