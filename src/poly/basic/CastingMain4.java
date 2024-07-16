package poly.basic;

//다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();  //부모는 자식을 품을 수 있음.
        Child child1 = (Child)parent1; //원래는 안되지만 Child로 다운캐스팅 함을 통해 접근 가능
        child1.childMethod(); //문제없음

        Parent parent2 = new Parent();
        Child child2 = (Child)parent2; //런타임 오류 - (ClassCastException) 프로그램 실행 도중 발생하는 오류
        child2.childMethod(); //캐스팅이 됐다 쳐도 , childMethod()가 없는데 어떻게 호출한다는거지? -> 캐스팅 / 실행 불가.



    }
}
