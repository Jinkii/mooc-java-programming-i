
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        // implement here a program that reads user input
        // until the user enters 9999
        int input = 0;
        while(input != 9999){
            input = Integer.valueOf(scanner.nextLine());
            if(input == 9999){
                break;
            }
            list.add(input);
        }
        
        int smallest = list.get(0);
        for(int i = 0; i<list.size(); i++){
            int number = list.get(i);  
            if(smallest > number){
               smallest = number;            
            }
            if(list.get(i) == smallest){
                System.out.println("Found at index " + i);
            }
        }
        System.out.println("Smallest number: " + smallest);
        for(int i = 0; i<list.size(); i++) {
            if(list.get(i) == smallest){
                System.out.println("Found at index " + i);
            }
        }
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
               
    }
}
