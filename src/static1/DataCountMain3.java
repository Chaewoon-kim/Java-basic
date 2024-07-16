package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count = " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count = " + Data3.count); //[객체.] 이 아니라 [클래스.] 처럼 보인다

        Data3 data3 = new Data3("C");
        System.out.println("C count = " + Data3.count);

        //추가
        //인스턴스를 통한 접근
        Data3 data4 = new Data3("D");
        System.out.println(data4.count); //count가 인스턴스 변수라는 착각이 들 수 있음. 마치 인스턴스 변수에 접근한 것처럼 오해

        //클래스를 통한 접근
        System.out.println(Data3.count);
    }
}
