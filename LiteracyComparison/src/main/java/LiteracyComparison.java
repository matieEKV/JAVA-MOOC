
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class LiteracyComparison {
    
    public static void main(String[] args) {
    
        ArrayList<CountryInfo> countryLiteracy = new ArrayList<>();
        
        try {
            Files.lines(Paths.get("literacy.csv"))
                .map(row -> row.trim())
                .map(row -> row.split(","))
                .map(parts -> new CountryInfo(parts[3], Integer.valueOf(parts[4]), parts[2], Double.valueOf(parts[5])))
                .forEach(row -> countryLiteracy.add(row));
            
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
            
        countryLiteracy.stream().sorted((l1, l2) -> {
            return Double.valueOf(l1.getLiteracy()).compareTo(l2.getLiteracy());
            }) .forEach(t -> System.out.println(t));
    }
}


