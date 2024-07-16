package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        //자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> child");
        System.out.println("value = " + child.value);  //child
        child.method(); //Child method()

        //부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent -> parent");
        System.out.println("value = " + parent.value);
        parent.method();

        //부모 변수가 자식 인스턴스 참조 (다형적 참조)
        Parent poly = new Child();
        System.out.println("Parent -> child");
        System.out.println("value = " + poly.value);
        poly.method();//변수는 오버라이딩이 안되지만 메서드는 오버라이딩 됐음
        //자식 타입에서 오버라이딩 한게 있을 때는 부모 메서드보다 항상 우선권을 가짐. 


    }
}
