package extends1.overriding;

public class GasCar extends Car {
    public void fillUp(){
        System.out.println("기름을 충전합니다.");
    }

    //extends 키워드를 사용해 부모의 코드도 사용 가능
}