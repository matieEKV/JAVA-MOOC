
import java.util.ArrayList;

public class Suitcase {

    private int maximumWeight;
    private ArrayList<Item> Items;

    public Suitcase(int maximumWeight) {
        this.Items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item Item) {
        if (this.totalWeight() + Item.getWeight() > this.maximumWeight) {
            return;
        }

        this.Items.add(Item);
    }

    public int totalWeight() {
        
        int sum = Items.stream() 
                .map(item -> item.getWeight())
                .reduce(0, (previousSum, value) -> previousSum + value);
                
        return sum;
    }

    public void printItems() {
        Items.stream()
                .forEach(item -> System.out.println(item));
    }

    public Item heaviestItem() {
        if (this.Items.isEmpty()) {
            return null;
        }

        //We will get to know the organization a little later in the course
        return this.Items.stream().max((t1, t2) -> t1.getWeight() - t2.getWeight()).get();
    }

    @Override
    public String toString() {
        if (this.Items.isEmpty()) {
            return "no items (0 kg)";
        }

        if (this.Items.size() == 1) {
            return "1 item (" + this.totalWeight() + " kg)";
        }

        return this.Items.size() + " items (" + this.totalWeight() + " kg)";
    }
}
