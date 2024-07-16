package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value);
        chagneReference(dataA);
        System.out.println("메서드 호출 후: dataA.value = " + dataA.value);
    }
    static void chagneReference(Data dataX)/*Data dataX = dataA*/{
        dataX.value = 20; //참조값을 복사했기 때문에 dataA.value 역시 20
    }
}
