package week04.ex03;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10010, "이순신");
        Customer customerShin = new Customer(10020, "신사임당");
        Customer customerHong = new GOLDCustomer(10030, "홍길동");
        Customer customerLee2 = new GOLDCustomer(10040, "이율곡");
        Customer customerKim = new VIPCustomer(10050, "김유신", 12345);
        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(customerLee);
        customers.add(customerShin);
        customers.add(customerHong);
        customers.add(customerLee2);
        customers.add(customerKim);

        System.out.println("======= 고객 정보 출력 =======");
        for (Customer customer : customers) {
            System.out.println(customer.showCustomerInfo());
        }

        System.out.println("======= 할인율과 보너스 포인트 출력 =======");
        for (Customer customer : customers) {
            customer.calcPrice(10000);
        }
    }
}

