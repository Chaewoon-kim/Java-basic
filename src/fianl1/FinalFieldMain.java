package fianl1;

public class FinalFieldMain {
    public static void main(String[] args) {
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20); //이후에는 값 변경 불가 , final 변수이기 때문
        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);


        //fianl 필드 초기화 , 이미 필드 내에서 값을 설정했기 때문에 따로 값 변경 불가.
        //모든 인스턴스가 같은 값을 가지기 때문에 메모리 낭비
        //이럴 때 사용하기에 좋은 것이 static 영역
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();

        System.out.println(fieldInit1.value); //10
        System.out.println(fieldInit2.value); //10
        System.out.println(fieldInit3.value); //10

        //상수
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);

        //-> 결과적으로 필드에서 final 변수를 설정할 때는 앞에 static 키워드를 붙여 메모리 낭비를 방지할 수 있음.


    }
}
