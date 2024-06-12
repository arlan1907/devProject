package list;

import java.util.ArrayList;
import java.util.List;

public class Mindtek {
    public static void main(String[] args) {
        List<String> sdetClasses = new ArrayList<>(List.of("Java","Selenium","TestNG","SQL","rest API"));
        Program program1 = new Program("SDET",100, sdetClasses );

        List<String> javaClasses = new ArrayList<>(List.of("Java","Java Streams", "Java Generics", "Spring Boot", "Git","Unit Test", "Clouds"));
        Program program2 = new Program("Java Development", 101, javaClasses);

        List<String> salesForceClasses = new ArrayList<>(List.of("Administrator", "Apex", "LWC", "Aura", "SOQL", "Integration"));
        Program program3 = new Program("Salesforce Development", 102, salesForceClasses);

        Student student1 = new Student("John Doe", 1, "Chicago IL",program2);
        Student student2 = new Student("Patel Harsh", 2, "Austin TX",program1);
        Student student3 = new Student("Kim Yang", 3, "Los Angeles LA",program3);
        Student student4 = new Student("Sumitha Lakka", 4, "New York NY",program2);
        Student student5 = new Student("Brad Pitt", 5, "Miami FL",program1);

        List<Program> programs  = new ArrayList<>(List.of(program1,program2,program3));
        List<Student> students = new ArrayList<>(List.of(student1,student2,student3,student4,student5));

        //students.forEach(System.out::println);

        for(Student s : students){
            System.out.println(s.getName());
        }
        System.out.println("======================");
        /*
        John Doe is attending Java Development program
         */
        for(Student s : students){
            System.out.println(s.getName() + " is attending "+ s.getProgram().getName()+" program");
        }
        System.out.println("==========================");
        System.out.println(UtilityMethods.getStudents(students, 101));
        System.out.println(UtilityMethods.getStudents(students, 102));

        System.out.println("==========================");
        System.out.println(UtilityMethods.getClasses(programs, "SDET"));
        System.out.println(UtilityMethods.getClasses(programs, "Salesforce Development"));

        System.out.println("==========================");
        System.out.println(UtilityMethods.getStudentIds(students, "Chicago IL"));















    }
}
