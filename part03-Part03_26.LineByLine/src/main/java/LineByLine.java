
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s = scanner.nextLine();
            String[] pieces = s.split(" ");
            for (String i : pieces) {
                System.out.println(i);
            }
            if(s.equals("")){
                break;
            }
        }
    }
}
