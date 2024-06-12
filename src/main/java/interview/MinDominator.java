package interview;

import java.sql.PreparedStatement;

public class MinDominator {
    /*
    Given a value of V dollar and an infinite supply of each of the denominations {1, 2, 5, 10, 20, 50, 100, 500, 1000} valued coins/notes,
The task is to find the minimum number of coins and/or notes needed to make the change?
Input: V = 70
Output: 2
Explanation: We need a 50 dollar note and a 20 dollar note.
Input: V = 121
Output: 3
Explanation: We need a 100 dollar note, a 20 dollar note, and a 1 dollar coin.
     */
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 10, 20, 50, 100, 500, 1000};

        int given = 121;

        System.out.println(minDom(given, nums));

    }

    public static int minDom(int given, int[] denominator){
        int result = 0;
        for (int i = denominator.length-1; i >=0; i--) {
            // until number existing in the loop keep decreasing the number from the arrays
            // and start decreasing them from the largest element  able to get a least amount of count
            while(given>=denominator[i]){
                given-=denominator[i];
                // if given is still there increase the count of result(coins).
                result++;
            }
        }
        return result;
    }
}
