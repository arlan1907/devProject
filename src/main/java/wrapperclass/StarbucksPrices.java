package wrapperclass;

import java.util.Arrays;

public class StarbucksPrices {
    public static void main(String[] args) {

        String[] prices = {"Coffee $2.25", "Cappuccino $4.45", "Latte $4.10", "Mocha $3.25"};

        for (int i = 0; i < prices.length; i++) {
            double value = Double.parseDouble(prices[i].substring(prices[i].indexOf('$')+1));
            value+=value*0.1;
            prices[i] = prices[i].substring(0,prices[i].indexOf('$')+1)+ String.format("%.2f",value);
        }
        System.out.println(Arrays.toString(prices));

    }
}
