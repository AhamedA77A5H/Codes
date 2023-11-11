public class Box {

    private int width;
    private int height;
    private int length;

    public Box() {
    }

    public Box(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int calculateVolume(int width, int height, int length)
    {
        int volume = width * height * length;
        return volume;
    }

    public static void main(String[] args)
    {
        Box b= new Box(3,4,5);
        int volume = b.calculateVolume(b.width, b.height,b.length);
        System.out.println(volume);
    }
}
