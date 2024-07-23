package review;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        ProductOrder1 [] orders = new ProductOrder1[3];
        orders[0] = createOrder("두부" , 2000,2);
        orders[1] = createOrder("김치", 5000,1);
        orders[2] = createOrder("콜라",1500,2);

        printOrders(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + totalAmount);



    }
    //ProductOrder 생성 -> 매개변수로 초기값 설정
    static ProductOrder1 createOrder(String productName, int price, int quantity){
        ProductOrder1 Orderd = new ProductOrder1();
        Orderd.productName = productName;
        Orderd.price = price;
        Orderd.quantity = quantity;

        return Orderd;
    }
    //배열을 받아 배열에 들어있는 전체의 상품명 가격 수량 출력 메서드
    static void printOrders(ProductOrder1[] orders){
        for(ProductOrder1 order1 : orders){
            System.out.println("상품명: " + order1.productName + ", 가격: " + order1.price + ", 수량: " + order1.quantity);
        }
    }

    //배열을 받아서 배열에 들어있는 전체 ProductOrder1의 총 결제 금액 계산 , 결과 반환
    static int getTotalAmount(ProductOrder1 [] orders){
        int totalAmount = 0;
        for(ProductOrder1 order1 : orders){
            totalAmount += order1.price * order1.quantity;
        }
        return totalAmount;
    }
}
