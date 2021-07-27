import java.util.Scanner;

public class Employees {
    String name;
    int EmployeeId;
    long salary;
    String CompanyName;

    void SetData(String name, int employeeId, long salary, String companyName) {
        this.name = name;
        this.EmployeeId = employeeId;
        this.salary = salary;
        this.CompanyName = companyName;
    }

    double getGrossSalary(){


        double gross= (salary+salary*0.1+salary*0.9+salary*0.03);

        return gross;
    }

    void getSalary(){
        System.out.println("\nHRA: "+ salary*0.1 + "\nDA: "+ salary*0.9 + "\nTA: " + salary*0.03);
    }


    void displayData(){
        System.out.println("Name: " + name + "\nEmployeeId: "+ EmployeeId + "\nCompanyName: "+ CompanyName +
                "\nSalary: "+ salary);
        getSalary();
        System.out.println("\nGross Salary: "+ getGrossSalary());
    }
        public static void main(String[] args) 
        {
        Employees employee=new Employees();
        String name;
        int EmployeeId;
        long salary;
        String CompanyName;

        Scanner scanner=new Scanner(System.in);
        name=scanner.nextLine();
        CompanyName=scanner.nextLine();
        EmployeeId=scanner.nextInt();
        salary=scanner.nextLong();


        employee.SetData(name,EmployeeId,salary,CompanyName);
        employee.displayData();

        scanner.close();
        }

    
}
