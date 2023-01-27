
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double average = 0;
        int longest = 0;
        String name = "";
        int count = 0;
        while (true) {
            String s = scanner.nextLine();
            if (s.equals("")) {
                break;
            }
            
            String[] pieces = s.split(",");
            int length = pieces[0].length();
            int birth = Integer.valueOf(pieces[1]);
            if(longest < length){
                name = pieces[0];
                longest = length;
            }
            average = average + birth;
            count++;
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + (average/count));
    }
}
