package construct.ex;

public class Book {
    String title;
    String author;
    int page;

    //기본 생성자
    Book(){
        this("","",0);
    }


    //title과 author만을 매개변수로 받는 생성자
    Book(String title, String author){
        this(title, author, 0);
    }

    //모든 필드를 매개변수로 받는 생성자
    //괄호 안에 매개 변수가 우선 순위를 가지기 때문에 우리는 this 키워드를 이용하여 멤버변수에 접근해야된다.
    Book(String title, String author, int page){
        this.title = title;
        this.author = author;
        this.page = page;
    }

    //displayInfo
    void displayInfo(){
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + page);
    }

}