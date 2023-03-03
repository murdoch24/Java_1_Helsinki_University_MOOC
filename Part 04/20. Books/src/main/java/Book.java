/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Book {
    private String title;
    private int pages;
    private int publicationYear;
    
    public Book(String bookTitle, int noOfPages, int yearPublished){
        this.title = bookTitle;
        this.pages = noOfPages;
        this.publicationYear = yearPublished;
    }
    
    public String getTitle(){
        return this.title;
    }
    

    public String toString(){
        return title + ", " + pages + " pages, " + publicationYear;
    }
    
}
