package access.ex;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("마늘" , 2000 , 2);
        Item item2 = new Item("상추" , 3000 , 4);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.displayItems();

        //Item 클래스 , ShoppingCart 클래스 , addItem 메서드 , displayItems 메서드 필요
    }
}
