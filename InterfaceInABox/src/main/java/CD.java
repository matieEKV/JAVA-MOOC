/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matea
 */
public class CD implements Packable {
    
    String artist;
    String nameOfCD;
    int publicationYear;
    
    public CD (String artist, String name, int year) {
        this.artist = artist; 
        this.nameOfCD = name;
        this.publicationYear = year;
    }
    
    public double weight () {
        return 0.1;
    }
    
    public String toString() {
        return this.artist + ": " + this.nameOfCD + " (" + this.publicationYear + ")";
    }
}
