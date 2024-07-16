package extends1.super1;

public class Child extends Parent{

    public String value = "child";

    @Override //hello 메서드 재정의
    public void hello(){
        System.out.println("Child.hello");
    }

    public void call(){
        System.out.println("this value = " + this.value); //this 생략가능
        System.out.println("super value = " + super.value); //super -> 부모에 있는 value

        hello();
        super.hello(); //super 연산자로 인해 부모에서 hello() 메서드 찾게 됨.
    }

}
