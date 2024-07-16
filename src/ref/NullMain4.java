package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data(); //참조값 생성 -> NullPointerException 문제 해결
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        System.out.println("bigData.data.value = " + bigData.data.value);
        //bigData.data -> null , null. -> NullPointerException 예외 발생
    }
}