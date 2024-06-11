package test;

import main.Methods;
import main.Product;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import static org.junit.Assert.*;

/*
@author Arslan Kabulniyazov
 */
public class Tests {

    @Test
    public void testProcessProducts1a() {
        List<Product> products = Methods.getProducts();

        // TODO - implement predicate that filters products that has price more than 1000.0
        Predicate<Product> expensiveProducts = pr -> pr.getPrice()>1000;

        // TODO - implement Consumer that concatenates attributes to StringBuilder of Product as below format:
        //  Product name: $Price, Stock: stock number
        //  Example: Desk: $1489.94, Stock: 208
        StringBuilder result = new StringBuilder();
        Consumer<Product> collectProductDetails = p -> result.append(p.getProductName()).append(": $").append(p.getPrice()).append(", Stock: ").append(p.getStockQuantity()).append("\n");
        Methods.processProducts(products, expensiveProducts, collectProductDetails);

        String expected ="Desk: $1489.94, Stock: 208\n" +
                "Jacket: $1338.63, Stock: 196\n" +
                "Laptop: $1216.56, Stock: 37\n" +
                "Board Game: $1388.17, Stock: 200\n" +
                "Action Figure: $1343.51, Stock: 72\n" +
                "Doll: $1395.92, Stock: 244\n" +
                "Tablet: $1010.29, Stock: 278\n" +
                "Keyboard: $1205.64, Stock: 170\n" +
                "Textbook: $1199.81, Stock: 261\n" +
                "Desk: $1139.07, Stock: 191\n" +
                "Keyboard: $1318.66, Stock: 248\n" +
                "Puzzle: $1060.5, Stock: 231\n" +
                "Mouse: $1095.81, Stock: 123\n" +
                "Jacket: $1153.81, Stock: 36\n" +
                "Board Game: $1472.72, Stock: 174\n" +
                "Textbook: $1310.31, Stock: 168\n" +
                "Mouse: $1174.32, Stock: 166\n" +
                "Chair: $1000.92, Stock: 18\n" +
                "Doll: $1343.0, Stock: 43\n";

        assertEquals(expected, result.toString());
    }

    @Test
    public void testProcessProducts1b() {
        List<Product> products = Methods.getProducts();

        // TODO - implement predicate that filters products having Clothing category
        Predicate<Product> clothingProducts =p -> p.getCategory().equals("Clothing");

        // TODO - implement Consumer that concatenates attributes of Product to StringBuilder as below format:
        //  Product name: Product name,
        //  Example: Desk: T-Shirt,
        StringBuilder result = new StringBuilder();
        Consumer<Product> collectProductNames = r -> result.append(r.getProductName()).append(", ");

        Methods.processProducts(products, clothingProducts, collectProductNames);

        String expected = "T-Shirt, Jacket, T-Shirt, Keyboard, Desk, Jeans, Novel, Jacket, Action Figure, T-Shirt, T-Shirt, Jeans, Jacket, ";

        assertEquals(expected, result.toString());
    }

    @Test
    public void testProcessProducts1c() {
        List<Product> products = Methods.getProducts();

        // TODO - implement predicate that filters products that has stock quantity more than 200
        Predicate<Product> highStockProducts = p -> p.getStockQuantity()>200;

        // TODO - implement Consumer that concatenates attributes of Product to StringBuilder as below format:
        //  Product name: $Price, Stock: stock number
        //  Example: Desk: $1489.94, Stock: 208
        StringBuilder result = new StringBuilder();
        Consumer<Product> printProductDetails = x -> result.append(x.getProductName()).append(": $").append(x.getPrice()).append(", Stock: ").append(x.getStockQuantity()).append("\n");

        Methods.processProducts(products, highStockProducts, printProductDetails);

        String expected ="Monitor: $699.94, Stock: 245\n" +
                "Desk: $588.47, Stock: 239\n" +
                "Desk: $1489.94, Stock: 208\n" +
                "T-Shirt: $47.98, Stock: 231\n" +
                "Doll: $1395.92, Stock: 244\n" +
                "Magazine: $382.07, Stock: 300\n" +
                "Tablet: $1010.29, Stock: 278\n" +
                "Textbook: $1199.81, Stock: 261\n" +
                "Novel: $973.48, Stock: 228\n" +
                "Keyboard: $1318.66, Stock: 248\n" +
                "Jeans: $75.56, Stock: 267\n" +
                "Puzzle: $1060.5, Stock: 231\n" +
                "Lamp: $945.27, Stock: 212\n" +
                "Mouse: $686.93, Stock: 283\n" +
                "Lamp: $183.1, Stock: 239\n" +
                "Magazine: $838.03, Stock: 255\n" +
                "Keyboard: $253.75, Stock: 256\n" +
                "T-Shirt: $71.18, Stock: 296\n" +
                "Laptop: $987.13, Stock: 269\n" +
                "Jacket: $274.48, Stock: 269\n";

        assertEquals(expected, result.toString());
    }

