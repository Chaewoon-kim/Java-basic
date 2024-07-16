package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student(); //객체 or 인스턴스, Student 클래스를 사용해 실제 메모리에 만들어짐
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); //Student 인스턴스에 접근 가능한 참조값 들어있음
        //dot(.)을 통해 멤버 변수에 접근하고 값 대입
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 성적: "+ student1.grade);
        System.out.println("이름: " + student2.name + " 나이: " + student2.age + " 성적: "+ student2.grade);

    }
}
