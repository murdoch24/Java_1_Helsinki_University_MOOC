import java.util.ArrayList;
import java.nio.file.Paths;
import java.util.Scanner;

public class Recipe {
    
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;
    
    public Recipe(String name, int cookingTime){
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = new ArrayList<>();
    }
    
    @Override
    public String toString(){
        return this.name + ", cooking time: " + this.cookingTime;
    }
    
    public String getRecipeName(){
        return this.name;
    }
    
    public int getCookingTime(){
        return this.cookingTime;
    }
    
    public void addIngredients(String ingredient){
        this.ingredients.add(ingredient);
    }
    
    public ArrayList<String> getIngredients(){
        return this.ingredients;
    }
    

    
    

    
    
    
    
    
}
