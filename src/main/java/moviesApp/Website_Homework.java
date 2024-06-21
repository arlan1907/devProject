package moviesApp;

import java.util.List;
import java.util.Scanner;

public class Website_Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Please select a menu option:");
            System.out.println("1: Search by genre");
            System.out.println("2: Search by director");
            System.out.println("3: Search by year range");
            System.out.println("4: Search movies for children");
            System.out.println("5: Exit");

            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    System.out.println("What genre of movies are you looking for?");
                    String genre = scanner.nextLine();
                    List<Movie> movieByGenre = Website.searchByGenre(genre);
                    Website.print(movieByGenre);
                    break;
                case "2":
                    System.out.println("Enter the director's name:");
                    String director = scanner.nextLine();
                    List<Movie> movieByDirector = Website.searchByDirectorName(director);
                    Website.print(movieByDirector);
                    break;
                case "3":
                    System.out.println("Enter the start year:");
                    int startYear = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter the end year:");
                    int endYear = Integer.parseInt(scanner.nextLine());
                    List<Movie> movieByYear = Website.searchByYear(startYear, endYear);
                    Website.print(movieByYear);
                    break;
                case "4":
                    System.out.println("Here is movies for children");
                    List<Movie> movieForChildren = Website.searchMoviesForChildren();
                    Website.print(movieForChildren);
                    break;
                case "5":
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Please provide a valid menu option (1, 2, 3, 4 or 5).");
                    break;
            }
        }
    }

