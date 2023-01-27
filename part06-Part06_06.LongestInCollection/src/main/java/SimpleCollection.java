
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest() {
        String longest = null;
        if (!(elements.isEmpty())) {
            for (int i = 0; i < elements.size() - 1; i++) {
                if (elements.get(i).length() < elements.get(i + 1).length()) {
                    longest = elements.get(i+1);
                }
            }
        }
        return longest;
    }

}
