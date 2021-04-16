import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book(1, "B1", 200, 2);
        books[1] = new Book(2, "B2", 20, 4);
        books[2] = new Book(3, "B3", 201, 9);
        books[3] = new Book(4, "B4", 19, 6);
        for (Book b: books
             ) {
            System.out.println(b);
        }
        Arrays.sort(books);
        for (Book b: books
        ) {
            System.out.println(b);
        }
    }
}