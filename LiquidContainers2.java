
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.print("> ");
            
            System.out.println("First: " + firstContainer.toString() + "\nSecond: " + secondContainer.toString() );

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equals("add")) {
                firstContainer.add(amount);
            }
            else if (command.equals("move")) {
                int first = firstContainer.contains();
                if (first < amount) {
                    amount = first; 
                }
                secondContainer.add(amount);
                firstContainer.remove(amount);
            }
            else if (command.equals("remove")) {
                secondContainer.remove(amount);
            }
        }
    }
}
