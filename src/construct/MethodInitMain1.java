package construct;

public class MethodInitMain1 {
    public static void main(String[] args) {
        memberInit member1 = new memberInit();
        member1.name = "user1";
        member1.age = 15;
        member1.grade = 90;

        memberInit member2 = new memberInit();
        member2.name = "user2";
        member2.age = 16;
        member2.grade = 80;

        memberInit [] members = {member1 , member2};
        for(memberInit s : members){
            System.out.println("이름: " + s.name + ", 나이: " + s.age + ", 성적: " + s.grade);
        }
    }
}
