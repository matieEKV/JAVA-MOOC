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
import java.util.Set;
public class Warehouse {
    
    private Map<String, Integer> warehouse;
    private Map<String, Integer> stockBalance;
    public Warehouse() {
        this.warehouse = new HashMap<>();
        this.stockBalance = new HashMap<>();
    }
    public void addProduct(String product, int price, int stock) {
        this.warehouse.put(product, price);
        this.stockBalance.put(product, stock);
    }
    
    public int price(String product) {
        
        if (!this.warehouse.containsKey(product)) {
            return -99;
        }
        return this.warehouse.get(product);
    }
    
    public int stock(String product) {
        if (!this.stockBalance.containsKey(product)) {
            return 0;
        }
        return this.stockBalance.get(product);
    }
    
    public boolean take(String product) {
        
        if (!this.stockBalance.containsKey(product)) {
            return false;
        }
        if (this.stockBalance.get(product) > 0 ) {
            this.stockBalance.put(product, this.stockBalance.get(product)-1);
            return true;
           
        }
        return false;
    }
    
    public Set<String> products() {
        return this.stockBalance.keySet();
    }
}
