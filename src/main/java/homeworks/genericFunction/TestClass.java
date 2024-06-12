package homeworks.genericFunction;

public class TestClass {
    public static void main(String[] args) {

        Processor processor = new Processor();
        GenericFunction<String> lengthFunction = String::length;

        String result1 = processor.process("Hello, world!", lengthFunction);
        System.out.println(result1);

        String result2 = processor.process("Hi", lengthFunction);
        System.out.println(result2);

        String result3 = processor.process("", lengthFunction);
        System.out.println(result3);

        String result4 = processor.process(null, lengthFunction);
        System.out.println(result4);
    }
}
