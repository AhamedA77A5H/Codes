public class Main {
    public static void main(String[] args)
    {
        Person person = new Person("Ash", 25);

        {
            System.out.println(person.getName());
            System.out.println(person.getAge());
            double circleArea = MathUnit.PI;
            System.out.println(circleArea);
        }
    }
}