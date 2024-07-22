package poly.ex.pay1;

public class KakaoPay implements Pay{
    //Q. 현재 결제 시스템은 2가지 결제 수단 지원. 앞으로 5개 결제 수단 추가 예정
    //새로운 결제수단을 쉽게 추가할 수 있도록 , 리팩토링
    @Override
    public boolean pay(int amount){
        System.out.println("카카오페이 시스템과 연결합니다.");
        System.out.println(amount + "원 결제를 시도합니다.");
        return true;
    }
}
