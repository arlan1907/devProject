package Methods2;

public class InvestMoney {
    public static void main(String[] args) {
        // Initial investment
        double principal = 100.0;

        // Annual interest rate
        double annualInterestRate = 0.04;

        // Number of years
        int years = 5;

        // Calculate total amount after 5 years
        double totalAmount = principal;
        for (int i = 0; i < years; i++) {
            totalAmount += totalAmount * annualInterestRate;
        }

        // Calculate total gain
        double totalGain = totalAmount - principal;

        // Print the total gain
        System.out.println("Total gain after 5 years: $" + totalAmount);

        System.out.println(getTotalWithProfit(100, 5, 4));


        String name = "Arslan Nurlyyev";

        System.out.println(name.substring(name.lastIndexOf(' ')));

    }

    public static int getProfit(int amount, int years, int rate){
        return amount*years*rate/100;
    }

    public static int getTotalWithProfit(int amount, int years, int rate){
        return getProfit(amount, years, rate)+amount;
    }


}
