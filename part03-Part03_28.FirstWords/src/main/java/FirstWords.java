
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String user = scanner.nextLine();
            String[] pieces = user.split(" ");
            System.out.println(pieces[0]);
            if (user.equals("")) {
                break;
            }
        }
    }
}
