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

public class Suitcase {
    
    private ArrayList<Item> suitcase;
    private int maxWeight;
    
    public Suitcase(int maximumWeight){
        this.suitcase = new ArrayList<>();
        this.maxWeight = maximumWeight;
    }
    
    public void addItem(Item item){
        int currentWeight = 0;

        if (suitcase.size() == 0 || suitcase == null){
            currentWeight = 0;
        }else{
            currentWeight = this.totalWeight();
        }
             

        
        if(this.maxWeight - currentWeight >= item.getWeight()){
            suitcase.add(item);
                        
        }        
    }
    
    public String toString(){
        int numberItems = suitcase.size();
        int totalWeight = 0;
        String returnOutput = "";
        
        if (suitcase.size() == 0){
            return "no items (0 kg)";
        }
        
        if (suitcase.size() == 1){
            returnOutput = " item (";

        
        }else{
            returnOutput = " items (";
        }
        
        for (Item piece: suitcase){
            totalWeight = totalWeight + piece.getWeight();
        }
        
        return numberItems + returnOutput + totalWeight + " kg)";
        
    }
    
    public void printItems(){
        
        String returnOutput = "";
        int i = 0;
        
        for (Item item : suitcase){
            if (i == suitcase.size() -1){
                returnOutput = returnOutput + item;
            }else{
                returnOutput = returnOutput + item + "\n";
            }
            
        }
        
        System.out.println(returnOutput);
        

    }
    
    public int totalWeight(){
        int totalWeight = 0;
        for (Item item : suitcase){
            totalWeight = totalWeight + item.getWeight();
        }
        
        return totalWeight;
    }
    
    public Item heaviestItem(){
        
        if (suitcase == null || suitcase.size() == 0){
            return null;
        }
        
        Item returnedItem = suitcase.get(0);
        
        for (Item item : suitcase){
            if (returnedItem.getWeight() < item.getWeight()){
                returnedItem = item;
            }
        }
        
        return returnedItem;
      
        
        
    }
}
