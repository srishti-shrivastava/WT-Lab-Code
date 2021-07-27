import java.util.Scanner;

/**
 * que1
 */
public class Student {
    String name;
    int roll;
    String branch;
    String section;
    String university;
    float CGPA;
    float SGPA;

    void getdata(String name, int roll, String branch, String section, String university, float CGPA, float SGPA) {
        this.name = name;
        this.roll = roll;
        this.branch = branch;
        this.section=section;
        this.university = university;
        this.CGPA = CGPA;
        this.SGPA = SGPA;
    }

    void display_data() {
        System.out.println("Name:" + name + "\nRoll:" + roll + "\nBranch: " + branch + "\nUniversity: " + university
                + "\nCGPA: " + CGPA + "\nSGPA:" + SGPA);
    }

    public static void main(String[] args) {
        Student st = new Student();
        String name;
        int roll;
        String branch;
        String section;
        String university;
        float CGPA;
        float SGPA;

        Scanner sc = new Scanner(System.in);

        name = sc.nextLine();
        branch = sc.nextLine();
        section = sc.nextLine();
        university = sc.nextLine();
        roll = sc.nextInt();
        CGPA = sc.nextFloat();
        SGPA = sc.nextFloat();

        st.getdata(name, roll, branch, section, university, CGPA, SGPA);
        st.display_data();

        sc.close();

    }
}
