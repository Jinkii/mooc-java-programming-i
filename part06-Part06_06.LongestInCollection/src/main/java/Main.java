
public class Main {

    public static void main(String[] args) {


        // Try out your class here
        SimpleCollection c = new SimpleCollection("characters");
        System.out.println("Pisin: " + c.longest());
        
        c.add("one");
        c.add("two");
        c.add("three");
        
        System.out.println("Longest: " + c.longest());

        
    }
}
