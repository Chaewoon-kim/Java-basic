package fianl1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data(); //참조형 변수를 final로 설정
        /*data = new Data();*/

        //참조 대상의 값은 변경 가능 , fianl 키워드가 아니기 때문 (참조값은 변경 불가)
        data.value = 10;
        System.out.println(data.value);

        data.value = 20;
        System.out.println(data.value);
    }
}
