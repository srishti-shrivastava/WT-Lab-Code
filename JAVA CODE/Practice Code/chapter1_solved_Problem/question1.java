import java.util.Scanner;

/**
 * question1
 */
public class question1 {

    public static void main(String[] args) {
        int num1 , num2;
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter two values");
        num1=obj.nextInt();
        num2=obj.nextInt();
        System.out.println("The values are" +num1+" "+num2);
        System.out.println("The sum of two values =" +(num1+num2));
        System.out.println("The sub of two values =" +(num1-num2));
        System.out.println("The multiply of two values =" +(num1*num2));
        System.out.println("The division of two values =" +(num1/num2));
        obj.close();

    }
}
