package static1;

public class Data3 {
    public String name;
    public static int count; //static -> static 변수 , 정적 변수 , 클래스 변수
    //static 변수는 메서드 영역에서 관리.

    //Data3 class 내에 있는 name과 count는 멤버 변수.
    //멤버 변수는 [static이 붙은 것]과 [아닌 것]으로 분류할 수 있음
    // 1. 인스턴스 변수
    //      -> [static이 붙지 않은 멤버변수]. (= 인스턴스 변수) , 인스턴스를 만들 때마다 새로 만들어진다.


    // 2. 클래스 변수
    //      -> [static이 붙은 멤버 변수]. (= 클래스 변수, 정적 변수 , static 변수), 인스턴스와 무관하게 클래스에 바로 접근 가능.
    //      -> 프로그램 시작 시 딱 1개 만들어짐. 보통 여러 곳에서 공유하는 목적으로 사용.


    public Data3(String name){
        this.name = name;
        count++; //원래는 Data3.count++ 인데 자신의 클래스 내의 정적 변수라면 생략 가능
    }
}
