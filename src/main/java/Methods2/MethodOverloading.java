package Methods2;

public class MethodOverloading {

    public int getSum(int a, int b){
        return a+b;
    }

    public int getSum(int[] num1){
        int sum = 0;
        for (int i = 0; i < num1.length; i++) {
            sum +=num1[i];
        }
        return sum;
    }

    public double getSum(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        MethodOverloading mthOver = new MethodOverloading();
        System.out.println(mthOver.getSum(1,2));
        int[] num = {1,2,3,4};
        System.out.println(StaticMethods.getAverage(num));
        System.out.println(mthOver.getSum(num));
    }

}
