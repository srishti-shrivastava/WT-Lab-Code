import java.util.Scanner;

class que1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter first value and difference for the loop and max. value upto which you want the loop to run");

        int first_val = sc.nextInt();
        int difference = sc.nextInt();
        int n = sc.nextInt();
        for (int i = first_val; i < n; i = i + difference)
            System.out.println(i);

            sc.close();
    }

}