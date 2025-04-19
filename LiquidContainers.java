
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int firstContainer = 0;
        int secondContainer = 0;
        
        while (true) {
            System.out.print("> ");
            System.out.println("First: " + firstContainer + "/100\nSecond: " + secondContainer + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equals("add")) {
                if (firstContainer + amount <= 100 && amount > 0) {
                    firstContainer += amount;
                } else if (firstContainer + amount > 100) {
                    firstContainer = 100; 
                } 
            }
            else if (command.equals("move")) {
                if (firstContainer > 0 && amount > 0 && secondContainer + amount <= 100) {
                    
                    if (firstContainer - amount < 0) {
                        secondContainer += firstContainer;
                        firstContainer = 0;
                    } else {
                        firstContainer -= amount;
                        secondContainer += amount;
                    }
                } else if (secondContainer + amount > 100) {
                    secondContainer = 100;
                }
            }
            else if (command.equals("remove")) {
                if (secondContainer - amount >= 0 && amount > 0) {
                    secondContainer -= amount;
                } else if (secondContainer - amount < 0) {
                secondContainer = 0;
                System.out.println("test less than zero");
                }
            }
            
            //System.out.println("First: " + firstContainer + "/100\nSecond: " + secondContainer + "/100");
            

        }
    }

}
