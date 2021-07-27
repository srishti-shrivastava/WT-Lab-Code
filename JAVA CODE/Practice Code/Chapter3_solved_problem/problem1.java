import java.util.Scanner;

/**
 * problem1
 */
public class problem1 {

    public static void main(String[] args) {
        int purchase;
        Scanner inp=new Scanner(System.in);
        
        System.out.println("Enter the purchased amount");
        purchase=inp.nextInt();

        if(purchase>=5000)
        {
            System.out.println(" Purchased amount="+purchase);
            System.out.println(" Discount="+purchase*.1);
            System.out.println(" Amount to be payed="+(purchase-(purchase*.1)));
            inp.close();
        }
    }
}