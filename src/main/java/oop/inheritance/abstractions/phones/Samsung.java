package oop.inheritance.abstractions.phones;

public class Samsung extends Phone{
    @Override
    public String takePhoto() {
        return "Samsung is taking photo";
    }

    @Override
    public String call() {
        return "Samsung is calling";
    }

    @Override
    public String text() {
        return "Samsung is texting";
    }

    @Override
    public String upload() {
        return "Samsung is uploading to memory";
    }
}
