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

public class UserInterface {
    
    private Scanner scanner;
    private Numbers numbers;
    
    public UserInterface(Numbers numbers, Scanner scanner){
        this.scanner = scanner;
        this.numbers = numbers;
    }
    
    public void start(){
        System.out.println("Enter point totals -1 stops: ");
        
        while (true){
            int userInput = Integer.valueOf(scanner.nextLine());
            
            if (userInput == -1){
                break;
                
            }
            
            numbers.addNumber(userInput);
        }
        
        System.out.println("Point average (all): " 
                + numbers.averageOfNumbers());
        
        if (numbers.averageOfPassing() == -1){
            System.out.println("Point average (passing): -");
        }else{
            System.out.println("Point average (passing): " +
                numbers.averageOfPassing());            
        }
        
        System.out.println("Pass percentage: " + numbers.passPercentage());
        System.out.println(numbers.printGradeDistribution());
        

    }
    
    
    


    
    
}
