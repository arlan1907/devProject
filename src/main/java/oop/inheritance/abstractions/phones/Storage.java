package oop.inheritance.abstractions.phones;

public interface Storage extends CloudStorage{

    int PHONEMEMORY=256;

    // abstract
    String upload();


    //static
    public static String share(){
        return "Memory is sharing...";
    }

    //regular
    public default String delete(){
        return "Memory is deleting...";
    }
}
