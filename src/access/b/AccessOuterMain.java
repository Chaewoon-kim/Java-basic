package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        //public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        //default -> 같은 패키지가 아니기 때문에 호출 불가

        //private 호출 불가

        data.innerAccess();
    }
}
