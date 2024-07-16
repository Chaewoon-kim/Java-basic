package construct;

public class MemberConsturct {
    String name ;
    int age;
    int grade;

    //추가
    MemberConsturct(String name, int age){
        this(name, age, 50); //this()활용 -> 생성자 내부에서 다른 생성자 호출 가능 + 중복 제거
        //this()는 반드시 첫줄에 나와야 함.
    }


    //생성자 , void 키워드 없어야함.
    MemberConsturct(String name, int age, int grade){
        System.out.println("생성자 호출 name = " + name + ",age = " + age + ",grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;

    }
}
