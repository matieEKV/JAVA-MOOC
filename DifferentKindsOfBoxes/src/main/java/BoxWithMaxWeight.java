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
public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    
    public void add(Item item) {
        int weight = item.getWeight();
        this.capacity -= weight;
        if (capacity >= 0 | weight == 0) {
            this.items.add(item);
            //this.capacity -= weight;
            //super.add(items);
        }
    }
    
    public boolean isInBox(Item item) {
        if (this.items.contains(item)) {
            return true;
        }
        
        return false;
    }
}
