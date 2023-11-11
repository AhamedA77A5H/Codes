public class MultidimensionalArrays
{
    public static void main(String[] args)
    {
        int [][] grid =
                {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                };
        /* Access elements in the array */
        int value = grid [1][2]; /* Retrieves the value 6 (row 1, col 2) */

        /* Iterate through the 2D array and print its comments */
        for (int row = 0; row < grid.length; row++)
        {
            for (int col = 0; col < grid[row].length; col++)
            {
                System.out.println(grid[row][col] + " ");
            }
            System.out.println();
        }
    }
}
