package extends1.ex;

public class Book extends Item{
    private String author;
    private String isbn;

    public Book(String author, int price,String name, String isbn ){
        super(name , price); //부모의 값 세팅.
        this.author = author;
        this.isbn = isbn;
    }


    @Override
    public void print(){
        super.print(); //부모의 print()메서드 먼저 출력.
        System.out.println("- 저자: " + author + ", isbn: " + isbn);

    }
}
