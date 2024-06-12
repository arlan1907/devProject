package arrays;

import java.util.Scanner;

public class FindFruit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the fruit you looking for: ");
        String fruit = scan.next();

        String[] st = {"melon", "apple", "watermelon", "Orange", "Banana"};
        boolean have = false;

        for (int i = 0; i < st.length; i++) {
            if(st[i].equalsIgnoreCase(fruit)) have = true;
        }
        if(have) System.out.println("we have " + fruit + " in store");
        else System.out.println("sorry we don't have " + fruit + " in store");
    }
}
