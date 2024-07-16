package construct;

public class MemberDefault {
    String name;

    //생성자가 하나도 없으므로 자바는 자동으로 기본 생성자 만들어줌
    MemberDefault(){
        System.out.println("생성자 호출");
    }
}
