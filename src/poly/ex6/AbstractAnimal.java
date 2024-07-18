package poly.ex6;

//하나의 추상 메서드와 실행 가능 메서드 -> 자식은 sound 메서드 반드시 기능 구현.
public abstract class AbstractAnimal {
    public abstract void sound();
    public void move(){
        System.out.println("동물이 이동합니다.");
    }

}
