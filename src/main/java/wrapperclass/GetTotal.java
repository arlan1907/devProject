package wrapperclass;

public class GetTotal {
    public static void main(String[] args) {
        String[] prices = {"$25.4", "$3.25", "$7.10"};
        String totalExpected = "$35.75";
        double totalActual = 0;
        for (String price : prices) {
            double value = Double.parseDouble(price.substring(1));
            totalActual += value;
        }
        String totalActualString = "$"+totalActual;
        System.out.println(totalActualString.equals(totalExpected));
    }
}
