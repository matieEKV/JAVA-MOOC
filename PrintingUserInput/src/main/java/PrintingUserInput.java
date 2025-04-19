
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputContainer = new ArrayList<>();
        
        while(true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            inputContainer.add(input);
        }
        
        String printAll = inputContainer.stream()
            .reduce("", (previousString, word) -> previousString + word + "\n");
        
        System.out.println(printAll);
    }
}
