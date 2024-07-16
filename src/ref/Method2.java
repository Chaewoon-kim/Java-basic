package ref;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = createStudent("학생1" , 15, 90 );
        Student student2 = createStudent("학생2" , 16, 80 );

        printStudent(student1);
        printStudent(student2);
    }

    //객체를 생성하는 부분도 메서드 내에 포함시키기.
    static Student createStudent(String name, int age, int grade){
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        //값을 대입 후 메서드를 호출하면 만들어진 student 참조값 반환
        return student;
    }

    static void printStudent(Student student){
        System.out.println("이름: " + student.name + ", 나이: " + student.age + ", 성적: " + student.grade);
    }
}
