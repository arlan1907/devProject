package exceptionCustom;

import exceptionCustom.InsufficientFundsExceptions;

public class BankAccount {

    /*
    .deposit(100);
    .makeTransaction(200); - > throw Exception
     */

    int balance;

    public void deposit(int amount){
        balance+=amount;
    }

    public void makeTransaction(int amount) throws InsufficientFundsExceptions {
        if(balance>=amount){
            balance-=amount;
        }else {
            throw new InsufficientFundsExceptions("Not enough balance to make this transaction");
        }
    }

}
