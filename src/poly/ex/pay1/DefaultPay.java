package poly.ex.pay1;

public class DefaultPay implements Pay{
    //결제 수단을 찾지 못했을 때 null 체크를 피하기 위한 메서드
    //NullObjectReturn
    @Override
    public boolean pay(int amount){
        System.out.println("결제 수단이 없습니다.");
        return false;
    }
}
