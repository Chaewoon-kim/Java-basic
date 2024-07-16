package ref;

public class initMain {
    public static void main(String[] args) {
        InitData data = new InitData();
        System.out.println("value1 = " + data.value1); //자동 초기화 int = 0
        System.out.println("value2 = " + data.value2);
    }
}
