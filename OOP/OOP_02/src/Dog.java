public class Dog extends Animal
{
    // methods and fields of Animals
    // methods and fields of Dog

    public void display()
    {
        System.out.println("My name is " + name);
    }
    @Override
    public void eat()
    {
        System.out.println("I eat Dog Food");
    }

    public void makeNoise()
    {
        System.out.println("I can Bark");
    }
}