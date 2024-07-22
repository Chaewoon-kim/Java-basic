package poly.ex.sender;

public class SmsSender implements Sender{
    //부모 인터페이스 -> 자식은 무조건 재정의를 해야함.
    @Override
    public void sendMessage(String message){
        System.out.println("SMS를 발송합니다: " + message);
    }
}
