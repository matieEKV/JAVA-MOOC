

public class Main {

    public static void main(String[] args) {
        Hand hand = new Hand();
        hand.add( new Card(12,Suit.HEART) ); 
        hand.add( new Card(14,Suit.DIAMOND) ); 
        hand.add( new Card(2,Suit.SPADE) ); 
        hand.add( new Card(2,Suit.CLUB) ); 
        hand.sort();
        hand.print();
        hand.sortBySuit();
        hand.print();
       
    }

}
