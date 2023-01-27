
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a word:");
        String word = scanner.nextLine();
        int i = 0;
        while(i < 3){
            System.out.print(word);
            i++;
        }
    }
}
