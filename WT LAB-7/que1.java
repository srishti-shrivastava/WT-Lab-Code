import java.util.Scanner;

 interface Data {
    public double earning();
    public double deduction();
    public double bonus();
}
class Manager implements Data {
    double basic;

    public Manager(double basic) {
        this.basic = basic;
    }

    @Override
    public double earning() {
       double earnings = basic + (.8* basic) +  (1.5* basic);
       return earnings;
    }

    @Override
    public double deduction() {
        double deduction= 1.2*basic;
        return deduction;
    }

    @Override
    public double bonus() {
        return 0;
    }


}
  class SubStaff extends Manager {
    public SubStaff(double basic) {
        super(basic);
    }

    @Override
    public double bonus() {
        basic =.5 * basic;
        return basic;
    }
}

public class que1{
    public static void main(String[] args)  {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the basic Salary: ");
        double basic=scanner.nextDouble();
	    SubStaff subStaff=new SubStaff(basic);

        System.out.println("Earning:-"+subStaff.earning());
        System.out.println("Deduction:-"+subStaff.deduction());
        System.out.println("Bonus:-"+subStaff.bonus());
        scanner.close();
    }
}
