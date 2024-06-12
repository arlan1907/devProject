package arrays;

import java.util.Scanner;

public class CristmassTree1 {
    public static void main(String[] args) {
        /*
        *
       ***
      *****
     *******
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter tree height : ");
        int height = scan.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
