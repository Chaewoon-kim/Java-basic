package poly.ex3;

public  abstract  class AbstractAnimal {

    public abstract void sound(); //추상 메서드 -> 자식이 반드시 재정의

    public void move(){
        System.out.println("동물이 움직입니다.");
    }
    //추상 메서드는 바디가 없음. 그 말은 즉 호출 x
    //1. 추상 클래스 -> 부모 클래스는 제공하지만 인스턴스 존재 x
    //2. 추상 메서드 -> 상속 받는 자식 클래스가 [반드시 오버라이딩] 해서 사용.

}
