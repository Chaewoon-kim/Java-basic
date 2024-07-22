package poly.ex.pay1;

//PayService 코드를 최적화하는 문제(클라이언트 측)
public class PayService {
    //옵션과 돈의 액수를 매개변수로 받고 있는 processPay() 메서드
    //변하지 않는 부분 분리.
    public void processPay(String option, int amount) {

        System.out.println("결제를 시작합니다: option = " + option + ", amount = " + amount);

        //Pay라는 역할에만 의존하게 됐음
        Pay pay = PayStore.findPay(option);
        boolean result = pay.pay(amount);

        //return 값을 받았을 때 실행되는 메서드
        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }

}



