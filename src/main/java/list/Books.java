package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Books {

    public static void main(String[] args) {

        List<String> books1 = new ArrayList<>();

        books1.add("10k Rules");
        books1.add("War and Peace");
        books1.add("OCA Book");
        books1.add("OCP Book");

        List<String> books2 = new ArrayList<>();

        books2.add("10k Rules");
        books2.add("OCA Book");
        books2.add("War and Peace");

        Collections.sort(books1);
        Collections.sort(books2);

        if(books1.equals(books2)){
            System.out.println("Same books");
        }else{
            System.out.println("Different books");
        }

        if(books1.containsAll(books2)){
            System.out.println("Books 1 list contains all books from Books 2 list ");
        }else{
            System.out.println("Books 1 list does not contain books from Books 2 list");
        }
    }
}
