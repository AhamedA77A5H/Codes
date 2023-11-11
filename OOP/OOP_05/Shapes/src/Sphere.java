public class Sphere extends Shape3D
{
    private double radius;
    public Sphere(double radius)
    {
        this.radius = radius;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    @Override
    public  double calculateVolume()
    {
        double volume = (double) 4 / 3 * Math.PI * Math.pow(radius, 3);
        return volume;
    }
    public  double calculateSurfaceArea()
    {
        double area = 4 * Math.PI * Math.pow(radius, 2);
        return area;
    }
}
