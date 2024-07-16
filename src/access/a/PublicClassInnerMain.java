package access.a;

public class PublicClassInnerMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        //default 클래스 -> 같은 패키지에 있기 때문에 접근 가능
        DefaultClass class1 = new DefaultClass();
        DefaultClass2 class2 = new DefaultClass2();
    }
}
