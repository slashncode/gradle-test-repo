package test.collections.set.src.main.collections.list;

import java.util.ArrayList;

public class Recipe {
    String recipeName;
    ArrayList<String> recipeIngredients;
    String recipeDescription;

    public Recipe(String recipeName, ArrayList<String> recipeIngredients, String recipeDescription) {
        this.recipeName = recipeName;
        this.recipeIngredients = recipeIngredients;
        this.recipeDescription = recipeDescription;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public ArrayList<String> getRecipeIngredients() {
        return recipeIngredients;
    }

    public void setRecipeIngredients(ArrayList<String> recipeIngredients) {
        this.recipeIngredients = recipeIngredients;
    }

    public String getRecipeDescription() {
        return recipeDescription;
    }

    public void setRecipeDescription(String recipeDescription) {
        this.recipeDescription = recipeDescription;
    }
}
