class Shirt
{
    String color;
    String size;
    String style;
    double price;
    
    public void changePrice()
    {
        System.out.println("Change Price");
    }
}

class Sales_Person
{
    String name;
    String address;
    String phone;
    double salary;
    
    public void stock_item()
    {
        System.out.println("Item stocked");
    }
    public void sell_item()
    {
        System.out.println("Item sold");
    }
    
}

public class MyFirstJavaProgram 
{
   public static void main(String []args)
   {
       Shirt shirt = new Shirt();
       shirt.changePrice();
       Sales_Person sales_person = new Sales_Person();
       sales_person.stock_item();
       sales_person.sell_item();
   }   
}