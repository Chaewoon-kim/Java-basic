package construct;

public class memberInit {
    String name;
    int age;
    int grade;


    //추가 메서드
    void initMember(String name , int age , int grade){
        //this -> 자기 자신의 인스턴스
        //코드 블럭 내에 있는 매개변수가 우선순위
        //따라서 멤버 변수에 접근하려면 this 연산자 필요
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
