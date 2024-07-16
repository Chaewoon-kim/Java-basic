package construct;

public class MethodInitMain3 {
    public static void main(String[] args) {

        memberInit member1 = new memberInit();
        member1.initMember("user1", 16, 90);


        memberInit member2 = new memberInit();
        member2.initMember("user2", 15, 80);

        memberInit[] members = {member1, member2};
        for (memberInit s : members) {
            System.out.println("이름: " + s.name + ", 나이: " + s.age + ", 성적: " + s.grade);
        }
    }
}
