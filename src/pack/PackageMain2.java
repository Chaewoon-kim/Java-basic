package pack;

import pack.a.*; // * -> 패키지에 있는 모든 클래스를 불러온다.

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data(); //같은 패키지에 위치할 때는 클래스 이름 불러다가 쓰면 댐.
        User user = new User(); //import 사용으로 패키지 명 생략 가능.


    }
}
