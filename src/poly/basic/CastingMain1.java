package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        //1. 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child(); //x001
        //여기서 자식의 기능 호출 불가
        //poly.childMethod(); 
        
        //다운캐스팅을 통해 부모타입을 자식타입으로
        Child child = (Child) poly; //x001, poly를 강제로 Child타입으로 형변환
        child.childMethod();

    }
}
