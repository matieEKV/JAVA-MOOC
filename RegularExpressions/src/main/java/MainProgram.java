
import java.util.Scanner;
public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        
        Checker string = new Checker(input);
        string.timeOfDay(input);
        string.print();
    }
}
