package arrays;

public class FindCommonFruits {
    public static void main(String[] args) {

        String[] basket1 = {"Apple", "Banana", "Watermelon", "Orange"};
        String[] basket2 = {"Melon", "Orange", "Kiwi", "Apple"};

        /*
        find common fruits
         */

        for (int i = 0; i < basket1.length; i++) {
            for (int j = 0; j < basket2.length; j++) {
                if(basket1[i].equalsIgnoreCase(basket2[j])) System.out.println(basket1[i] + " is common fruit");

            }

        }







    }
}
