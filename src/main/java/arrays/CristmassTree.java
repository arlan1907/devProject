package arrays;

import java.util.Scanner;

public class CristmassTree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter height of tree: ");
        int height = scanner.nextInt();

        // Print tree  ->5
        //

        for (int i = 0; i < height; i++) {
            // Print spaces
            // 5-4
            // 4-3
            // 3-2 ...
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            // Print stars
            // 2.0+1 = *
            // 2.1+1 = ***
            // 2.2+1 = *****
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
