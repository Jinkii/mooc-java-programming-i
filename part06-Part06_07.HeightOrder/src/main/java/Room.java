
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
public class Room {

    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        persons.add(person);
    }

    public boolean isEmpty() {
        if (persons.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public Person shortest() {
        Person shortest = new Person("", Integer.MAX_VALUE);
        if (!(persons.isEmpty())) {

            for (int i = 0; i < persons.size(); i++) {
                if (persons.get(i).getHeight() < shortest.getHeight()) {
                    shortest = persons.get(i);
                }
            }

            return shortest;
        }
        else {
            shortest = null;
        }
        return shortest;
    }
    
    public Person take() {
        try {
            return shortest();
        }
        finally {
            persons.remove(shortest());
        }
    }
}
