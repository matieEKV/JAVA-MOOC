
import java.util.HashMap;

public class Program {
    
    public static void printKeys(HashMap<String,String> hashmap) {
        
        for (String element : hashmap.keySet()) {
            System.out.println(element);
        }
    }
    
    public static void printKeysWhere(HashMap<String,String> hashmap, String text) {
        
        for (String element : hashmap.keySet()) {
            if (element.contains(text)) {
                System.out.println(element);
            }   
        }
    }
    
    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text) {
        
        for (String element : hashmap.keySet()) {
            if (element.contains(text)) {
                System.out.println(hashmap.get(element));
            }  
        } 
    }
    
    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
    }
}
