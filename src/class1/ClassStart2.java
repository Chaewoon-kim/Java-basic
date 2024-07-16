package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        //Q. 학생 두 명의 학생 정보를 출력하는 프로그램 작성. 각 학생은 이름, 나이 성적 가지고 있음
        //배열을 적용해보자.
        String [] studentName = {"학생1","학생2"};
        int [] ages = {15,16};
        int [] grades = {90,80};

        for(int i = 0 ; i <studentName.length; i++){
            System.out.println("이름: " + studentName[i] + " 나이: " + ages[i] + " 성적: " + grades[i]);
        }
    }
}
