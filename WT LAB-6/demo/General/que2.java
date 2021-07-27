package General;
import java.util.Scanner;

public class que2 {
    protected int eid;
    private String ename;
    public int basic;
    
    public void get() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id : ");
        eid = sc.nextInt();
        System.out.println("Enter ename : ");
        ename = sc.next();
        System.out.println("Enter salary : ");
        basic = sc.nextInt();
        sc.close();
    }
    
    public void earnings()
    {
        System.out.println("Salary : " + basic + ((80/100)*basic) + ((15/100)*basic));
    }
    
    public void put() {
        System.out.println("ID : " + eid);
        System.out.println("Employee name : " + ename);
        System.out.println("Salary : " + basic);
    }
}


