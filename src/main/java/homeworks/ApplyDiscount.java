package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class ApplyDiscount {


        /*
        ArrayList <String> items=new ArrayList<>(Arrays.asList("AirPods $230","Magic keyboard $100", "Apple TV $200","iPhone 13 $999"));
        2. Update item prices in list with %10 discount that has price equals to or more than 200
        3. Then print items list
        Output should be:
        [AirPods $207, Magic keyboard $100, Apple TV $180, iPhone 13 $900]
         */
        public static void main(String[] args) {

            ArrayList<String> items=new ArrayList<>(Arrays.asList("AirPods $230","Magic keyboard $100", "Apple TV $200","iPhone 13 $999"));
            System.out.println(applyDiscount(items));

    }

    public static ArrayList<String> applyDiscount(ArrayList<String> product){

        for (int i = 0; i < product.size(); i++) {
            int price = Integer.parseInt(product.get(i).substring(product.get(i).indexOf("$")+1));
            if(price>=200){
                product.set(i,product.get(i).substring(0,product.get(i).indexOf("$")+1)+((int)Math.round(price*0.9)));
            }
        }
        return product;
    }
}
