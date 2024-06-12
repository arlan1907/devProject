package exceptionCustom;

public class BigAmountTransactionException extends RuntimeException{
    public BigAmountTransactionException(String message){
        super(message);
    }
}
