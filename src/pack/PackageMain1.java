package pack;

import pack.a.User;

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data(); //같은 패키지에 위치할 때는 클래스 이름 불러다가 쓰면 댐.
        pack.a.User User = new pack.a.User(); //다른 패키지 -> 패키지명  +  클래스명

    }
}
