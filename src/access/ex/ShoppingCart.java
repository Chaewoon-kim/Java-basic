package access.ex;

public class ShoppingCart {
    private Item [] items = new Item[10];
    private int itemCount;

    //상품 추가 생성자
    public void addItem(Item item){
        if(itemCount >= items.length){
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }else{
            items[itemCount] = item;
            itemCount++;
        }
    }

    //상품 출력 메서드
    public void displayItems(){
        System.out.println("장바구니 상품 출력");
        for(int i = 0 ; i < itemCount; i++){
            Item item = items[i];
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice());
        }
        System.out.println("전체 가격 합: " + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for(int i = 0 ; i < itemCount; i++){
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }


}
