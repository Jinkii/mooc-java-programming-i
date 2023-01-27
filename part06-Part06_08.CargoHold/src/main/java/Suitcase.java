
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jinki
 */
public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;
    private int currentWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
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

    
    
    public void addItem(Item item) {
        if (!((this.currentWeight + item.getWeight()) > maxWeight)) {
            this.currentWeight += item.getWeight();
            this.items.add(item);
        }

    }

    public void printItems() {
        for (Item i : items) {
            System.out.println(i.toString());
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item i : items) {
            totalWeight += i.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem() {
        if (!(items.isEmpty())) {
            Item heaviest = new Item("", Integer.MIN_VALUE);
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).getWeight() > heaviest.getWeight()) {
                    heaviest = items.get(i);
                }
            }
            return heaviest;
        }
        return null;
    }

    @Override
    public String toString() {
        if (items.size() <= 0) {
            return "no items (" + currentWeight + " kg)";
        } else if (items.size() == 1) {
            return items.size() + " item (" + currentWeight + " kg)";
        } else {
            return items.size() + " items (" + currentWeight + " kg)";
        }
    }

}
