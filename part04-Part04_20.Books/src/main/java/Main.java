import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        List<Book> books = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Title: ");
            String title = scan.nextLine();
            if(title.isEmpty()) {
                System.out.println(" ");
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scan.nextLine());
            System.out.println("Publication year: ");
            int year = Integer.valueOf(scan.nextLine());
            books.add(new Book(title, pages, year));         
        }
        System.out.println("What information will be printed? ");
        String info = scan.nextLine();
        if(info.equalsIgnoreCase("everything")){
            books.forEach(b -> {
                System.out.println(b.toString());
            });
        }
        else if (info.equalsIgnoreCase("name")) {
            books.forEach(b -> {
                System.out.println(b.getTitle());
            });
        }
    }
}
