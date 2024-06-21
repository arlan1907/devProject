package collections.queue;

public class Pet {
    private String type;
    private String name;
    private int age;

    public Pet(String type, String name, int age) {
        this.type = type;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
