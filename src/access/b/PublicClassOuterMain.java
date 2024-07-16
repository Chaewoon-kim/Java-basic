package access.b;

import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        //다른 클래스들은 default. 다른 패키지에 있기 때문에 접근 불가
    }
}
