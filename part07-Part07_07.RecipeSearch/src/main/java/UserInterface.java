
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jinki
 */
public class UserInterface {

    public UserInterface() {

    }

    public void start(Scanner scan) throws IOException {
        System.out.println("File to read: ");
        String filePath = scan.nextLine();
        commands(scan, filePath);
    }

    public ArrayList<ArrayList<String>> readFile(String file) {
        ArrayList<ArrayList<String>> recipes = new ArrayList<>();
        try {

            Scanner fileReader = new Scanner(Paths.get(file));
            while (fileReader.hasNextLine()) {
                ArrayList<String> recipeString = new ArrayList<>();
                while (true) {
                    String row = fileReader.nextLine();
                    if (row.isEmpty() || !fileReader.hasNextLine()) {
                        recipes.add(recipeString);
                        break;
                    }
                    recipeString.add(row);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(UserInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        return recipes;
    }

    public ArrayList<Recipe> stringToRecipe(String file) {
        ArrayList<Recipe> recipes = new ArrayList<>();
        ArrayList<ArrayList<String>> stringRecipes = readFile(file);

        for (int i = 0; i < stringRecipes.size(); i++) {
            Recipe recipe = new Recipe(stringRecipes.get(i).get(0), Integer.valueOf(stringRecipes.get(i).get(1)));
            for (int j = 2; j < stringRecipes.get(i).size(); j++) {
                recipe.getIngredients().add(stringRecipes.get(i).get(j));
            }
            recipes.add(recipe);
        }

        return recipes;
    }

    public void commands(Scanner scan, String filePath) {
        ArrayList<Recipe> recipes = stringToRecipe(filePath);
        while (true) {
            System.out.println("Commands: ");
            System.out.println("list - lists the recipes");
            System.out.println("stop - stops the program");
            System.out.println("find name - searches recipes by name");
            System.out.println("find cooking time - searches recipes by cooking time");
            System.out.println("find ingredient - searches recipes by ingredient");
            System.out.println("\nEnter command: ");
            String command = scan.nextLine();
            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                System.out.println("\nRecipes: ");
                for (Recipe r : recipes) {
                    System.out.println(r.toString());
                }
            } else if (command.equals("find name")) {
                System.out.println("Searched word: ");
                String name = scan.nextLine();
                ArrayList<Recipe> foundRecipes = searchByName(recipes, name);
                System.out.println("\nRecipes: ");
                for (Recipe r : foundRecipes) {
                    System.out.println(r);
                }
            } else if (command.equals("find cooking time")) {
                System.out.println("Max cooking time: ");
                int cookTime = Integer.valueOf(scan.nextLine());
                ArrayList<Recipe> foundRecipes = searchCookTime(recipes, cookTime);
                System.out.println("\nRecipes: ");
                for (Recipe r : foundRecipes) {
                    System.out.println(r);
                }
            } else if (command.equals("find ingredient")) {
                System.out.println("Ingredient: ");
                String ingredient = scan.nextLine();
                ArrayList<Recipe> foundRecipes = searchIngredient(recipes, ingredient);
                System.out.println("\nRecipes: ");
                for (Recipe r : foundRecipes) {
                    System.out.println(r);
                }
            }
        }
    }

    public ArrayList<Recipe> searchByName(ArrayList<Recipe> recipes, String name) {
        ArrayList<Recipe> foundRecipes = new ArrayList<>();
        for (Recipe r : recipes) {
            if (r.getName().toUpperCase().contains(name.toUpperCase())) {
                foundRecipes.add(r);
            }
        }
        return foundRecipes;
    }

    public ArrayList<Recipe> searchCookTime(ArrayList<Recipe> recipes, int cookTime) {
        ArrayList<Recipe> foundRecipes = new ArrayList<>();
        for (Recipe r : recipes) {
            if (r.getCookingTime() <= cookTime) {
                foundRecipes.add(r);
            }
        }
        return foundRecipes;
    }

    public ArrayList<Recipe> searchIngredient(ArrayList<Recipe> recipes, String ingredient) {
        ArrayList<Recipe> foundRecipes = new ArrayList<>();
        for (Recipe r : recipes) {
            for (int i = 0; i < r.getIngredients().size(); i++) {
                if (r.getIngredients().get(i).equalsIgnoreCase(ingredient)) {
                    foundRecipes.add(r);
                }
            }
        }
        return foundRecipes;
    }
}
