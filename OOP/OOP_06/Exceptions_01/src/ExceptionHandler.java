public class ExceptionHandler 
{
    public static void main(String[] args) 
    {

        try {
            int result = divide(10,0);
            System.out.println("Result:" + result);
        } catch (ArithmeticException e) {
            System.out.println("An arithmetic error  is occurred:" + e.getMessage());

        }
    }

    public static int divide(int dividend, int divisor) 
    {
        if (divisor == 0) {
            throw new ArithmeticException("Division by Zero is not allowed.");
        }
        return dividend / divisor;
    }
}
