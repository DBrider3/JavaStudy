package week04.ex00;

public class VIPCustomer extends Customer {
    /*
     * Constructor Part
     */

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);
//        [version 2], private, setter
//        setCustomerGrade("VIP");
    }
    /*
     * Method Part
     */

//    [version1], overriding, protected, super
    @Override
    public String showCustomerInfo() {
        return customerName + "님의 등급은 VIP이며, 보너스 포인트는 " + bonusPoint + "입니다.";
    }
}
