package week04.ex03;

public class VIPCustomer extends Customer {
    private int callNum;
    /*
     * Constructor Part
     */
    public VIPCustomer(int customerID, String customerName, int callNum) {
        super(customerID, customerName);
        this.callNum = callNum;
    }
    /*
     * Method Part
     */
    @Override
    public String showCustomerInfo() {
        return customerName + " 님의 등급은 VIP이며, 보너스 포인트는 " + bonusPoint + "입니다. 담당 상담원 번호는 " + callNum + "입니다.";
    }
    @Override
    public void calcPrice(int price) {
        bonusPoint += price * 0.05;
        System.out.println(customerName + " 님이 " + (price - (int)(price * 0.1)) + "원 지불하셨습니다.");
        System.out.println(customerName + " 님이 현재 보너스 포인트는 " + bonusPoint + "점입니다.");
    }
}
