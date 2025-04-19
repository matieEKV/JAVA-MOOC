/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matea
 */
public class Cat extends Animal implements NoiseCapable {
    
    String name;
    
    public Cat (String name) {
        super(name);
    }
    
    public Cat() {
        this("Cat");
    }
    public void purr() {
        System.out.println(super.name + " purrs");
    }
        
    public void makeNoise() {
        this.purr();
    }
}
