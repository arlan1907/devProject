package exceptionprictice;

public class StopFinallyBlock {

    public static void main(String[] args) {

        try{
            int num = 5/1;
            System.out.println(num);
//            return; // will stop the execution after finally block
            System.exit(0); // will stop the code without executing the finally block
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {

            System.out.println("in finally block");
        }

        System.out.println("After try catch and finally");
    }

}
