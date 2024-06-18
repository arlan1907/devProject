package moviesApp;

import bufferReader.Data;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Website {
    public static void main(String[] args) {
        List<Movie> movies = searchByGenre("action");

        List<Movie> movies1 = searchByDirectorName("Nolan");
        print(movies);
        System.out.println("###################################################################################");
        print(movies1);

        // Via scanner ask user give  amenu
        // 1. search by genre
        // 2. Director
        // 3. Year
        // 4. for children
        // after they type number ex: 1 -> then ask what genre
        // after they give genre type display all genre they looking for


    }

    private static List<Movie> searchByDirectorName(String director) {

        return Database.provide().stream()
                .filter(m -> m.getDirector().contains(director))
                .collect(Collectors.toList());
    }

    private static void print(List<Movie> movies){
//        int num = 1;
//        for(Movie m : movies){
//            System.out.println(num + ") " +m);
//            num++;
//        }
        // same print code with streams
        IntStream.range(0, movies.size())
                .forEach(i -> System.out.println((i + 1) + ") " + movies.get(i)));
    }

    private static List<Movie> searchByGenre(String genre){
//        List<Movie> list = new ArrayList<>();
//        for (Movie m : Database.provide()) if(m.getGenre().equalsIgnoreCase(genre)) list.add(m);
//        return list;

        // same code with streams
        return Database.provide().stream()
                .filter(m -> m.getGenre().equalsIgnoreCase(genre))
                .collect(Collectors.toList());
    }


}
