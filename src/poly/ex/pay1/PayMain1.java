package poly.ex.pay1;

//Q. 해당 Main 코드를 유지하되 클래스나 인터페이스 추가 가능
public class PayMain1 {
    public static void main(String[] args) {
        PayService payService = new PayService();
        //kakao 결제
        String payOption1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOption1, amount1);
        //naver 결제
        String payOption2 = "naver";
        int amount2 = 10000;
        payService.processPay(payOption2, amount2);
        //잘못된 결제 수단 선택(DefaultPay)
        String payOption3 = "bad";
        int amount3 = 15000;
        payService.processPay(payOption3, amount3);

        //새로운 결제 수단
        String payOption4 = "new";
        int amount4 = 10000;
        payService.processPay(payOption4,amount4);

        //문제 : 결제 수단을 추가하게 될 때 , 코드가 점점 더러워지는 현상 발생할 수 있음

    }
}
