
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        while (true) {
            String user = scanner.nextLine();
            if (user.equals("")) {
                break;
            }
            
            String[] pieces = user.split(",");
            int age = Integer.valueOf(pieces[1]);
            if (age > oldest) {
                oldest = age;
            }

        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
