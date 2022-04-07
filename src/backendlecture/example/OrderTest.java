package backendlecture.example;

public class OrderTest {
    public static void main(String[] args) {

        Order order = new Order("202011020003", "01023450001",
                "인천시 서구 석남동", "20220406", "35000", "0003", "170307");

        System.out.println(order.showOrderNumber());
        System.out.println(order.showShopperPhoneNumber());
        System.out.println(order.showAddress());
        System.out.println(order.showOrderDate());
        System.out.println(order.showOrderTime());
        System.out.println(order.showOrderPrice());
        System.out.println(order.showMenuNumber());
    }
}
