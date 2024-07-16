package fianl1.ex;

public class Member {
    private final String id; //fianl 키워드 사용
    private String name;

    public Member(String id, String name){
        this.id = id;
        this.name = name;
    }

    public void changeData(String id, String name){
        //this.id = id; //fianl 변수이기 때문에 컴파일 오류
        this. name = name;
    }

    public void print(){
        System.out.println("Id:" + id + ", name" + name);
    }
}
