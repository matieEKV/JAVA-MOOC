

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
public class mainProgram {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("First");
        names.add("Second");
        names.add("Third");

    System.out.println(returnSize(names));

    }
    
    static int returnSize (List<String> list) {
        return list.size();
    }
    
    // Implement here a method returnSize
    // which returns the size of the list given to it
    //as a parameter
}
