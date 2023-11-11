public class Main 
{
    public static void main(String[] args)
    {
        Box b = new Box(5, 5, 5);
        int volume = b.calculateVolume(b.getWidth(), b.getHeight(),b.getLength());
        System.out.println(volume);

    }
}