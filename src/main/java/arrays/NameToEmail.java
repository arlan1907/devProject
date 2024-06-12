package arrays;

public class NameToEmail {
    public static void main(String[] args) {
        String[] names = {"John Dao", "Patel Harsh","Brad Pitt", "Kim Yan"};

        /*
        John Doe -> john.d@mindtek.io
        Patel Harsh -> patel.h@mindtek.io
         */

        for (int i = 0; i < names.length; i++) {
            String firstName = names[i].substring(0, names[i].indexOf(" ")).toLowerCase();
            String firstLetter = names[i].substring(names[i].indexOf(" ")+1,names[i].indexOf(" ")+2).toLowerCase();
            System.out.println(firstName+"."+firstLetter+"@mindtek.io");

        }
    }
}
