package exceptionprictice;

public class ErrorPractice {
    // method will call itself internally called as method recursion
    public static void method(){
        System.out.println("Running method");
        method();
    }

    public static void main(String[] args) {
        //try{
            method();
//        }catch (StackOverflowError e){
//            System.out.println("there was an error");
//        }



    }


}
