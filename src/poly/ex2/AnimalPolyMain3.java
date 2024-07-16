package poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {
        //앞선 코드를 조금 더 개선 , 배열 인덱스에 객체를 직접 넣어줌

        Animal[] animalArr = {new Dog(),new Cat(), new Cow(), new Pig()};
        //다형적 참조 덕분에 dog cat cow 모두 같은 타입이다. 따라서 배열 생성 가능

        //문제 2: 만약 자식이 메서드 오버라이딩을 하지 않았을 때. -> 오버라이딩을 했기 때문에 부모 클래스의 메서드 호출. 역시 아무 문제 없음

        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }

        //여기서 2가지 문제
        //Animal 객체를 직접 생성했을 때 -> 인스턴스를 생성하고 사용하는데 아무 문제 없음
        Animal a = new Animal();
        a.sound();
    }

    //변하지 않는 부분
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
