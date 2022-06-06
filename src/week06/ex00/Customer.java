package week06.ex00;

public class Customer implements Buy, Sell {

    @Override
    public void buy() {
        Buy.super.order();
    }

    @Override
    public void sell() {
        Sell.super.order();
    }

    @Override
    public void order() {
        System.out.println("주문을 하였습니다.");
    }
}
