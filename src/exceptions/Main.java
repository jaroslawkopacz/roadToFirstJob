package exceptions;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello");
//        throw new RuntimeException();
        Calculator calculator = new Calculator();
        int divide = 0;
        try {
            divide = calculator.divide(4, 0);
        } catch (DivideByZeroException e) {
            e.printStackTrace();
        }
        System.out.println(divide);
    }
}
