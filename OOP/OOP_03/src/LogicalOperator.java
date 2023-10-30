public class LogicalOperator
{
    public static void main(String[] args)
    {
        boolean a = true, b = false;
        boolean x = true, y = false;
        boolean isSunny = true;
        boolean p = true, q = false;
        boolean m = true, n = false;

        boolean result_ab = a && b; // Logical AND (&&)
        boolean result_xy = x || y; // Logical OR (||)
        boolean isRainy = !isSunny; // Logical NOT (!)
        boolean result_pq = p ^ q; // Logical XOR (^)
        boolean result_mn_isEqual = m == n; // Logical Equality (==)
        boolean result_mn_isNotEqual = m != n; // Logical Inequality (!=)

        System.out.println("Result ab = " + result_ab);
        System.out.println("Result xy = " + result_xy);
        System.out.println("Is it rainy = " + isRainy);
        System.out.println("Result pq = " + result_pq);
        System.out.println("Result m == n = " + result_mn_isEqual);
        System.out.println("Result m != n = " + result_mn_isNotEqual);
    }
}
