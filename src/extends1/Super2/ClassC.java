package extends1.Super2;

public class ClassC extends ClassB{

    public ClassC(){
        super(10,20); //기본 생성자인 경우에만 super()생략 가능.
        System.out.println("ClassC 생성자");
    }
}
