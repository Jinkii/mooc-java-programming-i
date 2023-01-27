
public class Main {

    public static void main(String[] args) {

        Message msg = new Message("Bob", "Hello, world!");
        MessagingService ms = new MessagingService();
        ms.add(msg);
        System.out.println(ms.getMessages());

    }
}
