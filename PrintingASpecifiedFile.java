
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What file should have it's contents printed?");
        String fileName = scanner.nextLine();
        
        try ( Scanner scannerPath = new Scanner(Paths.get(fileName))) {
            
            // we read the file until all lines have been read
            while (scannerPath.hasNextLine()) {
                // we read one line
                String row = scannerPath.nextLine();
                // we print the line that we read
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
