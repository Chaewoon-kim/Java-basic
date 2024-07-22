package poly.car1;



public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        //차량 선택
        K3Car k3Car = new K3Car();
        driver.setCar(k3Car); //Carcar = k3Car
        driver.drive(); //Car 타입이므로 부모 인스턴스에 먼저 접근하지만 오버라이딩 된 자식 메서드가 있기 때문에 k3Car에 대한 정보 출력

        //차량 변경 K3 -> model3
        Model3Car model3Car  = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();

        //차량 추가 newCar
        newCar newCar = new newCar();
        driver.setCar(newCar);
        driver.drive();
    }
}
