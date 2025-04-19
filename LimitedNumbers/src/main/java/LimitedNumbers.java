
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> input = new ArrayList<>();
        
        while(true) {
            int numbers = Integer.valueOf(scanner.nextLine());
            
            if (numbers < 0) {
                break;
            }
        
            input.add(numbers);
        }
        
        input.stream()
            .filter (value -> value >= 1 && value <= 5)
            .forEach(value -> System.out.println(value));
    }
}
