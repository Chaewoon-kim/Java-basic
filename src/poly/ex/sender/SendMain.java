package poly.ex.sender;

//Q. 다형성을 활용, Sender 인터페이스 활용, EmailSender, SmsSender, FaceBookSender 구현
// 여기서 Sender는 부모, 나머지 3개의 클래스들은 이를 상속받아 재정의
// 1. Sender인터페이스 생성
// 2. 자식으로 email, sms , facebook 생성해 재정의
// 3. main 문을 보면 Sender(부모 클래스)가 자식들을 담고 있음 (부모는 자식을 담을 수 있다)
// 4. Sender sender = EmailSender , SmsSender, FacebookSender
// 5. 타입은 Sender 타입이기 때문에 먼저 부모의 sendMessage() 메서드에 접근하지만 오버라이딩 된 메서드가 있기 때문에 (우선권을 가짐) 자식에 접근 (다형성)
// 6. 루프 돌리면서 순서대로 출력
public class SendMain {
    public static void main(String[] args) {
        Sender [] senders = {new EmailSender(), new SmsSender(), new FaceBookSender()};
        for(Sender sender: senders){
            sender.sendMessage("환영합니다!");
        }
    }
}
