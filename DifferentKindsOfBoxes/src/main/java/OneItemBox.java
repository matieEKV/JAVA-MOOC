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
public class OneItemBox extends Box{
    
    private ArrayList<Item> items;
    
    public OneItemBox() {
        this.items = new ArrayList<>();
    }
    
    public void add(Item item) {
        if (this.items.isEmpty()) {
            this.items.add(item);
        }
    }
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
}
