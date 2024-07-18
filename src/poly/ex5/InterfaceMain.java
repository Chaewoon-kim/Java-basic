package poly.ex5;

public class InterfaceMain {
    public static void main(String[] args) {
        //인터페이스 생성 불가
        //InterfaceAnimal interfaceAnimal = new InterfaceAnimal() {}

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
    }
    //변하지 않는 부분
    private static void soundAnimal(InterfaceAnimal animal){
        System.out.println("소리 테스트 시작");
        animal.sound();
        System.out.println("소리 테스트 종료");
    }
}
//추상 클래스와 인터페이스의 차이
// 제약: 추상 클래스는 미래에 새로운 메서드를 생성할 수 있지만 인터페이스는 모든 메서드가 추상 메서드이기 때문에 실행 가능한 메서드 생성 불가