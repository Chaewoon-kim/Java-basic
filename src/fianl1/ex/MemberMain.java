package fianl1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myId", "KCW");
        member.print();
        member.changeData("myId2","Seo"); //id는 fianl 변수 이기 때문에 다른 아이디를 설정해도 변경되지 않음
        member.print();
    }
}
