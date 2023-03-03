
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        boolean bookFound = false;

        while (true) {
            System.out.println("Name (empty will stop):");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            

            System.out.println("Publication year:");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            Book book = new Book(name, publicationYear);
            
            for (Book oldBook : books){
                
                if (book.equals(oldBook)){
                    System.out.println("The book is already on the list. Let's"
                            + "not add the same book again.");
                    bookFound = true;
                }else{
                    bookFound = false;
                    
                }
            }
            
            if (!(bookFound)){
                books.add(book);
            }
            
            
         
            
            
            

        }
        
        // NB! Don't alter the line below!
        System.out.println("Thank you! Books added: " + books.size());
    }
}
