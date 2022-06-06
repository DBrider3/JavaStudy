package week04.ex00;

public class Customer {
    /*
     * Property Part
     */

//    [version1], overriding, protected, super
    protected int customerID;
    protected String customerName;

//    [version 2], private, setter
//    private int customerID;
//    private String customerGrade;

//     common
    int bonusPoint;

    /*
    * Constructor Part
    */

    public Customer() {}
    public Customer(int customerID, String customerName) {
//        [version 2], private, setter
//        customerGrade = "SILVER";

//        common
        this.customerID = customerID;
        this.customerName = customerName;
    }
    /*
    * Method Part
    */

//     [version 2], private, setter
//    public void setCustomerGrade(String customerGrade) {
//        this.customerGrade = customerGrade;
//    }

//    common

    public String showCustomerInfo() {
//    version1, overriding, protected, super
        return customerName + "님의 등급은 SILVER이며, 보너스 포인트는 " + bonusPoint + "입니다.";
//        [version 2], private, setter
//        return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
    }
}
