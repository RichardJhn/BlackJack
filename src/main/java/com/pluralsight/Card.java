package com.pluralsight;
public class Card {
    private String suit;
    private String value;
    private boolean isFaceUp;
    int suitValue = 0;
    int cardValue = 0;
    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
        this.isFaceUp = false;
    }
    public String getSuit(){
// only return the suit if the card is face up
        return isFaceUp ? suit : "#";
    }
    public String getValue(){
// only return the value if the card is face up
        return (isFaceUp) ? value: "#";
    }
    public int getPointValue() {
// only return the value if the card is face up
        switch (value) {
            case "Ace":
                return 11;
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                return 5;
            case "6":
                return 6;
            case "7":
                return 7;
            case "8":
                return 8;
            case "9":
                return 9;
            case "10":
            case "Jack":
            case "Queen":
            case "King":
                return 10;
            default:
                System.out.println("Invalid!");
                break;
        }
        return cardValue;
    }
    public boolean isFaceUp(){
        return isFaceUp;
    }
    public void flip(){
        isFaceUp = !isFaceUp;
    }

    @Override
    public String toString() {
        if(isFaceUp){
            return "The " + value + " of " + suit;
        }
        else {
            return "The face down card";//
        }
        //return "Card{" +
                //"suit='" + suit + '\'' +
                //", value='" + value + '\'' +
                //", isFaceUp=" + isFaceUp +
                //", suitValue=" + suitValue +
                //", cardValue=" + cardValue +
                //'}';
    }
}

