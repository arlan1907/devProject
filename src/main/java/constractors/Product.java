package constractors;

public class Product {

    String picture;
    String name;
    int rate;
    double price;
    boolean freeShipping;
    String department;

    public Product(String picture, String name, int rate, double price, boolean freeShipping, String department) {
        this.picture = picture;
        this.name = name;
        this.rate = rate;
        this.price = price;
        this.freeShipping = freeShipping;
        this.department = department;
    }

    public Product(String name, int rate, double price) {
        this.name = name;
        this.rate = rate;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "picture='" + picture + '\'' +
                ", name='" + name + '\'' +
                ", rate=" + rate +
                ", price=" + price +
                ", freeShipping=" + freeShipping +
                ", department='" + department + '\'' +
                '}';
    }
}
