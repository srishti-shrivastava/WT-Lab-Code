import java.util.Scanner;

/**
 * problem2
 */
public class problem2 {

    public static void main(String[] args) {
        int number;
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a number to check for odd or even");
        number=inp.nextInt();

        if(number %2 ==0)
        {
            System.out.println("The Given number is EVEN");
        }
        else
        {
            System.out.println("The Given number is ODD");
        }
        inp.close();
    }
}