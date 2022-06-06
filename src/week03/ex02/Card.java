package week03.ex02;

public class Card {

    private static int cardNum = 10000;

    public int getCardNumber(){
        cardNum++;
        return cardNum;
    }
}
