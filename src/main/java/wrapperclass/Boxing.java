package wrapperclass;

public class Boxing {
    public static void main(String[] args) {

        // AUTOBOXING - when we convert primitive type of variable into Wrapper type of variable
        int num = 5;
        // primitive -> wrapper
        Integer numWrapper = num;


        // UNBOXING - when we convert Wrapper type of variable into primitive type of variable
        Integer number = 10;
        // Wrapper -> Primitive
        int numberPrimitive = number;
    }


}
