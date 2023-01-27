
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jinki
 */
public class UserInterface {

    private Container firstContainer;
    private Container secondContainer;
    private Scanner scan;

    public UserInterface(Container firstContainer, Container secondContainer, Scanner scan) {
        this.firstContainer = firstContainer;
        this.secondContainer = secondContainer;
        this.scan = scan;
    }

    public void start() {
        while (true) {

            System.out.println("First: " + this.firstContainer);
            System.out.println("Second: " + this.secondContainer);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int quantity = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                this.firstContainer.add(quantity);
            } else if (command.equals("move")) {
                if (firstContainer.contains() > 0) {
                    if ((this.firstContainer.contains() - quantity) < 0) {
                        int amount = this.firstContainer.contains();
                        this.firstContainer.setAmount(0);
                        this.secondContainer.add(amount);
                    } else {
                        this.firstContainer.remove(quantity);
                        this.secondContainer.add(quantity);
                    }
                }
            } else if (command.equals("remove")) {
                this.secondContainer.remove(quantity);
            }
        }
    }

}
