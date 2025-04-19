/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matea
 */
public class Dog extends Animal implements NoiseCapable {
    
    String name;
    
    public Dog (String name) {
        super(name);
    }
    
    public Dog() {
        this("Dog");
    }
    
    public void bark() {
        System.out.println(super.name + " barks");
    }
       
    public void makeNoise() {
        this.bark();
    }
}
