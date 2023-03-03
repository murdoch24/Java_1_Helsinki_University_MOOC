import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        
        ArrayList<Book> bookLibrary = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
                
        while(true){
            System.out.println("Title: ");
            String bookTitle = scanner.nextLine();
            
            if (bookTitle.isEmpty()){
                break;
            }
            
            System.out.println("Pages: ");
            int numPages = Integer.valueOf(scanner.nextLine());
            
            System.out.println("Publication Year: ");
            int yearPublished = Integer.valueOf(scanner.nextLine());
            
            bookLibrary.add(new Book(bookTitle, numPages, yearPublished));
            
            
        }
        
        System.out.println("What information will be printed? ");
        String userInput = scanner.nextLine();
        
        if (userInput.equals("everything")){
            for (Book book : bookLibrary){
                System.out.println(book);
            }
            
        }else if(userInput.equals("name")){
            for (Book book: bookLibrary){
                System.out.println(book.getTitle());
            }
        }

    }
}
