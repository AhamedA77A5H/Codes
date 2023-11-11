public class Main {
    public static void main(String[] args)
    {
        Shape3D sphere = new Sphere(5);
        Shape3D cube = new Cube(5);

        System.out.println("Volume of the Sphere is : " + sphere.calculateVolume() + "\nArea of the Sphere is : " + sphere.calculateSurfaceArea());
        System.out.println("Volume of the Cube is : " + cube.calculateVolume() + "\nArea of the Cube is : " + cube.calculateSurfaceArea());
    }
}