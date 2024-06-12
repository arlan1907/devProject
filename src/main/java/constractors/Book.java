package constractors;

public class Book {

    String title;
    int pages;
    String author;

    public Book(){

    }

    public Book(String title, int pages, String author) {
        this.title = title;
        this.pages = pages;
        this.author = author;
    }

    public Book(String title) {
        this.title = title;
    }

    public Book(int pages) {
        this.pages = pages;
    }


}
