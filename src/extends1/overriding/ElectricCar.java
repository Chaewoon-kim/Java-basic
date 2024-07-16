package extends1.overriding;

public class ElectricCar extends Car {
    // 자식 클래스 extends 부모클래스
    // 자바에서는 다중 상속을 허용하지 않음.
    // 하나의 부모가 여러 자식을 두는 것은 가능하지만, 하나의 자식이 여러 부모를 둘 수는 없음

    //부모의 기능에 있는 move() 메서드를 자식이 재정의하는 것을 오버라이딩이라한다.
    //메서드 이름은 같지만 새로운 기능을 사용하고 싶을 때.
    @Override/*애노테이션(=주석), 주석이긴 하지만 프로그램이 읽을 수 있음,없어도 동작하는데 문제 없지만 오류 찾는데에 있어 유용함*/
    public void move(){
        System.out.println("전기차를 빠르게 이동합니다.");
    }


    public void charge(){
        System.out.println("차를 충전합니다.");

    }


}
