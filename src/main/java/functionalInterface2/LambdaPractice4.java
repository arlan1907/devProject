package functionalInterface2;

public class LambdaPractice4 {
    public static void main(String[] args) {

        Checker<Integer, Integer> sum = x -> {
            //same with stream -> java.util.Arrays.stream(x).reduce(0, Integer::sum);
            int total = 0;
            for (Integer num : x) {
                total += num;
            }
            return total;
        };


        Integer[] nums = {5, 2, 6};
        System.out.println(sum.execute(nums));


        Checker<Integer, Boolean> sumMoreThan20 = x -> sum.execute(x) > 20;
        System.out.println("is Sum more than 20 :"+sumMoreThan20.execute(nums));


        /* Implement lambda expression for check that takes array os String and return all elements concatenated.
        Example :
        String[] words ={"I", "love", "Java"};
        concatenated.execute(words); -> returns "I love java";
                */
        Checker<String, String> concatenated = x -> {
            //            java.util.Arrays.stream(x).collect(java.util.stream.Collectors.joining(" "));
            StringBuilder stb = new StringBuilder();

            for (String str : x) {
                stb.append(str).append(" ");
            }
            return stb.toString().trim();
        };

        String[] words = {"I", "love", "Java"};

        System.out.println(concatenated.execute(words));


        /*
    String[] prices = {"$2.4", "$5.2", "$3"};
     */
        Checker<String, Double> getTotal = x -> {
            double total = 0.0;

            for (String str : x) {
                total += Double.parseDouble(str.substring(1));
            }
            return total;
        };

        String[] prices = {"$2.4", "$5.2", "$3"};
        System.out.println(getTotal.execute(prices));
    }



}



