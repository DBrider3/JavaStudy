package week04.ex01;

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
        this.customerID = customerID;
        this.customerName = customerName;
    }
    /*
    * Method Part
    */

    public String showCustomerInfo() {
        return customerName + "님의 등급은 SILVER이며, 보너스 포인트는 " + bonusPoint + "입니다.";
    }
    public int calcPrice(int price) {
        bonusPoint += price * 0.01;
        return (price);
    }
}
