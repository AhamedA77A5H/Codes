public class RelationalOperator
{
    public static void main(String[] args)
    {
        int x = 5, y = 5;
        int a = 7, b = 3;
        int p = 10, q = 5;
        int m = 5, n = 10;
        int r = 7, s = 7;
        int c = 5, d = 8;

        boolean result_xy = x==y; //Equal
        boolean result_ab = a != b; //Not equal
        boolean result_pq = p > q; //Greater than
        boolean result_mn = m < n; //Less than
        boolean result_rs = r >= s;
        boolean result_cd = c <= d;

        System.out.println("Result xy = " + result_xy);
        System.out.println("Result ab = " + result_ab);
        System.out.println("Result pq = " + result_pq);
        System.out.println("Result mn = " + result_mn);
        System.out.println("Result rs = " + result_rs);
        System.out.println("Result cd = " + result_cd);
    }
}
