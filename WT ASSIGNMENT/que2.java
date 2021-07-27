import java.util.Random;

class que2 {
    public static void main(String args[]) {
        for (int i = 1; i <= 10; i++) {
            float minimum_value = 0;
            float maximum_value = 1;
            float a = (float) (Math.random() * ((maximum_value - minimum_value)) + minimum_value);

            System.out.println("random value between 0.0 and 1.0 = " + a);

            System.out.print(" the result of coin toss no. " + i + " is = ");
            if (a < 0.5)
                System.out.print("head ");
            if (a > 0.5)
                System.out.print("tails ");
            System.out.println();
            System.out.println();
        }
    }
}