    @Test
    public void testProcessProducts2a(){
        // TODO - implement predicate that filters products having Electronics category
        Predicate<Product> electronicsCategoryCondition = p -> p.getCategory().equals("Electronics");

        // TODO - implement Function that converts product name to upper case and returns it
        Function<Product, String> productNameToUpperCase = pr -> pr.getProductName().toUpperCase();

        List<String> result = Methods.processProducts(Methods.getProducts(), electronicsCategoryCondition, productNameToUpperCase);

        for (String s : result) {
            System.out.println(s);
        }

        List<String> expected = new ArrayList<>();
        expected.add("MONITOR");
        expected.add("LAPTOP");
        expected.add("MONITOR");
        expected.add("LAPTOP");
        expected.add("KEYBOARD");
        expected.add("KEYBOARD");
        expected.add("MOUSE");
        expected.add("SMARTPHONE");
        expected.add("MOUSE");
        expected.add("MOUSE");
        expected.add("KEYBOARD");
        expected.add("LAPTOP");
        expected.add("Average Price: 812.18");

        assertEquals(expected, result);
    }

    @Test
    public void testProcessProducts2b() {

        // TODO - implement predicate that filters products having Clothing category
        Predicate<Product> condition = p -> p.getCategory().equals("Clothing");

        // TODO - implement Function that concatenates product name and price as below format:
        //  Product name: $Price
        //  Example: T-Shirt - $974.46
        Function<Product, String> function = p-> p.getProductName()+" - $"+ p.getPrice();

        List<String> result = Methods.processProducts(Methods.getProducts(), condition, function);
        assertEquals(14, result.size());
        System.out.println(result);

        assertEquals("T-Shirt - $974.46", result.get(0));
        assertEquals("Jacket - $1338.63", result.get(1));
        assertEquals("T-Shirt - $47.98", result.get(2));
        assertEquals("Keyboard - $1205.64", result.get(3));
        assertEquals("Desk - $1139.07", result.get(4));
        assertEquals("Jeans - $75.56", result.get(5));
        assertEquals("Novel - $925.03", result.get(6));
        assertEquals("Jacket - $1153.81", result.get(7));
        assertEquals("Action Figure - $355.2", result.get(8));
        assertEquals("T-Shirt - $50.53", result.get(9));
        assertEquals("T-Shirt - $71.18", result.get(10));
        assertEquals("Jeans - $208.78", result.get(11));
        assertEquals("Jacket - $274.48", result.get(12));
    }

    @Test
    public void testProcessProducts3a() {
        List<Product> products = Methods.getProducts();
        double priceThreshold = 500.0;

        // TODO - implement BiPredicate that filters products that has price more than provided second parameter
        BiPredicate<Product, Double> expensiveProducts = (pr,threshold) -> pr.getPrice()>threshold;

        // TODO - implement Function that concatenates product name and price as below format:
        //  Product name: $Price
        //  Example: T-Shirt - $974.46
        StringBuilder sb = new StringBuilder();
        Function<Product, String> productInfo = p -> p.getProductName()+": $"+p.getPrice();
        List<String> result = Methods.processProducts(products, priceThreshold, expensiveProducts, productInfo);

        System.out.println(result);
        List<String> expectedResult= Arrays.asList("Monitor: $699.94, T-Shirt: $974.46, Desk: $588.47, Desk: $1489.94, Doll: $681.97, Jacket: $1338.63, Laptop: $1216.56, Board Game: $1388.17, Action Figure: $1343.51, Doll: $1395.92, Tablet: $1010.29, Keyboard: $1205.64, Magazine: $537.9, Textbook: $1199.81, Novel: $973.48, Desk: $1139.07, Keyboard: $1318.66, Keyboard: $771.58, Action Figure: $706.13, Puzzle: $1060.5, Mouse: $1095.81, Novel: $925.03, Jacket: $1153.81, Lamp: $945.27, Board Game: $1472.72, Tablet: $766.37, Smartphone: $933.88, Textbook: $1310.31, Mouse: $686.93, Magazine: $575.46, Magazine: $838.03, Mouse: $1174.32, Chair: $1000.92, Doll: $1343.0, Laptop: $987.13, Average Price: 1035.7034285714287".split(", "));

        assertEquals(result.toString(),expectedResult.toString());
    }
    @Test
    public void testProcessProducts3b() {
        List<Product> products = Methods.getProducts();
        double stockQuantityThreshold = 100.0;

        // TODO - implement BiPredicate that filters products that has stockQuantity more than provided second parameter and in Electronics category
        BiPredicate<Product, Double> stockPredicate = (x,y) -> x.getCategory().equals("Electronics") && x.getStockQuantity()>y;

        // TODO - implement Function that concatenates product name and quantity as below format:
        //  Product name: quantity in stock
        //  Example: Monitor: 245 in stock
        Function<Product, String> productInfoByStock = p -> p.getProductName()+": "+ p.getStockQuantity()+" in stock";

        List<String> result = Methods.processProducts(products, stockQuantityThreshold, stockPredicate, productInfoByStock);
        System.out.println(result);

        List<String> expectedResult= Arrays.asList("Monitor: 245 in stock, Monitor: 127 in stock, Keyboard: 248 in stock, Mouse: 123 in stock, Smartphone: 135 in stock, Mouse: 283 in stock, Mouse: 166 in stock, Keyboard: 256 in stock, Laptop: 269 in stock, Average Price: 841.7977777777778".split(", "));
        assertEquals(result.toString(),expectedResult.toString());

    }

}
