package extends1.ex1;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();

        //move()라는 공통 기능이 있음.
        //-> 전기차와 가솔린차를 포괄하는 Car (부모 클래스)를 만들어 move()메서드를 담아줌.

    }
}
