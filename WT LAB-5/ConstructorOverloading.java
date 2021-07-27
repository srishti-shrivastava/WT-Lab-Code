class shapes
{
    int a,r;
    double area;
    public void calculate()
    {
        System.out.println("Area of circle and square and rectangle");
    }
}

class circle extends shapes
{
    final double pi=3.14;
    circle(int r)
    {
        this.r=r;
    }
    public void calculate(int r)
    {
        area=pi*r*r;
        System.out.println("Area of circle :=" +area);
    }
}

class square extends shapes
{
    
    square(int a)
    {
        this.a=a;
    }
    public void calculate(int a)
    {
        area=a*a;
        System.out.println("Area of square :=" +area);
    }
}

public class ConstructorOverloading
{
    public static void main(String[] args) {
        circle obj=new circle(3);
        obj.calculate();
        obj.calculate(obj.r);
        square s= new square(4);
        s.calculate(s.a);
    }
}