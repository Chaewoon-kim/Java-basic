package extends1.ex3;

public class Car {
    //부모 클래스
    public void move(){
        System.out.println("차를 이동합니다.");}


    //추가 코드 , 자식들은 해당 코드를 물려받게 됨.
    public void openDoor(){
        System.out.println("문을 엽니다.");
    }
}
