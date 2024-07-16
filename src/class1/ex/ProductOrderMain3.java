package class1.ex;


import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        //Q. 코드를 리팩토링 해주세요. (이번엔 사용자에게 입력)
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int num = scanner.nextInt();
        ProductOrder[] orders = new ProductOrder[num]; //입력 받은 만큼 상품 배열 (생성)

        //반복문을 돌리면서 상품명, 가격, 수량 입력 받기
        for(int i = 0 ; i < orders.length; i++){
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            String productName = scanner.nextLine();
            scanner.nextLine(); // 개행 문자 제거

            System.out.print("가격: ");
            int price = scanner.nextInt();

            System.out.print("수량: ");
            int quantity = scanner.nextInt();

            //상품 정보 배열에 (저장)
            orders[i] = createOrder(productName,price,quantity);
        }
        //정보 출력
        printOrders(orders);

        //총 가격 정보 출력
        int totalAmount = getTotalAmount(orders);
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
