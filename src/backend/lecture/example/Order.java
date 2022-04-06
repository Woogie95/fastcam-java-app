package backend.lecture.example;

public class Order {

    public Order(String orderNumber, String shopperPhoneNumber, String address,
                 String orderDate, String orderPrice, String menuNumber, String orderTime) {

        this.orderNumber = orderNumber;
        this.shopperPhoneNumber = shopperPhoneNumber;
        this.address = address;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.orderPrice = orderPrice;
        this.menuNumber = menuNumber;

    }

    public String orderNumber;
    public String shopperPhoneNumber;
    public String address;
    public String orderDate;
    public String orderTime;
    public String orderPrice;
    public String menuNumber;

    public String showOrderNumber() {
        return "주문 접수 번호 : " + orderNumber;
    }

    public String showShopperPhoneNumber() {
        return "주문 핸드폰 번호 : " + shopperPhoneNumber;
    }

    public String showAddress() {
        return "주문 집 주소 : " + address;
    }

    public String showOrderDate() {
        return "주문 날짜 : " + orderDate;
    }

    public String showOrderTime() {
        return "주문 시간 : " + orderTime;
    }

    public String showOrderPrice() {
        return "주문 가격 : " + orderPrice;
    }

    public String showMenuNumber() {
        return "메뉴 번호 : " + menuNumber;
    }

}
