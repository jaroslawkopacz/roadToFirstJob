package exceptions;

public class Calculator {
    public int divide(int a, int b) throws DivideByZeroException {
        try{
            return a / b;
        } catch (ArithmeticException exception){
            throw new DivideByZeroException("Nie dziel przez 0!", exception);
        } finally {
            System.out.println("Miłego dnia");
        }
    }
}

