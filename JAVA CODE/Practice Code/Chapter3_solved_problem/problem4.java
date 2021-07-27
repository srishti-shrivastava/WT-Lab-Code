import java.util.Scanner;

/**
 * problem4
 */
public class problem4 {

    public static void main(String[] args) {
        String name;
        int mark;
        Scanner inp= new Scanner (System.in);
        name=inp.nextLine();
        System.out.println("Enter Student Marks");
        mark=inp.nextInt();
        if(mark>=80)
        {
            System.out.println("Student Name="+name);
            System.out.println("Student Mark="+mark);
            System.out.println("Secured=DISTINCTION");
        }
        else if(mark>=60)
        {
            System.out.println("Student Name="+name);
            System.out.println("Student Mark="+mark);
            System.out.println("Secured=FIRST CLASS");
        }
        else if(mark>=50)
        {
            System.out.println("Student Name="+name);
            System.out.println("Student Mark="+mark);
            System.out.println("Secured=SECOND CLASS");
        }
        else if(mark>=40)
        {
            System.out.println("Student Name="+name);
            System.out.println("Student Mark="+mark);
            System.out.println("Secured=THIRD CLASS");
        }
        else if(mark>=60)
        {
            System.out.println("Student Name="+name);
            System.out.println("Student Mark="+mark);
            System.out.println("Secured=UNSUCCESSFUL");
        }
        inp.close();
    }
}