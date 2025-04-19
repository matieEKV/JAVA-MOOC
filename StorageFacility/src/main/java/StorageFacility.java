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
import java.util.HashMap;
public class StorageFacility {
    
    private HashMap <String, ArrayList<String>> storageUnit;
    
    public StorageFacility() {
        this.storageUnit = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        this.storageUnit.putIfAbsent(unit, new ArrayList<>());
        this.storageUnit.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String unit) {
        ArrayList<String> item = this.storageUnit.get(unit);
        
        if (item != null) {
            return item;
        } 
        return new ArrayList<>();
    }
    
    public void remove(String storageUnit, String item) {
        
        ArrayList <String> items = this.storageUnit.get(storageUnit);
        
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).equals(item)) {
                items.remove(i);
                break;
            }
        }
        if (items.isEmpty()) {
            this.storageUnit.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits() {
        
       ArrayList <String> items = new ArrayList<>();
       for (String element : storageUnit.keySet()) {
           ArrayList <String> list = this.storageUnit.get(element);
           if (list.size() > 0) {
                items.add(element);
            }  
        }
       return items;
    }
}
