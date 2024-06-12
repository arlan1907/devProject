package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SParentStreamPractice {

    public static void main(String[] args) {
        Parent parent1 = new Parent("John Doe", 'M', new ArrayList<>(List.of("Bob","Richard","Michael")));
        Parent parent2 = new Parent("Patel Harsh", 'M', new ArrayList<>(List.of("Srikkanth","Sumathi","Suresh")));
        Parent parent3 = new Parent("Kate Peterson", 'F', new ArrayList<>(List.of("Jessica","Charles")));

        List<Parent> parents = List.of(parent1,parent2,parent3);

        // store name of children in list of strings

        List<String> children = parents.stream()
                .flatMap(x -> x.getChildren().stream())
                .collect(Collectors.toList());

        System.out.println(children);

        // get first kid name into list of every Male parent

        List<String> firstKids = parents.stream()
                .filter(x -> x.getGender()=='M')      // filtering by
                .flatMap(x -> Stream.of(x.getChildren().get(0)))//Same as - List.of(x.getChildren().get(0)).stream()
                .collect(Collectors.toList());

        System.out.println(firstKids);

        // get parents name who has children name starts with letter 'C'

        List<String> parentForChild = parents.stream()
                .filter(parent -> parent.getChildren().stream()
                        .anyMatch(child -> child.startsWith("C")))
                .map(x -> x.getName())
                        .collect(Collectors.toList());

        System.out.println(parentForChild);
    }
}
