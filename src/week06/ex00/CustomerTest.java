package week06.ex00;

public class CustomerTest {
    public static void main(String[] args) {
        System.out.println("=====다중 상속 TEST=====");
        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.order();

        System.out.println("=====upcasting TEST=====");
        Buy buyer = new Customer();
        Sell seller = new Customer();

        buyer.buy();
        buyer.order();
        seller.sell();
        seller.order();
    }
}
