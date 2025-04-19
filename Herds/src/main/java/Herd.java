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
public class Herd implements Movable{ 
    
    private ArrayList<Movable> members;
    
    public Herd () {
        this.members = new ArrayList<>();
    }
    public String toString() {
       String toPrint= "";
       for (Movable member : members) {
           toPrint = toPrint + member.toString() + "\n";
       }
       return toPrint;
    }
    
    public void addToHerd(Movable movable) {
        this.members.add(movable);
    }
    
    public void move(int dx, int dy) {
        for (Movable member :  members) {
            member.move(dx, dy);
        }
    }
}
