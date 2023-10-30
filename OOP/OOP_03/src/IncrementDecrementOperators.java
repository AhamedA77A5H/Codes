public class IncrementDecrementOperators
{
    public static void main(String[] args)
    {
        int  x = 5, y = ++x; // Prefix Increment (++#)
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int a = 5, b = a++; // Postfix Increment (#++)
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int m = 10, n = --m; // Prefix Decrement (--#)
        System.out.println("m = " + m);
        System.out.println("n = " + n);

        int p = 10, q = p--; // Postfix Decrement (#--)
        System.out.println("p = " + p);
        System.out.println("q = " + q);

    }
}
