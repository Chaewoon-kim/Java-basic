package class1;

public class ClassStart5 {
    public static void main(String[] args) {
        //자바에서 대입은 항상 변수에 들어있는 값을 복사한다.
        //인스턴스의 위치를 가리키는 참조값이 들어있을 뿐이다.
        Student student1 = new Student(); //객체 or 인스턴스, Student 클래스를 사용해 실제 메모리에 만들어짐
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); //Student 인스턴스에 접근 가능한 참조값 들어있음
        //dot(.)을 통해 멤버 변수에 접근하고 값 대입 
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student [] students = {student1,student2};

        /*for(int i = 0 ; i < students.length; i++){
            System.out.println("이름: " + students[i].name + " 나이: " + students[i].age + " 성적: "+ students[i].grade);
        }*/

        for(int i = 0; i < students.length; i++){
            Student s = students[i];
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }

        //향상된 for문
        for(Student s: students){
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
    }
}
