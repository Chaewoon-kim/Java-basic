package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {

        memberInit member1 = new memberInit();
        initMember (member1 , "user1", 15 ,90);

        memberInit member2 = new memberInit();
        initMember(member2 , "user2", 16 ,80);

        memberInit [] members = {member1 , member2};
        for(memberInit s : members){
            System.out.println("이름: " + s.name + ", 나이: " + s.age + ", 성적: " + s.grade);
        }
    }
    static void initMember(memberInit member , String name , int age , int grade){
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
