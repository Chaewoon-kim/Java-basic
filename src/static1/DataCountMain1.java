package static1;

public class DataCountMain1 {
    public static void main(String[] args) {

        //총 3개의 다른 인스턴스가 생성되기 때문에, count값은 늘어나지 않음.
        //인스턴스끼리는 count값을 공유하지 않음
        Data1 data1 = new Data1("A");
        System.out.println("A count = " + data1.count);

        Data1 data2 = new Data1("B");
        System.out.println("B count = " + data2.count);

        Data1 data3 = new Data1("C");
        System.out.println("C count = " + data3.count);


    }
}
