package exceptions;

public class DivideByZeroException extends Exception{
    public DivideByZeroException(String message, Throwable cause) {
        super(message, cause);
    }
}
