package backendlecture.Chapter3.ch03;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setCustomerName("최성욱");
        customer.setCustomerID(220411);
        customer.bonusPoint = 1000;
        System.out.println(customer.showCustomerInfo());

        VipCustomer vipCustomer = new VipCustomer();
        vipCustomer.setCustomerName("김유신");
        vipCustomer.setCustomerID(123456);
        vipCustomer.bonusPoint = 50000;
        System.out.println(vipCustomer.showCustomerInfo());
    }
}
