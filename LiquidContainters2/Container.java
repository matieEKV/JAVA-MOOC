/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matea
 */
public class Container {
    
    private int container;
    
    public Container () {
        this.container = 0;
    }
    public void add(int amount) {
        if (this.container + amount <= 100 && amount > 0) {
            this.container += amount;
        } else if (this.container + amount > 100) {
            this.container = 100; 
        } 
    }
    public int contains() {
        
        return this.container;
    }
    
    public void remove(int amount) {
        if (this.container - amount >= 0 && amount > 0) {
            this.container -= amount;
        } else if (this.container - amount < 0) {
            this.container = 0;
        }
    }
    
    public String toString() {
        return this.container + "/100";
    }
}
