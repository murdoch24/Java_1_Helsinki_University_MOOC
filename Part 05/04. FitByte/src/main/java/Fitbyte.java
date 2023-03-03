/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Fitbyte {
    
    private int age;
    private int restingheart;
    
    
    
    public Fitbyte(int age, int restingHeartRate){
        this.age = age;
        this.restingheart = restingHeartRate;
        
    }
    
    public double targetHeartRate(double percentageOfMaximum){
        return (maximumHeartRate() - this.restingheart) 
                * percentageOfMaximum + this.restingheart;
       
    }
    
    public double maximumHeartRate(){
        return 206.3 - (0.711 * this.age);
    }
}
