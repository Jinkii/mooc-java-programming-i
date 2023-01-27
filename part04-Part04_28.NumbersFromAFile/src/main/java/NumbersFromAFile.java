
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        ArrayList<Integer> numbers = new ArrayList<>();
        try(Scanner scan = new Scanner(Paths.get(file))){
            while (scan.hasNextLine()){
                numbers.add(Integer.valueOf(scan.nextLine()));
            }
            int count = 0;
            for(Integer i : numbers){
                if(i >= lowerBound && i <= upperBound){
                    count++;
                }
            }
            System.out.print("Numbers: " + count);
            
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }

}
