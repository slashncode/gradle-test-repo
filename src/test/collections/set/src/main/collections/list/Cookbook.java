package test.collections.set.src.main.collections.list;

import java.util.ArrayList;

public class Cookbook {
    ArrayList<Recipe> recipes;

    public Cookbook(ArrayList<Recipe> recipes) {
        this.recipes = recipes;
    }

    public ArrayList<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(ArrayList<Recipe> recipes) {
        this.recipes = recipes;
    }

    public void searchRecipe(String recipeName) {
        for (Recipe recipe: this.recipes) {
            if (recipe.getRecipeName().equals(recipeName)) {
                System.out.println("Found!");
                return;
            }
        }
        System.out.println("Not found!");
    }
}
