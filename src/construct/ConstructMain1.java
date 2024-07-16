package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        //객체를 생성함과 동시에 생성자를 불러라. ( = 연산자)
        //괄호 내에 생성자 호출 x -> 컴파일 오류 발생.
        //객체를 생성하고 동시에 생성자를 호출하기 때문에 중복 호출이 제거 됐음.
        //그러나 괄호 안에 반드시 생성자를 호출해야 한다는 제약 발생
        MemberConsturct member1 = new MemberConsturct("user1" , 16, 90);
        MemberConsturct member2 = new MemberConsturct("user2" , 15, 80);

        //생성자 호출 후 값 대입 한 후에 다음 작업 수행

        MemberConsturct [] members = {member1 , member2};

        for(MemberConsturct s : members){
            System.out.println("이름: " + s.name + ", 나이: " + s.age + ", 성적: " + s.grade);
        }
    }
}
