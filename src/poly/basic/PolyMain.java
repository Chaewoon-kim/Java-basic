package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        //부모 변수가 부모 인스턴스 호출
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        //자식 변수가 자식 인스턴스 호출
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod(); //extends
        child.childMethod();

        //*부모 변수가 자식 인스턴스 참조 (다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child(); //부모 타입은 자식을 참조할 수 있음
        poly.parentMethod();
        //poly.childMethod();
        // 자식의 기능은 호출할 수 없음, 상속에서 부모 -> 자식 찾아 내려갈 수 없음. 여기서 poly의 타입은 Parent.

        //자식 타입은 부모를 참조할 수 없음
        //Child child1 = new Parent(); 타입이 맞지 않음

    }
}
