
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String nameOfFile = scanner.nextLine();
        
        try (Scanner scannerTwo = new Scanner(Paths.get(nameOfFile))){
            
            while (scannerTwo.hasNextLine()){
                String row = scannerTwo.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
