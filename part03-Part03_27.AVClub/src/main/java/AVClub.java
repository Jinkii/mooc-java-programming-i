
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String user = scanner.nextLine();
            String[] pieces = user.split(" ");
            for(String s : pieces){
                if(s.contains("av")){
                    System.out.println(s);
                }
            }
            if (user.equals("")) {
                break;
            }
        }

    }
}
