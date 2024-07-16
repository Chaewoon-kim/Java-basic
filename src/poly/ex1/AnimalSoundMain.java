package poly.ex1;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();


        //배열을 사용한 중복 제거 시도
        //Cow[] cowArr = {dog , cat, cow}; //마찬가지로 타입이 다르기 때문에 배열 생성도 불가

        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        cow.sound();
        System.out.println("동물 소리 테스트 종료");

        //메서드로 중복 제거 시도
        //soundCow(cat); //타입(클래스)가 다르기 때문에 메서드를 함께 사용 할 수 없음

    }

    private static void soundCow(Cow cow) {
        System.out.println("동물 소리 테스트 시작");
        cow.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}

