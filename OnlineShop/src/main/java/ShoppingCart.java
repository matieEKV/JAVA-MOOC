/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matea
 */
import java.util.Map;
import java.util.HashMap;
public class ShoppingCart {
    
    private Map<String, Item> items;
    
    public ShoppingCart() {
        this.items = new HashMap<>();
    }
    
    public void add(String product, int price) {
        if (this.items.containsKey(product)) {
            this.items.get(product).increaseQuantity();
        } else {
            Item item = new Item(product, 1, price);
            this.items.put(product, item);
        }
    }
    
    public int price() {
        int totalSum = 0;
        for (Item item : this.items.values()) {
           totalSum += item.price();
        }
        return totalSum;
    }
    
    public void print() {
        for (String item : items.keySet()) {
            System.out.println(items.get(item));
        }
    }
}
