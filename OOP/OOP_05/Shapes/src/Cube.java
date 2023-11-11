public class Cube extends Shape3D
{
    private double length;
    public Cube(double length)
    {
        this.length = length;
    }
    public double getLength()
    {
        return length;
    }
    public void setLength(double length)
    {
        this.length = length;
    }
    @Override
    public double calculateVolume()
    {
        double volume = Math.pow(length, 3);
        return volume;
    }
    public double calculateSurfaceArea()
    {
        double area = 6 * Math.pow(length, 2);
        return area;
    }
}
