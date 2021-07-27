import java.util.Scanner;

/**
 * question2
 */
public class question2 {

    public static void main(String[] args) {
        int hour,wages;
        Scanner s1= new Scanner(System.in);
        System.out.println("Enter the number of hours");
        hour=s1.nextInt();
        System.out.println("Enter the wages");
        wages=s1.nextInt();
        System.out.println(" the number of hours worked=" +hour);
        System.out.println("the wages=" +wages);
        System.out.println("The Gross pay="+(hour*wages));
        s1.close();
    }
}