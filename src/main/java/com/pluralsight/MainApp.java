package com.pluralsight;
public class MainApp {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Hand hand1 = new Hand();

        Card card = new Card("Hearts", "A");
        deck.shuffle();

        Card c = deck.deal();
        c.flip();
        System.out.println(c);
        for(int i = 0; i < 5; i++) {

            Card cards = deck.deal();

            hand1.Deal(cards);
        }
        int handValue = hand1.getValue();
        System.out.println("This hand is worth " + handValue);

        Card nextCard;
        while((nextCard = deck.deal()) != null) {
            nextCard.flip();
            System.out.println(nextCard);
        }
    }

}

