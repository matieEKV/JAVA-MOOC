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
public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> vehicleRegistry;
    
    public VehicleRegistry() {
        this.vehicleRegistry = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if (!vehicleRegistry.containsKey(licensePlate)) {
            vehicleRegistry.put(licensePlate, owner);
            return true;
        }
        return false;
    }
    
    public String get(LicensePlate licensePlate) {
        if (vehicleRegistry.containsKey(licensePlate)) {
            return this.vehicleRegistry.get(licensePlate);
        }
        return null;
    }
    
    public boolean remove(LicensePlate licensePlate) {
        
        if (this.get(licensePlate) == null) {
            return false;
        }
        this.vehicleRegistry.remove(licensePlate);
        return true;
        
//        if (vehicleRegistry.containsKey(licensePlate)) {
//            this.vehicleRegistry.remove(licensePlate);
//            return true;
//        }
//        return false;
    }
    public void printLicensePlates() {
        //this.vehicleRegistry.keySet(); 
        for (LicensePlate plate : vehicleRegistry.keySet()) {
            System.out.println(plate);
        }
    }
    
    public void printOwners() {
        
        ArrayList<String> owners = new ArrayList<>();
        for (String owner : vehicleRegistry.values()) {
//            for (int i = 0; i < owners.size(); i++) {
//                if (owners.get(i) == owner) {
            if (!owners.contains(owner)) {
                owners.add(owner); 
            } 
        }
        for (String o : owners) {
            System.out.println(o);
        }
        
    }
}
