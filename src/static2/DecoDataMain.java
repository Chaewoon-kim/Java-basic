package static2;

//import statc2.DecoData.staticCall; -> 클래스명을 생략할 수 있음
public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall(); //staticValue -> 1
        //정적호출을 자주하는 경우 , 그 때마다 클래스명을 적어야 하는 불편함
        DecoData.staticCall();
        DecoData.staticCall();
        DecoData.staticCall();

        System.out.println("2. 인스턴스 호출");
        DecoData data1 = new DecoData();
        data1.instanceCall(); // staticValue -> 2 , instanceValue -> 1

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall(); //새로운 인스턴스 생성으로 instanceValue -> 1 ,staticValue -> 3

        //인스턴스는 참조값으로 접근하고, static은 클래스명으로 접근 가능(클래스명 생략 O)

        System.out.println("4. 호출3");
        DecoData.staticCall(data1); //data1의 instancceValue: 1 -> 2
    }
}
