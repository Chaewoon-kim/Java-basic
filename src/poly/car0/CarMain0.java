package poly.car0;

public class CarMain0 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();
        driver.setK3Car(k3Car);
        driver.drive();

        //추가
        Model3Car model3Car = new Model3Car();
        driver.setK3Car(null); //k3Car를 null 값으로 만들어줌
        driver.setModel3Car(model3Car);
        driver.drive();
        //drive메서드를 호출하면? -> k3Car메서드가 null 이기 때문에 model3Car 메서드 호출
    }
}
