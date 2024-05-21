public class MulticCatchExample 
{
    public static void main(String[] args) 
    {

        try 
        {
            int[] numbers = {1, 2, 3};
            @SuppressWarnings("unused")
            int result = numbers[5] / 0;

        } 
        catch(ArrayIndexOutOfBoundsException |ArithmeticException e)
        {
            System.out.println("An error occurred:" + e.getMessage());
        }
   }
}