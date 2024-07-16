package static2.ex;

public class Car {
    //필요 데이터: 차 이름, 차량 수
    private String name;
    private static int totalCars; //static으로 변경

    public Car(String name){
        System.out.println("차량 구입, 이름: " + name);
        this.name = name;
        totalCars++;
    }

    //static 메서드이기 때문에 인스턴스 호출 불가 (만들어진 객체가 따로 없기 때문에)
    public static void showTotalCars(){
        System.out.println("구매한 차량 수: " + totalCars);
    }
}
