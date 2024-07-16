package poly.ex2;

public class AnimalPolyMain1 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        //Animal은 부모이기 때문에 가능 자식들을 담을 수 있음
        //타입에 대한 문제 해결 + 메서드 중복 제거
        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
    }

    private static void soundAnimal(Animal animal){
        //Animal animal  = dog , cat , cow -> 부모는 자식을 담을 수 있음
        //메서드 오버라이딩으로 각각의 울음 소리 출력, 오버라이딩 된 메서드가 우선권을 가짐.
        //Animal 타입의 객체가 접근을 할 때, 인스턴스 안에는 부모 메서드와 오버라이딩 된 자식 메서드가 있다 .
        //먼저 부모 메서드에 접근하겠지만, 이 때 오버라이딩 된 자식 메서드가 있는 것을 보고 우선권을 가진 메서드(자식 메서드)에 먼저 접근하게 된다.
        System.out.println("울음 소리 테스트 시작");
        animal.sound();
        System.out.println("울음 소리 테스트 종료");
    }
}
