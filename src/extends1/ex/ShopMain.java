package extends1.ex;

public class ShopMain {
    public static void main(String[] args) {
        Book book = new Book("JAVA",10000,"han","12345");
        Album album = new Album("앨범1", 15000, "kim");
        Movie movie = new Movie("영화1", 18000 , "감독1","배우1");

        //공통된 메서드 사용하고 있음 (이는 재정의했다고 볼 수 있음 , 각각 출력하는 정보가 다르기 때문) , 부모 클래스(Item)의 print()메서드.
        book.print();
        album.print();
        movie.print();

        //getPrice()역시 공통 메서드 부모 클래스(Item)에서 정의, 코드 중복 x
        int sum = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println("상품 가격의 합: " + sum);
    }
}
