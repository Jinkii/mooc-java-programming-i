
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int amount = 0;
        int max = 100;
        int move = 0;
        while (true) {
            if (amount < 0) {
                amount = 0;
            }
            if (move < 0) {
                move = 0;
            }
            if (amount > max) {
                amount = max;
            }
            if (move > max) {
                move = max;
            }
            System.out.println("> ");
            System.out.println("First: " + amount + "/" + max);
            System.out.println("Second: " + move + "/" + max);
            String input = scan.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];
            if (input.equals("quit")) {
                break;
            } else if (command.equals("add")) {

                if (!(amount > max) && !(Integer.valueOf(parts[1]) < 0)) {
                    amount += Integer.valueOf(parts[1]);
                }

            } else if (command.equals("move")) {
                if (!(move > max) && !(Integer.valueOf(parts[1]) < 0)) {
                    if (!(Integer.valueOf(parts[1]) > amount)) {
                        move += Integer.valueOf(parts[1]);
                        amount -= Integer.valueOf(parts[1]);
                    } else {
                        move += amount;
                        amount -= amount;
                    }

                }

            } else if (command.equals("remove")) {

                move -= Integer.valueOf(parts[1]);

            }

        }
    }

}
