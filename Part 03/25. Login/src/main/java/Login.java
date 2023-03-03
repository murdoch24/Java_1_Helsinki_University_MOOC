
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String usernameOne = "alex";
        String passwordOne = "sunshine";
        String usernameTwo = "emma";
        String passwordTwo = "haskell";
        
        System.out.println("Enter username: ");
        String usernameInput = scanner.nextLine();
        System.out.println("Enter password: ");
        String passwordInput = scanner.nextLine();
        
        
        if (!(usernameInput.equals(usernameOne)
                || usernameInput.equals(usernameTwo))){
            System.out.println("Incorrect username or password!");
        }else if (usernameInput.equals(usernameOne)
                && passwordInput.equals(passwordOne)){
            System.out.println("You have successfully logged in!");
        }else if (usernameInput.equals(usernameTwo) 
                && passwordInput.equals(passwordTwo)){
            System.out.println("You have successfully logged in!");
        }else{
            System.out.println("Incorrect username or password!");
        }
    
        

    }
}
