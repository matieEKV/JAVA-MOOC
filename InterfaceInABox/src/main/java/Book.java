/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matea
 */
public class Book implements Packable {
    
    String name;
    String author;
    double weight;
    
    public Book (String name, String author, double weight) {
        this.author = author;
        this.name = name;
        this.weight = weight;
    }
    
    public double weight() {
        return this.weight;
    }
    
    public String toString() {
        return this.name + ": " + this.author;
    }
}
