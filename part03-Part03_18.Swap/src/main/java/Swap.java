
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        System.out.println("Give two indices to swap:");

        // Implement here
        // asking for the two indices
        // and then swapping them
        int n1 = Integer.parseInt(scanner.nextLine());
        int index1 = n1; //2
        int n2 = Integer.parseInt(scanner.nextLine());
        int index2 = n2; //4
        for(int i = 0; i<array.length; i++) {           
            if(i == index1){
                int swapper = array[i]; // int swapper = 5;
                array[index1] = array[index2];
                array[index2] = swapper;
            }
        }
        

        System.out.println("");
        index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
    }

}
