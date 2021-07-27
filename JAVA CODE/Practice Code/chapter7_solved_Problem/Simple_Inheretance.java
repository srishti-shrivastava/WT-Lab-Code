class Vehicle
{
    String brandname;
    double price;
    public  void PrintVehicle() 
    {
        System.out.println("Vehicle Details");
        System.out.println(" Brand of Vehicle:"+brandname);
        System.out.println(" Price of Vehicle:"+price);
    }
}

class Car extends Vehicle
{
    String fuelType;
    String color;
    public void PrintCardDetails()
    {
        System.out.println("Car Details");
        System.out.println("Car FuelType:"+fuelType);
        System.out.println("Car Color:"+color);

    }
}
public class Simple_Inheretance 
{
    public static void main(String[] args) 
    {
        Car obj=new Car();
        obj.brandname="BMW";
        obj.price=399999.0;
        obj.fuelType="petrol";
        obj.color="Red";
        //obj.PrintVehicle();
        obj.PrintCardDetails();

        
    }
    
}
