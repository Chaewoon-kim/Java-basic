package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;


    //1. static 키워드 O
    public static void staticCall(){
        //instanceValue++; //인스턴스 변수 접근, 컴파일 에러...
        //instanceMethod(); // 컴파일 에러...

        staticValue++; //정적 변수에 접근 (같은 클래스)
        staticMethod(); //역시나 같은 클래스 소속

    }


    //2. static 키워드 x
    public void instanceCall(){
        instanceValue ++;
        instanceMethod();

        //static은 어디에서나 호출 가능
        staticValue++;
        staticMethod();
    }

    private void instanceMethod(){
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod(){
        System.out.println("staticValue = " + staticValue);
    }

    public static void staticCall(DecoData data){
        data.instanceValue++;
        data.instanceMethod();
    }
}
