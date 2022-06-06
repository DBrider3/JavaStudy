package week04.ex03;

public class Customer {
    /*
     * Property Part
     */
    protected int customerID;
    protected String customerName;
    int bonusPoint;
    /*
    * Constructor Part
    */
    public Customer() {}
    public Customer(int customerID, String customerName) {
        bonusPoint = 0;
        this.customerID = customerID;
        this.customerName = customerName;
    }
    /*
    * Method Part
    */

    public String showCustomerInfo() {
        return customerName + " 님의 등급은 SILVER이며, 보너스 포인트는 " + bonusPoint + "입니다.";
    }
    public void calcPrice(int price) {
        bonusPoint += price * 0.01;
        System.out.println(customerName + " 님이 " + price + "원 지불하셨습니다.");
        System.out.println(customerName + " 님이 현재 보너스 포인트는 " + bonusPoint + "점입니다.");
    }
}
