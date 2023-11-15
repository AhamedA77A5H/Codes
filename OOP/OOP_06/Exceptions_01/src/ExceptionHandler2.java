import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionHandler2 
{
    public static void main(String[] args) 
    {
        File file = new File("example txt");

        try {
            Scanner sacnner = new Scanner(file);
            while (sacnner.hasNextLine()){
                System.out.println(sacnner.nextLine());
            }
            sacnner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not found:"+e.getMessage());
        }
    }
}