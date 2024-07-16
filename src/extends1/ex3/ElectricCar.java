package extends1.ex3;

public class ElectricCar extends Car {
    // 자식 클래스 extends 부모클래스
    // 자바에서는 다중 상속을 허용하지 않음.
    // 하나의 부모가 여러 자식을 두는 것은 가능하지만, 하나의 자식이 여러 부모를 둘 수는 없음

    public void charge(){
        System.out.println("차를 충전합니다.");
    }
}
