import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeManager {
    
    private ArrayList<String> ingredients;
    private ArrayList<Recipe> recipeList;
    
    public RecipeManager(){
        this.ingredients = new ArrayList<>();
        this.recipeList = new ArrayList<>();
    }
    
    public void readRecipe(String fileName){
        try (Scanner input = new Scanner(new File(fileName))){
            while (input.hasNextLine()){
                String recipeName = input.nextLine();
                int cookingTime = Integer.valueOf(input.nextLine());
                Recipe recipe = new Recipe(recipeName, cookingTime);
                recipeList.add(recipe);
                while (input.hasNextLine()){
                    String ingredient = input.nextLine();
                    if (ingredient.isEmpty()){
                        break;
                    }
                    recipe.addIngredients(ingredient);
                    
                }
            }
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void listRecipes(){
        System.out.println("Recipes: ");
        for (Recipe recipe : recipeList){
            System.out.println(recipe);
        }
    }
    
    public void findName(String nameToFind){
        System.out.println("Recipes: ");
        for (Recipe recipe : recipeList){
            if (recipe.getRecipeName().contains(nameToFind)){
                System.out.println(recipe);
            }
            
        }
    }
    
    public void findIngredient(String ingredient){
        
        for (int i= 0; i < recipeList.size(); i++){
            if (recipeList.get(i).getIngredients().contains(ingredient)){
                System.out.println(recipeList.get(i));
            }
        }
    }
    
    public void findCookingTime(int maxCookingTime){
        System.out.println("Recipes: ");
        for (Recipe recipe : recipeList){
            if(recipe.getCookingTime() <= maxCookingTime){
                System.out.println(recipe);
            }
        }
        
    }
}
