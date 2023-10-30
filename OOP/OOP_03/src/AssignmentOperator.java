public class AssignmentOperator
{
    public static void main(String[] args)
    {
        int y = 10;
        y += 2; // Addition Assignment (+=)
        System.out.println("y = " + y);

        int z = 15;
        z -= 4; // Subtraction Assignment (-=)
        System.out.println("z = " + z);

        int a = 7;
        a *= 3; // Multiplication Assignment (*=)
        System.out.println("a = " +a);

        int b = 20;
        b /= 5 ; // Division Assignment (/=)
        System.out.println("b = " + b);

        int c = 17;
        c %= 3; // Modulus Assignment (%=)
        System.out.println("c = " + c);

        int flags = 12;
        flags &= 5; // Bitwise AND Assignment (&=)
        System.out.println("flags =  " + flags);

        int permissions = 4;
        permissions |= 2; // Bitwise OR Assignment (|=)
        System.out.println("permissions = " + permissions);

        int data = 9;
        data ^= 6; // Bitwise XOR Assignment (^=)
        System.out.println("data = " + data);

    }
}
