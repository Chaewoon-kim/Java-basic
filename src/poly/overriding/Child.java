package poly.overriding;

public class Child extends Parent{
    public String value = "child";


    @Override //메서드 재정의
    public void method() {
        System.out.println("Child method");
    }
}
