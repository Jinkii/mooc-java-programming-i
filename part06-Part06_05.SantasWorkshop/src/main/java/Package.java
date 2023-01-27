
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
public class Package {
    
    private ArrayList<Gift> packages;
    
    public Package() {
        packages = new ArrayList<Gift>();
    }
    
    public void addGift(Gift gift) {
        packages.add(gift);
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for(Gift g : packages) {
            totalWeight += g.getWeight();
        }
        
        return totalWeight;
    }
}
