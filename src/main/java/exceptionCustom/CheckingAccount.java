package exceptionCustom;

public class CheckingAccount extends BankAccount{

    @Override
    public void makeTransaction(int amount) throws InsufficientFundsExceptions{
        if(amount<20000 && amount>0){
            if(balance>=amount){
                balance-=amount;
            }else {
                throw new InsufficientFundsExceptions("Checking account doesn't have enough balance to make transaction");
            }
        }else {
            throw new BigAmountTransactionException("Your account is locked. Call the bank.");
        }
    }
}
