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
import java.util.Collections;
import java.util.Iterator;
import java.util.Comparator;
public class Hand implements Comparable<Hand>{
    
    private ArrayList<Card> cards;
    
    public Hand(){
        this.cards = new ArrayList<>();
    }
    
    public void add(Card card) {
        this.cards.add(card);
    }
    
    public void print() {
        Iterator<Card> iterator = cards.iterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    public void sort() {
        Comparator <Card> comparator = Comparator
                .comparing(Card::getValue)
                .thenComparing(Card::getSuit);
        
        Collections.sort(cards, comparator);
    }
    
    public int sum() {
        int totalValue = 0;
        for (Card card : this.cards) {
            totalValue += card.getValue();
        }
        return totalValue;
    }
    
    public int compareTo(Hand hand) {
        return this.sum() - hand.sum();
    }

    public void sortBySuit(){
        Collections.sort(cards, new BySuitInValueOrder());
    }
}
