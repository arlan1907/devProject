package list;

import java.util.ArrayList;
import java.util.List;

public class UtilityMethods {
    /**
     * This method will take program id as a parameter and returns students who attend that program
     * Example:
     * .getStudents(students, 101); -> return list of students
     */

    public static List<Student> getStudents(List<Student> students, int programID){

        List<Student> studentList = new ArrayList<>();
        for (Student s : students){
            if(s.getProgram().getId() == programID){
               studentList.add(s);
            }
        }
        return studentList;
    }

    /**
     * This method returns List of classes for a provided program
     *Example:
     * .getClasses("Java Development"); -> returns list of the classes (Java, Java Streams, Generics....)
     */
     public static List<String> getClasses(List<Program> program, String className){

         for(Program pr : program){
             if(pr.getName().equals(className)){
                 return pr.getClasses();
             }
         }
         return null;
     }

    /**
     * Method takes list of students and location of students as a parameter
     * and returns list of ids of students who studies from that location.
     * Example:
     * .getStudentIds(students, "Chicago IL"); -> returns[1]
     */

    public static List<Integer> getStudentIds(List<Student> students, String location){

        List<Integer> ids = new ArrayList<>();

        for(Student st : students){
            if(st.getLocation().equals(location)){
                ids.add(st.getId());
            }
        }
        return ids;
    }
}
