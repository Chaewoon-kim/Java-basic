package access.ex;

public class Item {
    private String name;
    private int price;
    private int quantity;

    //Item 생성자 -> 값 대입
    public Item(String name, int price ,int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName(){
        return name;
    }

    //총 합계 구하는 메서드.
    public int getTotalPrice(){
        return price * quantity;

    }


}
