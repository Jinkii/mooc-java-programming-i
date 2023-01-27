
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInterface ui = new UserInterface();
        try {
            ui.start(scanner);
        } catch (IOException ex) {
            Logger.getLogger(RecipeSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
