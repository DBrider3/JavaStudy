package week04.ex01;

public class VIPCustomer extends Customer {
    /*
     * Constructor Part
     */
    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);
    }
    /*
     * Method Part
     */
    @Override
    public String showCustomerInfo() {
        return customerName + "님의 등급은 VIP이며, 보너스 포인트는 " + bonusPoint + "입니다.";
    }
    @Override
    public int calcPrice(int price) {
        bonusPoint += price * 0.05;
        return price - (int)(price * 0.1);
    }
}
