package extends1.overriding;

public class CarMain {
    public static void main(String[] args) {
        //외부에서 봤을 때는 하나의 인스턴스만 생성된 걸로 볼 수있지만 내부를 뜯어보면 자식 뿐만 아니라 부모의 메서드도 들어있음
        //메서드를 호출 할 때는 호출하는 변수의 타입을 기준으로 선택
        //이때 호출하는 변수의 타입에 메서드가 없을 때는 2. 부모 타입에서 찾게 됨
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();  //자식에서 move()메서드를 오버라이딩했기 때문에 해당 메서드는 자식 메서드에서 나온 것.

        GasCar gasCar = new GasCar();
        gasCar.move();

    }
}
