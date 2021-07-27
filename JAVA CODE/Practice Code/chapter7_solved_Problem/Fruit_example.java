class Fruit
{
    String color;
    String name;
    public void fruitdetails(String name,String color)
    {
        System.out.println("Name of the fruits:="+name);
        System.out.println("Color of the fruits:="+color);
    }
}

class Apple extends Fruit
{
    String benefit="GOOD FOR HEART";
    public void printdetail()
    {
        System.out.println("Health Benefit:"+benefit);
    }
}

public class Fruit_example {
    public static void main(String[] args) {
        Apple obj=new Apple();
        obj.fruitdetails("Ooty Apple"," red Yellow");
        obj.printdetail();
    }
}
