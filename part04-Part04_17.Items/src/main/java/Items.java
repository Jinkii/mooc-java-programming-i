
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String name = input;
            System.out.println("Name: " + name);
            items.add(new Item(name));
        }
        System.out.println(items.toString() + "\n");
    }
}
