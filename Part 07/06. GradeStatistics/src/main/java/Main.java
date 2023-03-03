
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Numbers numbers = new Numbers();
        
        UserInterface ui = new UserInterface(numbers, scanner);
        ui.start();
        
        
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.

    }
}
