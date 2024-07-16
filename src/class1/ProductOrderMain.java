package class1;

public class ProductOrderMain {
    public static void main(String[]args){
        ProductOrder admin1 = new ProductOrder();
        admin1.productName = "두부";
        admin1.price = 2000;
        admin1.quantity = 2;

        ProductOrder admin2 = new ProductOrder();
        admin2.productName = "김치";
        admin2.price = 5000;
        admin2.quantity = 1;

        ProductOrder admin3 = new ProductOrder();
        admin3.productName = "콜라";
        admin3.price = 1500;
        admin3.quantity = 2;

        ProductOrder [] adminAll = {admin1 , admin2, admin3};

        int totalAmount = 0; //총 결제 금액을 위한 변수 초기화
        for (ProductOrder s : adminAll) {
            System.out.println("상품명: " + s.productName + ", 가격: " + s.price + ", 수량: "+ s.quantity);
             totalAmount += s.price * s.quantity;
        }
        System.out.println("총 결제 금액: " + totalAmount);
    }
}
