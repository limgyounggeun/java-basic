package extends1;

public class Book extends Product{
    private String author;
    private int isbn;

    public Book(String name, int price, String author, int isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("author: " + author);
        System.out.println("isbn: " + isbn);
    }
}
