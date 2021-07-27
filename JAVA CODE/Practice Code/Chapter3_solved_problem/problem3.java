import java.util.Scanner;

/**
 * problem3
 */
public class problem3 {

    public static void main(String[] args) 
    {
        String empname;
        int exp;
        float salary;

        Scanner inp= new Scanner(System.in);
        System.out.println("Enter employee name");
        empname=inp.nextLine();
        System.out.println("Enter employee expriences");
        exp=inp.nextInt();
        System.out.println("Enter employee salary");
        salary=inp.nextFloat();

        if(exp>=15)
        {
            if(salary>=8000)
            {
                System.out.println("Employee name="+empname);
                System.out.println("Experience="+exp);
                System.out.println("Salary="+salary+1500);

            }
        }
        else
        {
            if(salary>=6000)
            {
                System.out.println("Employee name="+empname);
                System.out.println("Experience="+exp);
                System.out.println("Salary="+salary+1000);

            }
        }
        inp.close();


    }
    
}