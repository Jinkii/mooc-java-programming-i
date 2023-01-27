
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String user = scanner.nextLine();
            String[] pieces = user.split(" ");
            System.out.println(pieces[pieces.length-1]);
            if (user.equals("")) {
                break;
            }
        }
    }
}
