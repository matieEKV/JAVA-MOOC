
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        
        while (true) {
            int row = Integer.valueOf(scanner.nextLine());
            if (row == -1) {
                break;
            }
            numbers.add(row);
        }
        System.out.println(positive(numbers));
        
    }
    
    public static List<Integer> positive(List<Integer> numbers) {
        
        List<Integer> positives = numbers.stream()
            .filter(positive -> positive > 0)
            .collect(Collectors.toCollection(ArrayList::new));
//            .collect(Collectors.toList());
        
        return positives;
           
    }

}
