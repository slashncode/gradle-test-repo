package aufgabe;

import main.collections.list.ListUtils;
import main.collections.list.Cookbook;
import main.collections.list.Recipe;
import main.collections.map.MapUtils;
import main.collections.set.SetUtils;
import main.collections.stream.StreamUtils;

import java.util.*;


public class Main {

    public static void main(String[] args) {

        ArrayList<String> recipeOneIngredients = new ArrayList<>();
        recipeOneIngredients.add("Ingredient1");
        recipeOneIngredients.add("Ingredient2");

        ArrayList<String> recipeTwoIngredients = new ArrayList<>();
        recipeTwoIngredients.add("Ingredient1");
        recipeTwoIngredients.add("Ingredient2");

        Recipe recipeOne = new Recipe("Recipe One", recipeOneIngredients, "Recipe Description");
        Recipe recipeTwo = new Recipe("Recipe Two", recipeTwoIngredients, "Recipe Description");


        ArrayList<Recipe> recipeList = new ArrayList<>();
        recipeList.add(recipeOne);
        recipeList.add(recipeTwo);

        Cookbook cookbookOne = new Cookbook(recipeList);

        // Print recipes from cookbook
        for (Recipe recipe: cookbookOne.getRecipes()) {
            System.out.println(recipe.getRecipeName());
            for (String recipeIngredients: recipe.getRecipeIngredients()) {
                System.out.println(recipeIngredients);
            }
            System.out.println(recipe.getRecipeDescription());
            System.out.println("---------------------");
        }

        cookbookOne.searchRecipe("Recipe One");

        System.out.println("---------------------");

        List<String> test = ListUtils.createLinkedList();
        System.out.println(test);

        List<Integer> intList = new LinkedList<Integer>();
        intList.add(3);
        intList.add(7);
        intList.add(19);
        intList.add(9);
        intList.add(12);
        intList.add(11);
        System.out.println(ListUtils.getFifthElement(intList));

        System.out.println(ListUtils.sortAscending(intList));


        System.out.println("--------");


        System.out.println(MapUtils.createShoppingList());

        System.out.println(MapUtils.getKeys(MapUtils.createShoppingList()));

        System.out.println(MapUtils.getBiggestValue(MapUtils.createShoppingList()));


        System.out.println("--------");


        System.out.println(SetUtils.createTreeSet());


        Set<String> threeElTestSet = new HashSet<String>();
        threeElTestSet.add("Test");
        threeElTestSet.add("Dies");
        threeElTestSet.add("Das");
        threeElTestSet.add("Jenes");

        System.out.println(SetUtils.getThreeElements(threeElTestSet));


        System.out.println("--------");


        Set<Integer> integerSet = Set.of(1, 2, 4, 8);

        System.out.println(StreamUtils.product(integerSet));

    }
}
