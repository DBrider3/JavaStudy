package week04.ex03;

public class GOLDCustomer extends Customer{
    /*
     * Constructor Part
     */
    public GOLDCustomer(int customerID, String customerName) {
        super(customerID, customerName);
    }
    /*
     * Method Part
     */
    @Override
    public String showCustomerInfo() {
        return customerName + " 님의 등급은 GOLD이며, 보너스 포인트는 " + bonusPoint + "입니다.";
    }
    @Override
    public void calcPrice(int price) {
        bonusPoint += price * 0.02;
        System.out.println(customerName + " 님이 " + (price - (int)(price * 0.1)) + "원 지불하셨습니다.");
        System.out.println(customerName + " 님이 현재 보너스 포인트는 " + bonusPoint + "점입니다.");
    }
}
