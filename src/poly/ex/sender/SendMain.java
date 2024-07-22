package poly.ex.sender;

public class SendMain {
    //Q. 다중 메세지 발송, 한 번에 여러 곳에서 메세지를 발송하는 프로그램
    // Sender 인터페이스 활용 , 다형성 활용
    public static void main(String[] args) {
        Sender [] senders = {new EmailSender(), new SmsSender(), new FaceBookSender()};
        for(Sender sender : senders){
            sender.sendMessage("환영합니다!");
        }
    }
}
