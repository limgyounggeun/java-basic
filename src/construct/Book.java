package construct;

public class Book {
    String title;
    String author;
    int page;

    public Book(){
        this("","");
    }
    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }
    public Book(String title, String author) {
        this(title, author, 0);
    }
    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Page: " + page);
    }
}
