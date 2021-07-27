import java.util.Scanner;

public class Students {
    String name;
    int roll;
    String branch;
    String section;
    String university;
    float CGPA;
    float SGPA;
    int[] marks=new int[5];

    void SetData(String name, int roll, String branch, String section, String university, float CGPA, float SGPA,
                 int[] marks) {
        this.name = name;
        this.roll = roll;
        this.branch = branch;
        this.section = section;
        this.university = university;
        this.CGPA = CGPA;
        this.SGPA = SGPA;
        this.marks = marks;
    }

    void displaydata(){
        System.out.println("Name: " + name + "\nRoll: "+ roll + "\nBranch: "+ branch+"\nSection: "+ section+"\nUniversity" +
                university+"\nCGPA: " +CGPA+ "\nSGPA: "+ SGPA);
        for (int i=0;i<5;i++){
            System.out.println("\n Marks in Subject " + i+1 + " = " + marks[i]);
        }

    }
    int getTotal(){
        int totalMarks=0;
        for (int i=0;i<5;i++){
            totalMarks=totalMarks+marks[i];
        }
        return totalMarks;
    }

    void getAvg(){
        System.out.println("\nAverage = "+ getTotal()/5);
    }

    public static void main(String[] args) {
        Students st = new Students();
        String name;
        int roll;
        String branch;
        String section;
        String university;
        float CGPA;
        float SGPA;
        int[] marks=new int[5];

        Scanner scanner=new Scanner(System.in);

        name=scanner.nextLine();
        branch=scanner.nextLine();
        section=scanner.nextLine();
        university=scanner.nextLine();
        roll=scanner.nextInt();
        CGPA=scanner.nextFloat();
        SGPA=scanner.nextFloat();
        for (int i=0;i<5;i++){
            marks[i]=scanner.nextInt();
        }

        st.SetData(name,roll,branch,section,university,CGPA,SGPA,marks);
        st.displaydata();
        st.getAvg();

        scanner.close();
    }
    
    
}
