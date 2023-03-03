/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */

import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary objects;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.scanner = scanner;
        this.objects = dictionary;
    }
    
    public void start(){
        while (true) {
            System.out.println("Command: ");
            String input = scanner.nextLine();
            if (input.equals("end")){
                break;
            }
            
            processCommand(input);
            System.out.println("");
        }
        
        System.out.println("Bye bye!");

        
    }
    
    public void processCommand(String command){
        if (command.equals("add")){
            add();
        } else if(command.equals("search")){
            search();
        } else {
            System.out.println("Unknown command");
        }
    }
    
    public void add() {
        System.out.println("Word: ");
        String word = this.scanner.nextLine();
        System.out.println("Translation: ");
        String translation = this.scanner.nextLine();
        this.objects.add(word, translation);
    }
    
    public void search() {
        System.out.println("To be translated: ");
        String word = this.scanner.nextLine();
        
        if (this.objects.translate(word) == null) {
            System.out.println("Word " + word + " was not found");
            
        }else {
            System.out.println("Translation: " + this.objects.translate(word));
        }
    
    }
    
    
    
    
    
}
