import java.util.Scanner;

/**
 * question3
 */
public class question3 {

    public static void main(String[] args) {
        int a,b,c,x;
        Scanner objScanner = new Scanner(System.in);
        System.out.println("Enter three value:");
        a=objScanner.nextInt();
        b=objScanner.nextInt();
        c=objScanner.nextInt();
        x =((a/(b+c)));
        System.out.println("a=" +a);
        System.out.println("b=" +b);
        System.out.println("c=" +c);
        System.out.println("x =" +x);
        objScanner.close();
        
        
    }
}