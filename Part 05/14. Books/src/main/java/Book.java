
import java.util.Objects;


public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    
    @Override
    public boolean equals(Object compared){
        
        // check if compared is in same location as this
        if (this == compared){
            return true;
        }
        
        // check if compared is an instance of book object;
        if (!(compared instanceof Book)){
            return false;
        }
        
        // convert compared to a book object
        
        Book comparedBook = (Book) compared;
        
        if (this.name.equals(comparedBook.name) &&
                this.publicationYear == comparedBook.publicationYear){
            return true;
        }else{
            return false;
            
        }
            
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.name);
        hash = 47 * hash + this.publicationYear;
        return hash;
    }

}
