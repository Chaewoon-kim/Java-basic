package extends1.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call(){
        publicValue = 1;
        protectedValue = 1; //상속 관계 or 같은 패키지이기 때문에 가능
        //defaultValue = 1; 다른 패키지에 있기 때문에 접근 불가, 컴파일 오류
        //privateValue = 1; 접근 불가, 컴파일 오류

        publicMethod();
        protectedMethod(); //상속 관계 or 같은 패키지 내
        //defaultMethod(); 같은 이유로 다른 패키지에 있기 때문에 접근 불가
        //privateMethod();

        printParent();
    }
}
