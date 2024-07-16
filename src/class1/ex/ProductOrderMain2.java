package class1.ex;


public class ProductOrderMain2 {
    public static void main(String[] args) {
        //Q. 코드를 리팩토링 해주세요.

        ProductOrder[] orders = new ProductOrder[3];

        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("김치", 5000, 1);
        orders[2] = createOrder("콜라", 1500, 2);


        printOrders(orders); //2번 메서드
        int totalAmount = getTotalAmount(orders);//3번 메서드
        System.out.println("총 결제 금액: " + totalAmount);
    }
    //1. 매개변수로 초기값 설정 후 반환 메서드 (createOrder)
    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;

        return order;
    }
    //2. 배열을 받아서 배열에 들어있는 객체의 상품명, 가격, 수량 출력 메서드(printOrders)
    static void printOrders(ProductOrder [] orders){
        for(ProductOrder order : orders){
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }
    //3. 배열을 받아서 배열에 들어있는 전체 ProductOrder의 총 결제 금액을 계산하고, 반환(getTotalAmount)
    static int getTotalAmount(ProductOrder [] orders){
        int totalAmount = 0;
        for(ProductOrder order : orders){
            totalAmount += order.price * order.quantity; // 총 결제 금액
        }
        return totalAmount;
    }

}
