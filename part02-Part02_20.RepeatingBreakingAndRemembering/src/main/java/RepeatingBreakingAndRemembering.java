
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        
        int numbers;
        int sum = 0;
        int count = 0;
        int odd = 0;
        int even = 0;
        double average;
        while(true){
            numbers = Integer.valueOf(scanner.nextLine());
            if(numbers == -1){
                break;
            }
            
            if(numbers%2==0){
                even++;
            } else {
                odd++;
            }
            count++;
            sum = sum + numbers;
        }
        average = (double)sum/count;
        System.out.println("Thx! Bye");
        System.out.println("Sum:" + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average:" + average);
        System.out.println("Even:" + even);
        System.out.println("Odd:" + odd);

    }
}
