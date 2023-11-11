public class LoopLabel
{
    public static void main(String[] args)
    {
        outerLoop:
        for (int i = 0; i < 3; i++)
        {
            innerLoop:
            for (int j = 0; j < 3; j++)
            {
                if (i * j == 4)
                {
                    break outerLoop;
                }
                System.out.println("i = " + i + " j = " + j);
            }
        }
    }
}
