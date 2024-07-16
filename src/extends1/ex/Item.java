package extends1.ex;

public class Item {
    //부모 클래스
    private String name;
    private int price;

    public Item(String name, int price){
        this.name = name;
        this.price = price;

    }

    public int getPrice(){
        return price;
    }
    public void print(){
        System.out.println("이름: " + name + ", 가격: " + price);
    }
}
