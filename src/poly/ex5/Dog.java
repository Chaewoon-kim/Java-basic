package poly.ex5;
//인터페이스를 상속받을 때는 구현해야 된다는 뜻으로 extends 대신 implements 키워드를 사용.
public class Dog implements InterfaceAnimal{
    @Override
    public void sound(){
        System.out.println("멍멍");
    }
    @Override
    public void move(){
        System.out.println("강아지 이동");
    }
}
