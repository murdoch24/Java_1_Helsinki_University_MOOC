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

public class Hold {
    
    private ArrayList<Suitcase> hold;
    private int maxWeight;
    
    public Hold(int maximumWeight){
        this.hold = new ArrayList<>();
        this.maxWeight = maximumWeight;
        
    }
    
    public void addSuitcase(Suitcase suitcase){
        int currentWeight = 0;
        
        if (hold.size() == 0 || hold == null){
            currentWeight = 0;
        }else {
            currentWeight = this.totalWeight();
        }
        
        if (this.maxWeight - currentWeight >= suitcase.totalWeight()){
            hold.add(suitcase);
        }
        
    }

    
    public String toString(){
        
        int totalWeight = 0;
        for (Suitcase suitcase : hold){
            totalWeight = totalWeight + suitcase.totalWeight();
        }
        return hold.size() + " suitcases (" + totalWeight + " kg)";
    }
    
        
    public void printItems(){
        for (Suitcase suitcase : hold){
            suitcase.printItems();
        }
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        for (Suitcase suitcase : this.hold){
            totalWeight = totalWeight + suitcase.totalWeight();
        }
        
        return totalWeight;
    }
    
    
}
