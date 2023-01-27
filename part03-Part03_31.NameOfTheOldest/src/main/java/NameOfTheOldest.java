
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String name = "";
        while (true) {
            String user = scanner.nextLine();
            if (user.equals("")) {
                break;
            }

            String[] pieces = user.split(",");
            int age = Integer.valueOf(pieces[1]);
            if (age > oldest) {
                name = pieces[0];
                oldest = age;
            }

        }
        System.out.println("Name of the oldest: " + name);

    }
}
