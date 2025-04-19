/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matea
 */
import java.util.ArrayList;
public class Box implements Packable{
    private double maxCapacity;
    private ArrayList<Packable> box;
    public Box (double maximumCapacity) {
        this.maxCapacity = maximumCapacity;
        this.box = new ArrayList<>();
    }
    
    public void add(Packable packable) {
        if (this.weight() + packable.weight() <= this.maxCapacity) {
            this.box.add(packable);
        }
    }
    
    public double weight() {
        double totalWeight = 0;
        for (Packable item : this.box) {
            totalWeight += item.weight();
        }  
        return totalWeight;
    }
    
    
    public String toString() {
        return "Box: " + this.box.size() + " items, total weight " + this.weight() + " kg";
    }
}
