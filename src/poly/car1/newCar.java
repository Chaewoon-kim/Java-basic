package poly.car1;

public class newCar implements Car{
    @Override
    public void startEngine() {
        System.out.println("newCar.startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("newCar.offEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("newCar.pressAccelerator");
    }
}
