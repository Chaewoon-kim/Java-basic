package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter){
        nameField = nameParameter;
        //this 생략 , 가장 가까운 지역변수에 없고 멤버 변수에느 있기 때문에 생략이 가능
    }
}
