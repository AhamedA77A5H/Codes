public class Return
{
    public static void main(String[] args)
    {
        int[] array = {1, 2, 3, 4, 5};
        int target = 3;
        findValue(array, 3);
    }
    public static void findValue (int [] array, int target)
    {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == target)
            {
                //Value found, return of perform some action
                System.out.println("target = " + target);
                System.out.println("i = " + i);
                return;
            }
        }
    }

}