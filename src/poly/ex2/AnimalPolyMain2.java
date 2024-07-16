package poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        Animal[] animalArr = {dog, cat, cow};
        //다형적 참조 덕분에 dog cat cow 모두 같은 타입이다. 따라서 배열 생성 가능

        for (Animal animal : animalArr) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }

    }
}
