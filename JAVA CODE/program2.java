import java.util.Scanner;

/**
 * program2
 */
public class program2 {

    public static void main(String[] args) {
        String name;
        int age;
        double salary;
        char sex;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        name=sc.nextLine();
        System.out.println("Enter your age");
        age=sc.nextInt();
        System.out.println("Enter y0ur salary");
        salary=sc.nextDouble();
        System.out.println("Enter M for Male and F for Female");
        sex=sc.next().charAt(0);
        System.out.println("The Employees Details are:");
        System.out.println("----------------------");
        System.out.println("The Employees  Name:"+name);
        System.out.println("The Employees  Age:"+age);
        System.out.println("The Employees  Salary:"+salary);
        System.out.println("The Employees  Sex:"+sex);
        sc.close();



    }
}