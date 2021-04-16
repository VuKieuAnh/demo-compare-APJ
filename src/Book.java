public class Book implements Comparable<Book> {
    int id;
    String name;
    int price;
    int number;

    public Book(int id, String name, int price, int number) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.number = number;
    }

    @Override
    public int compareTo(Book o) {
        return o.number - this.number;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", number=" + number +
                '}';
    }
}