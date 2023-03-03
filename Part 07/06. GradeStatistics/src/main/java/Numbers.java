/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */

import java.util.ArrayList;

public class Numbers {
    
    private ArrayList<Integer> numbers;
    private int row5count;
    private int row4count;
    private int row3count;
    private int row2count;
    private int row1count;
    private int row0count;
    
    
    public Numbers(){
        this.numbers = new ArrayList<>();
        this.row5count = 0;
        this.row4count = 0;
        this.row3count = 0;
        this.row2count = 0;
        this.row1count = 0;
        this.row0count = 0;
                
    }
    
    public void addNumber(int number){
        if (number > 0 && number <= 100){
            this.numbers.add(number);
                if (number < 50){
                    this.row0count ++;
                }else if (number < 60){
                    this.row1count ++;
                }else if (number < 70){
                    this.row2count ++;
                }else if (number < 80){
                    this.row3count ++;
                }else if (number < 90){
                    this.row4count ++;
                }else if (number >= 90){
                    this.row5count ++;
                }
        }
    }
    
    public int sumOfNumbers(){
        int sum = 0;
        if (this.numbers == null || this.numbers.isEmpty()){
            return 0;
        }else{
            for (int number : this.numbers){
                sum = sum + number;

            }
            return sum;
        }
        
    }
    
    public double averageOfNumbers(){
        return (double) this.sumOfNumbers() / (double) this.numbers.size();
    }
    
    public double averageOfPassing(){
        int sum = 0;
        int count = 0;
        double average = 0;
        for (int number : numbers){
            if (number >= 50){
                sum = sum + number;
                count ++;
                
            }
        }
        if (count > 0){
            average = (double)sum / (double) count;
            return average;
            
        }else{
            return -1;
        }
        
    }
    
    public int numberOfPasses(){
        int count = 0;
        for (int number: numbers){
            if (number >= 50){
                count ++;
            }
        }
        
        if (count == 0){
            return -1;
        }else{
            return count;
        }
    
       
                
    }
    
    public double passPercentage(){
        double passPercentage = 100 * (double)this.numberOfPasses()/ 
                (double)this.numbers.size();
        
        if (passPercentage < 0){
            return 0.0;
        }else {
            return passPercentage;
        }
    }
    
    public String printStars(int number){
        String output = "";
        for (int i=0; i<number; i++){
            output = output + "*";

        }
        return output;
    }
    
    public String printGradeDistribution(){
        String output = "5: ";
        
        output = output + printStars(this.row5count) + "\n4:" +
                printStars(this.row4count) + "\n" + "3: " +
                printStars(this.row3count) + "\n" + "2: " +
                printStars(this.row2count) + "\n" + "1: " + 
                printStars(this.row1count) + "\n" + "0: " +
                printStars(this.row0count);
        
        return output;
    }
    
    
    
    
    

    
}
