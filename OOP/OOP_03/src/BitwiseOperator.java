public class BitwiseOperator
{
    public static void main(String[] args)
    {
        /* Bitwise AND (&) */
        int a = 5,  b = 3; /* a = 0101 b = 0011 */
        int result_ab = a & b;
        System.out.println("result ab = " + result_ab);

        /* Bitwise OR (|) */
        int x = 6, y = 3;
        int result_xy = x | y;
        System.out.println("result xy = " + result_xy);

        /* Bitwise XOR (^) */
        int m = 5, n = 3;
        int result_mn = m ^ n;
        System.out.println("result mn = " + result_mn);

        /* Bitwise NOT (~) */
        int value = 12;
        int result_value = ~value;
        System.out.println("Result (of Value) = " + result_value);

        /* Left Shift (<<) */
        int number = 8;
        number = number << 2;
        System.out.println("Number = " + number);

    }
}
