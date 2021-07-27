import java.util.Scanner;


class InvalidTimeException extends Exception {
    InvalidTimeException(String s) {
        super(s);
    }
}


public class que2 {

    static void validate(int hr, int min, int sec) throws InvalidTimeException {

        if (sec <= 0 || sec > 60) {
            throw new InvalidTimeException("Seconds Not Valid");
        }

        if (min <= 0 || min > 60) {
            throw new InvalidTimeException("Minutes Not Valid");
        }

        if (hr <= 0 || hr > 24) {
            throw new InvalidTimeException("Hours Not Valid");
        }
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int hr, min, sec;

        hr = scanner.nextInt();
        min = scanner.nextInt();
        sec = scanner.nextInt();

        try {
            validate(hr, min, sec);
        } catch (InvalidTimeException e) {
            System.out.println("Exception occured: " + e);
        }

        scanner.close();
    }

    


}