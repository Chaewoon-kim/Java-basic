package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConsturct member1 = new MemberConsturct("user1", 16, 90);
        //member2에서 생성자는 grade를 받지 않는다. 대신 grade는 50점
        MemberConsturct member2 = new MemberConsturct("user2" , 15);

        MemberConsturct [] members = {member1 , member2};

        for(MemberConsturct s : members){
            System.out.println("이름: " + s.name + ", 나이: " + s.age + ", 성적: " + s.grade);
        }
    }
}
