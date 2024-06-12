package oop.inheritance.abstractions.phones;

import java.util.List;

public class Iphone extends Phone{

    @Override
    public String takePhoto() {
        return "Iphone is taking photo";
    }

    @Override
    public String call() {
        return "Iphone is calling";
    }

    @Override
    public String text() {
        return "Iphone is texting";
    }

    @Override
    public String upload() {
        return "Iphone is uploading to memory";
    }

}
