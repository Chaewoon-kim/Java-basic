package poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        InterfaceA a = new Child(); //부모는 자식을 담을 수 있다.
        a.methodA(); //자식의 methodA()
        a.methodCommon(); //자식의 methodCommon()

        InterfaceB b = new Child();
        b.methodB(); //InterfaceB에 먼저 갔다가 오버라이딩 된 Child클래스에 가서 그 메서드 호출
        b.methodCommon();
    }
}
