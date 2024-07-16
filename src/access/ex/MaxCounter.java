package access.ex;

public class MaxCounter {
    int count = 0;
    int max;

    //생성자를  통해 max 값 입력받기.
    public MaxCounter(int max){
        this.max = max;
    }

     public void increment(){
        //제약 조건 -> count 값이 max 값보다 작을 때만 증가
        if(count >= max){
            System.out.println("최대값을 초과할 수 없습니다.");
            return; //리턴문이 없다면 그대로 다음 코드인 count값을 증가시키게 될 것.
        }
        count++;
    }


    //지금까지 증가한 count값 반환 메서드
    public int getCount(){
         return count;
    }
}
