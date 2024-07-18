package poly.ex6;

public class Bird extends AbstractAnimal implements Fly{

    //추상클래스 재정의
    @Override
    public void sound(){
        System.out.println("짹짹");
    }
    //인터페이스 구현
    @Override
    public void fly(){
        System.out.println("새 날기");
    }
}
