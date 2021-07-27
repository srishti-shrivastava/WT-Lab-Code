import java.util.Scanner;

public class Employee {
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

    void displayData(){
        System.out.println("Name: " + name + "\nEmployeeId: "+ EmployeeId + "\nCompanyName: "+ CompanyName +
                "\nSalary: "+ salary);
    }
    public static void main(String[] args) {

        Employee employee = new Employee();
        String name;
        int EmployeeId;
        long salary;
        String CompanyName;

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter Name: ");
        name = scanner.nextLine();
        System.out.println("\nEnter Company: ");
        CompanyName = scanner.nextLine();
        System.out.println("\nEnter id: ");
        EmployeeId = scanner.nextInt();
        System.out.println("\nEnter Salary: ");
        salary = scanner.nextLong();

        employee.SetData(name, EmployeeId, salary, CompanyName);
        employee.displayData();
        scanner.close();
    }
    
}
