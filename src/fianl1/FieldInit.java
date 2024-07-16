package fianl1;

public class FieldInit {

    static final int CONST_VALUE = 10; //static과 final을 같이 쓰면 heap이 아닌 하나의 static영여게 존재.
    final int value = 10; //초기값이 할당된 경우, 생성자를 통해서 초기값 설정 불가

    /*public FieldInit(int value){
        this.value = value; //컴파일 오류
    }*/
}
