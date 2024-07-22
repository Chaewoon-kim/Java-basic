package poly.car1;

public interface Car {
    //기능과 역할을 분리시켜 클라이언트의 코드 변경 없이 구현 객체를 변경할 수 있다.
    void startEngine();
    void offEngine();
    void pressAccelerator();
}
