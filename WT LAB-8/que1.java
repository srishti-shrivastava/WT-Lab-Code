import java.util.Scanner;

class InvalidAgeException extends Exception {

    InvalidAgeException(String s) {
        super(s);
    }
}

public class que1 {


    public static void ElectionVerification() throws InvalidAgeException {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.print("Enter the age:");
        num = scan.nextInt();
        System.out.println();
        if (num < 18) {
            throw new InvalidAgeException("InvalidAgeException");
        } else
            System.out.println("welcome to vote");
            scan .close();
    }

    public static void main(String[] args) {
        try {
            ElectionVerification();
        } catch (Exception e) {
            System.out.println("Exception occured: " + e);
        }

    }

}