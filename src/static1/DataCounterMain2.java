package static1;

public class DataCounterMain2 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Data2 data1 = new Data2("A", counter);
        System.out.println("A count = " + counter.count);

        Data2 data2 = new Data2("B", counter);
        System.out.println("B count = " + counter.count);

        Data2 data3 = new Data2("C", counter);
        System.out.println("C count = " + counter.count);

        //Data2가 몇 개 생성됐냐를 구하는건데, 별도의 클래스를 생성해 count값을 증가시키는 불편한 점
        //Data2 안에서 공용변수를 만들 수 있지 않을까?
    }
}
