

public class Checker {
    
    private String string;
    
    public Checker (String string) {
        this.string = string;
    }
    public Checker() {
        
    }
    
    public boolean isDayOfWeek(String string) {
        return (string.matches("mon|tue|wed|thu|fri|sat|sun"));
    }
    
    public void print() {
        if (this.timeOfDay(string)) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }  
    }
    
    public boolean allVowels(String string) {
        String regex = "[aeiou]+";
        return (string.matches(regex));
    }
    
    public boolean timeOfDay(String string) {
        
        String[] parts = string.split(":");
        if (parts.length < 3) {
            return false;
        }
        return (parts[0].matches("[01][0-9]|2[0-3]") && parts[1].matches("[0-5][0-9]") && parts[2].matches("[0-5][0-9]"));  
}
