package poly.ex3;

public class AbstractMain {
    public static void main(String[] args) {
        //추상클래스 생성 불가
        /*AbstractAnimal abstractAnimal = new AbstractAnimal();*/

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        cat.sound();
        cat.move();

        soundAnimal(dog); //AbstractAnimal dog  , 재정의 된 sound() 메서드가 있기 때문에 우선권을 가짐.
        soundAnimal(cat);
        soundAnimal(cow);
    }
    
    private static void soundAnimal(AbstractAnimal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}

//추상 클래스 덕분에 부모 인스턴스를 생성할 문제 근본적으로 방지
//새로운 자식 클래스를 만들 때 실수로 오버라이딩 하지 않을 문제 근본적으로 방지
// -> 부모는 정해만 줘 , 자식은 그걸 구현해.