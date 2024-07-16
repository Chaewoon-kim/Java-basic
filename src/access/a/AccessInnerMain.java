package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        //public
        data.publicField = 1;
        data.publicMethod();

        //default -> 같은 패키지 내에서 호출 가능
        data.defaultField = 2;
        data.defaultMethod();

        //private -> 호출 불가
        /*data.privateField = 3;
        data.privateMethod();*/

        data.innerAccess();
    }
}
