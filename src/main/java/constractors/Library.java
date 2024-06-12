package constractors;

public class Library {
    public static void main(String[] args) {

        Book book1 = new Book("OCA",500,"James Boyarski");
        Book book2 = new Book("10X Rules",100,"Grand Cardone");
        Book book3 = new Book("War & Peace");
        Book book4 = new Book(250);
        Book book5 = new Book();

        Book[] books = {book1, book2, book3,book4, book5 };

        for (int i = 0; i < books.length; i++) {
            if(books[i].pages>200){
                System.out.println(books[i].title);
            }
        }

        int totalPages= 0;
        for (int i = 0; i < books.length; i++) {
            if(books[i].title != null ){
                totalPages+=books[i].pages;
            }
        }
        System.out.println(totalPages);

    }
}
