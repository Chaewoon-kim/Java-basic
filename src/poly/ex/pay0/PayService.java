package poly.ex.pay0;
//PayService 코드를 최적화하는 문제
public class PayService {
    //옵션과 돈의 액수를 매개변수로 받고 있는 processPay() 메서드
    public void processPay(String option , int amount){
        boolean result;

        System.out.println("결제를 시작합니다: option = " + option + ", amount = " + amount);
        if(option.equals("kakao")){
            KakaoPay kakaoPay = new KakaoPay();
            result = kakaoPay.pay(amount);
        }else if(option.equals("naver")){
            NaverPay naverPay = new NaverPay();
            result = naverPay.pay(amount);
        }else{
            System.out.println("결제 수단이 없습니다.");
            result = false;
        }
        if(result){
            System.out.println("결제가 성공했습니다.");
        } else{
            System.out.println("결제가 실패했습니다.");
        }
    }
}
