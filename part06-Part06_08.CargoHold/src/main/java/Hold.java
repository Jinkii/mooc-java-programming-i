
import java.util.ArrayList;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jinki
 */
public class Hold {

    private ArrayList<Suitcase> hold;
    private int maxWeight;
    private int currentWeight;

    public Hold(int maxWeight) {
        this.hold = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public ArrayList<Suitcase> getItems() {
        return hold;
    }

    public void setItems(ArrayList<Suitcase> hold) {
        this.hold = hold;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(int currentWeight) {
        this.currentWeight = currentWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (!((this.currentWeight + suitcase.getCurrentWeight()) > maxWeight)) {
            this.currentWeight += suitcase.getCurrentWeight();
            this.hold.add(suitcase);
        }
    }

    public void printItems() {
        for (Suitcase s : hold) {
            Iterator<Item> iterator = s.getItems().iterator();
            while (iterator.hasNext()) {
                Item item = iterator.next();
                System.out.println(item.toString());
            }
        }
    }

    @Override
    public String toString() {
        if (hold.size() <= 0) {
            return "no suitcases (" + currentWeight + " kg)";
        } else if (hold.size() == 1) {
            return hold.size() + " suitcase (" + currentWeight + " kg)";
        } else {
            return hold.size() + " suitcases (" + currentWeight + " kg)";
        }
    }

}
