
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
public class Stack {
    
    ArrayList<String> stacks;
    
    public Stack() {
        this.stacks = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        if(stacks.isEmpty()){
            return true;
        }
        return false;
    }
    
    public void add(String value) {
        stacks.add(value);
    }
    
    public ArrayList<String> values() {
        return stacks;
    }
    
    public String take() {
        return stacks.remove(stacks.size() - 1);
    }
}
