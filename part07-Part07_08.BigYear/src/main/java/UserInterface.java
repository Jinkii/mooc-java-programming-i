
import java.util.ArrayList;
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

    private ArrayList<Bird> birds;

    public UserInterface() {
        this.birds = new ArrayList<>();
    }

    public void commands(Scanner scan) {

        while (true) {
            System.out.println("?");
            String command = scan.nextLine();
            if (command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
                Bird bird = new Bird();
                System.out.println("Name: ");
                String name = scan.nextLine();
                bird.setName(name);
                System.out.println("Name in Latin: ");
                String latinName = scan.nextLine();
                bird.setLatinName(latinName);
                birds.add(bird);
            } else if (command.equals("Observation")) {
                System.out.println("Bird? ");
                String birdName = scan.nextLine();
                for (Bird b : birds) {
                    if (b.getName().equalsIgnoreCase(birdName)) {
                        b.setObservation(b.getObservation() + 1);
                    } else {
                        System.out.println("Not a bird!");
                    }
                }
            } else if (command.equals("All")) {
                for (Bird b : birds) {
                    System.out.println(b.toString());
                }
            } else if (command.equals("One")) {
                System.out.println("Bird? ");
                String birdName = scan.nextLine();
                for (Bird b : birds) {
                    if (b.getName().equalsIgnoreCase(birdName)) {
                        System.out.println(b);
                    } else {
                        System.out.println("Not a bird!");
                    }
                }
            }
        }

    }
}
